import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class DictionaryStatistic {
    private String[] words;
    private int dictionarySize; // Количество слов
    private int polindrom; // Количество слов полиндромов
    private int maxWordLength; // Максимальная длина слова в словаре
    private int minWordLength; // Минимальная длина слова в словаре
    private char[] alphabet; // Буквы алфавита
    private int[] frequency; // Частота букв в словаре

    public DictionaryStatistic(String[] words, char[] alphabet) {
        this.words = words;
        this.dictionarySize = words.length;
        this.alphabet = alphabet;
        this.frequency = new int[alphabet.length];
        analyzeDictionary();
    }

    // Анализируем словарь: считаем палиндромы, максимальную/минимальную длину, частоту букв
    private void analyzeDictionary() {
        this.polindrom = 0;
        this.maxWordLength = Integer.MIN_VALUE;
        this.minWordLength = Integer.MAX_VALUE;

        for (String word : words) {
            // Обновляем максимальную и минимальную длину слова
            int length = word.length();
            if (length > maxWordLength) maxWordLength = length;
            if (length < minWordLength) minWordLength = length;

            // Проверяем на палиндром
            if (isPalindrome(word)) {
                polindrom++;
            }

            // Считаем частоту букв
            countLetterFrequency(word);
        }
    }

    // Метод проверки на палиндром
    private boolean isPalindrome(String word) {
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Подсчет частоты букв в слове
    private void countLetterFrequency(String word) {
        for (char c : word.toCharArray()) {
            c = Character.toLowerCase(c); // Игнорируем регистр
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] == c) {
                    frequency[i]++;
                    break;
                }
            }
        }
    }

    // Получить случайное слово из словаря
    public String getRandomWord() {
        Random rand = new Random();
        return words[rand.nextInt(words.length)];
    }

    // Вывод частоты символов
    public void printSymbolsStat() {
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + " - " + frequency[i]);
        }
    }

    // Игра в слова: создание возможных слов из введенного слова
    public List<String> findPossibleWords(String inputWord) {
        List<String> possibleWords = new ArrayList<>();
        Map<Character, Integer> inputLetterCount = getLetterCountMap(inputWord.toLowerCase());

        for (String word : words) {
            Map<Character, Integer> wordLetterCount = getLetterCountMap(word.toLowerCase());

            if (canFormWord(inputLetterCount, wordLetterCount)) {
                possibleWords.add(word);
            }
        }

        return possibleWords;
    }

    // Создание карты количества букв в слове
    private Map<Character, Integer> getLetterCountMap(String word) {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }
        return letterCount;
    }

    // Проверка, можно ли составить слово из набора букв (учитывая частоты букв)
    private boolean canFormWord(Map<Character, Integer> inputLetters, Map<Character, Integer> wordLetters) {
        for (char c : wordLetters.keySet()) {
            if (inputLetters.getOrDefault(c, 0) < wordLetters.get(c)) {
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Считываем слова из файла
            Scanner scanner = new Scanner(new File("/Users/winchester/IdeaProjects/JavaEnjoyer/out/production/JavaEnjoyer/dictionary"));
            List<String> wordsList = new ArrayList<>();

            while (scanner.hasNext()) {
                wordsList.add(scanner.nextLine().trim());
            }
            scanner.close();

            String[] words = wordsList.toArray(new String[0]);
            char[] alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();

            // Создаем объект статистики словаря
            DictionaryStatistic dictionaryStat = new DictionaryStatistic(words, alphabet);

            // Пример работы методов
            System.out.println("Случайное слово из словаря: " + dictionaryStat.getRandomWord());

            System.out.println("\nЧастота символов в словаре:");
            dictionaryStat.printSymbolsStat();

            // Игра в слова
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("\nВведите слово для игры в слова:");
            String inputWord = inputScanner.nextLine().trim();

            List<String> possibleWords = dictionaryStat.findPossibleWords(inputWord);
            System.out.println("Возможные слова из введенного слова:");
            for (String word : possibleWords) {
                System.out.println(word);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
