// Конвертер из рублей в валюту и из цельсий в другие форматы (1 версия, не прокачанная)
//Калькулятор простых операций: Напишите программу, которая запрашивает у пользователя два числа и операцию (+, -, *, /),
// а затем выводит результат выполнения этой операции.


import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Choice(in);
        System.out.print("Введите номер опции: ");
        int number = in.nextInt();

        switch (number) {
            case(1):
                System.out.print("Введите целое количество денег в рублях: ");
                int money = in.nextInt();
                Wallet(in);

                System.out.print("Введите опцию: ");
                int n = in.nextInt();

                switch(n){
                    case(1): // Доллары
                        System.out.println("Ваши деньги в долларах: " + money * 0.011 + "$");
                        break;
                    case(2): // Евро
                        System.out.println("Ваши деньги в евро: " + money * 0.01 + "€");
                        break;
                    case(3): // Фунты
                        System.out.println("Ваши деньги в фунтах: " + money * 0.0086 + "£");
                        break;
                    case(4): // Йены
                        System.out.println("Ваши деньги в йенах: " + money * 1.63 + "¥");
                        break;
                    default:
                        System.out.println("Введена некорректная опция");
                }
                break;
            case(2):
                System.out.print("Введите градусы в цельсий: ");
                int c = in.nextInt();
                Temperature(in);

                System.out.print("Введите опцию: ");
                int p = in.nextInt();
                switch(p){
                    case(1):
                        System.out.print("Ваша температура в фаренгейтах: " + (c * 9/5 + 32) + "°F");
                        break;
                    case(2):
                        System.out.print("Ваша температура в кельвинах: " + (c-273.15) + "°K");

                }
                break;
            default:
                System.out.println("Введено некорректное значение");
                break;
        }


    }
    public static void Choice(Scanner in) {
        String Ansi_Purple = "\u001B[35m";
        String Reset = "\u001B[0m";
        System.out.println("Возможности конвертера: " + Reset);
        System.out.println(Ansi_Purple + "1 - Валюта" + Reset);
        System.out.println(Ansi_Purple + "2 - Температура" + Reset);
    }
        public static void Wallet(Scanner in){
            String Ansi_Purple = "\u001B[35m";
            String Reset = "\u001B[0m";
            System.out.println(Ansi_Purple + "1 - Перевести в доллары" + Reset);
            System.out.println(Ansi_Purple + "2 - Перевести в евро" + Reset);
            System.out.println(Ansi_Purple + "3 - Перевести в фунты" + Reset);
            System.out.println(Ansi_Purple + "4 - Перевести в йены" + Reset);
        }
        public static void Temperature(Scanner in){
            String Ansi_Purple = "\u001B[35m";
            String Reset = "\u001B[0m";
            System.out.println(Ansi_Purple + "1 - Перевести в фаренгейты" + Reset);
            System.out.println(Ansi_Purple + "2 - Перевести в кельвины" + Reset);
    }
}
