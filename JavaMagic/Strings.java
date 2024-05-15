import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        StringBuilder bc = new StringBuilder();

        for (int i = 0; i < 5; i ++){
            bc.append(new Random().nextInt(0,50) + 1);
        }
        String str = bc.toString();
        System.out.println("Исходная строка: " + str);
        String str1 = str.replace("1", "i");
        System.out.println("Строка с заменой: " + str1);
        String str2 = str.replace("0", "o");
        System.out.println("Строка с заменой 2: " + str2);
        String str3 = str.replace("6", "b");
        System.out.println("Строка с заменой 3: " + str3);

        boolean str4 = str3.contains("23");
        System.out.println("Содержание подстроки '23': " + str4);

        int str5 = str3.indexOf("ob");
        System.out.println("Индекс подстроки 'ob': " + str5);

        castSpell();
    }

    public static void castSpell() {

        String spell = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        String spell1 = spell.toLowerCase();
        int Random = new Random().nextInt(0,50) + 1;
        String spell2 = spell1.substring(Random);
        System.out.println("Подстрока: " + spell2);

        StringBuilder sb = new StringBuilder();
        sb.append(spell2);
        sb.reverse();
        System.out.println("Перевернутая строка: " + sb);
        char zero = sb.charAt(0);
        char one = sb.charAt(1);
        System.out.println("Нулевой символ: " + zero + " Первый символ: " + one);
        char temp = sb.charAt(0);
        sb.setCharAt(0, sb.charAt(1));
        sb.setCharAt(1, temp);
        System.out.println(sb);
    }
}

