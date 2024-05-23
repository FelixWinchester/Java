import java.util.*;

public class Spell {
//    public static void spell() {
//        Scanner in = new Scanner(System.in);
//        String[] mass = {"Драконий коготь", "Лист мандрагоры", "Корень шершавой астрелии"};
//        System.out.println("Добро пожаловать в лабораторию зелий!");
//        System.out.println("Введите ингредиенты, которые у вас есть (через запятую): ");
//        String input = in.nextLine();
//        System.out.println(input);
//
//        // Убираем квадратные скобки при выводе
//        String newMass = String.join(", ", mass);
//        System.out.println(newMass);
//
//        String[] arr = input.split(", ");
//    }
//
//    public void Potion() {
//        Scanner in = new Scanner(System.in);
//
//        String[] reqIngr = {"first", "second", "third"};
//        String reqIngrString = String.join(", ", reqIngr);
//        System.out.println("Ингредиенты, необходимые для приготовления зелья: " + reqIngrString);
//
//        System.out.println("Введите ингредиенты зелья: ");
//        String[] userIngr = new String[3];
//
//        for (int i = 0; i < reqIngr.length; i++) {
//            String m = in.nextLine();
//            userIngr[i] = m;
//        }
//        String userIngrString = String.join(", ", userIngr);
//        System.out.println("Ваши ингредиенты: " + userIngrString);
//
//        int counter = 0;
//        for (int i = 0; i < reqIngr.length; i++) { // исправлено <= на <
//            for (int j = 0; j < userIngr.length; j++) { // исправлено <= на < и i++ на j++
//                if (reqIngr[i].equals(userIngr[j])) { // исправлено userIngr[i] на userIngr[j]
//                    counter++;
//                }
//            }
//        }
//
//        if (counter == reqIngr.length) {
//            System.out.println("Все ингредиенты совпадают");
//        } else {
//            System.out.println("Ингредиенты не совпадают");
//        }
//    }
    static void arrayaz(){

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: " );
        int n = in.nextInt();
        System.out.println("Введите элементы массива");
        int[] Massive = new int[n];

        for (int i = 0; i < n; i++){
            int m = in.nextInt();
            Massive[i] = m;
        }

        for (int i = 0; i < n; i++){
            if(Massive[i] > min){
                min = Massive[i];
            }

            if(Massive[i] < max){
                max = Massive[i];
            }
        }
        System.out.println("Минимальное значение: " + max);
        System.out.println("Максимальное значение: " + min);

    }
}
