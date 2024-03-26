// Такой же конвертер, как и Конвертер[1], только он позволяет выбрать валюту / температуру и в какое значение их конвертировать
// Валюта представлена на моент 26.03.2024

import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Choice();
        System.out.print("Введите номер опции: ");
        int number = in.nextInt();

        switch (number) {
            case(1): // Валюта
                System.out.println("Выберите вашу валюту:");
                WalletChoice();
                System.out.print("Ваш выбор: ");
                int n = in.nextInt();
                switch(n){
                    case(1): // Рубли
                        System.out.println("Выберите в какую валюту конвертировать:");
                        WalletChoice();
                        System.out.print("Введите опцию: ");
                        int option = in.nextInt();
                        switch (option) {
                            case(1): // Рубли
                            System.out.print("Введите целое количество денег в вашей валюте: ");
                            int money = in.nextInt();
                            System.out.print("Ваши деньги в рублях: " + money + "₽");
                            break;
                            case(2): // Доллары
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money1 = in.nextInt();
                                System.out.println("Ваши деньги в долларах: " + (money1 * 0.011) + "$");
                                break;
                            case(3): // Фунты
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money2 = in.nextInt();
                                System.out.println("Ваши деньги в фунтах: " + (money2 * 0.0086) + "£");
                                break;
                            case(4):
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money3 = in.nextInt();
                                System.out.println("Ваши деньги в йенах: " + (money3 * 1.63) + "¥");
                                break; // Йены
                            case(5):
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money4 = in.nextInt();
                                System.out.println("Ваши деньги в евро: " + (money4 * 0.01) + "€");
                                break; // Евро
                            default:
                                System.out.println("Введена некорректная опция");
                        }
                        break;

                    case(2): // Доллары
                        System.out.println("Выберите в какую валюту конвертировать:");
                        WalletChoice();
                        System.out.print("Введите опцию:");
                        int option1 = in.nextInt();
                        switch (option1) {
                            case(1): // Рубли
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money = in.nextInt();
                                System.out.print("Ваши деньги в рублях: " + (money * 92.49) + "₽");
                                break;
                            case(2): // Доллары
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money1 = in.nextInt();
                                System.out.println("Ваши деньги в долларах: " + money1 + "$");
                                break;
                            case(3): // Фунты
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money2 = in.nextInt();
                                System.out.println("Ваши деньги в фунтах: " + (money2 * 0.79) + "£");
                                break;
                            case(4): // Йены
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money3 = in.nextInt();
                                System.out.println("Ваши деньги в йенах: " + (money3 * 151.32) + "¥");
                                break;
                            case(5): // Евро
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money4 = in.nextInt();
                                System.out.println("Ваши деньги в евро: " + (money4 * 0.92) + "€");
                                break;
                            default:
                                System.out.println("Введена некорректная опция");
                        }
                        break;
                    case(3): // Фунты
                        System.out.println("Выберите в какую валюту конвертировать:");
                        WalletChoice();
                        System.out.print("Введите опцию:");
                        int option2 = in.nextInt();
                        switch (option2) {
                            case(1): // Рубли
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money = in.nextInt();
                                System.out.print("Ваши деньги в рублях: " + (money * 116.99) + "₽");
                                break;
                            case(2): // Доллары
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money1 = in.nextInt();
                                System.out.println("Ваши деньги в долларах: " + (money1 * 1.26) + "$");
                                break;
                            case(3): // Фунты
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money2 = in.nextInt();
                                System.out.println("Ваши деньги в фунтах: " + (money2) + "£");
                                break;
                            case(4): // Йены
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money3 = in.nextInt();
                                System.out.println("Ваши деньги в йенах: " + (money3 * 191.44) + "¥");
                                break; //
                            case(5): // Евро
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money4 = in.nextInt();
                                System.out.println("Ваши деньги в евро: " + (money4 * 1.17) + "€");
                                break;
                            default:
                                System.out.println("Введена некорректная опция");
                        }
                        break;

                    case(4): // Йены
                        System.out.println("Выберите в какую валюту конвертировать:");
                        WalletChoice();
                        System.out.print("Введите опцию:");
                        int option3 = in.nextInt();
                        switch (option3) {
                            case(1): // Рубли
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money = in.nextInt();
                                System.out.print("Ваши деньги в рублях: " + (money * 0.61) + "₽");
                                break;
                            case(2): // Доллары
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money1 = in.nextInt();
                                System.out.println("Ваши деньги в долларах: " + (money1 * 0.0066) + "$");
                                break;
                            case(3): // Фунты
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money2 = in.nextInt();
                                System.out.println("Ваши деньги в фунтах: " + (money2 * 0.0052) + "£");
                                break;

                            case(4): // Йены
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money3 = in.nextInt();
                                System.out.println("Ваши деньги в йенах: " + (money3) + "¥");
                                break; //
                            case(5): // Евро
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money4 = in.nextInt();
                                System.out.println("Ваши деньги в евро: " + (money4 * 0.0061) + "€");
                                break;
                            default:
                                System.out.println("Введена некорректная опция");
                        }
                        break;

                    case(5): // Евро
                        System.out.println("Выберите в какую валюту конвертировать:");
                        WalletChoice();
                        System.out.print("Введите опцию:");
                        int option4 = in.nextInt();
                        switch (option4) {
                            case(1): // Рубли
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money = in.nextInt();
                                System.out.print("Ваши деньги в рублях: " + (money * 100.64) + "₽");
                                break;
                            case(2): // Доллары
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money1 = in.nextInt();
                                System.out.println("Ваши деньги в долларах: " + (money1 * 1.08) + "$");
                                break;
                            case(3): // Фунты
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money2 = in.nextInt();
                                System.out.println("Ваши деньги в фунтах: " + (money2 * 0.86) + "£");
                                break;
                            case(4): // Йены
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money3 = in.nextInt();
                                System.out.println("Ваши деньги в йенах: " + (money3 * 164.15) + "¥");
                                break; //
                            case(5): // Евро
                                System.out.print("Введите целое количество денег в вашей валюте: ");
                                int money4 = in.nextInt();
                                System.out.println("Ваши деньги в евро: " + (money4) + "€");
                                break;
                            default:
                                System.out.println("Введена некорректная опция");
                        }
                        break;
                    default:
                        System.out.println("Введена некорректная опция");
                }
                break;

            case(2):
                System.out.println("Выберите вашу единицу измерения температуры: ");
                TemperatureChoice();
                System.out.print("Ваш выбор: ");
                int p = in.nextInt();
                switch(p){
                    case(1): // Цельсий
                        System.out.println("Введите в какую единицу измерения температуры переконвертировать: ");
                        TemperatureChoice();
                        System.out.print("Введите номер опции: ");
                        int k = in.nextInt();

                        switch(k) {
                            case(1): // Цельсий
                                System.out.print("Введите ваше значение температуры: ");
                                int temp = in.nextInt();
                                System.out.print("Ваше значение в цельсий: " + temp + "°C");
                                break;

                            case(2): // Фаренгейт
                                System.out.print("Введите ваше значение температуры: ");
                                int temp1 = in.nextInt();
                                System.out.print("Ваше значение в фаренгейтах: " + (temp1 * 9/5 + 32) + "°F");
                                break;
                            case(3): // Кельвин
                                System.out.print("Введите ваше значение температуры: ");
                                int temp2 = in.nextInt();
                                System.out.print("Ваше значение в кельвинах: " + (temp2 -273.15) + "°K");
                                break;
                            default:
                                System.out.println("Введена неверная опция");
                                break;
                        }
                        break;



                    case(2): // Фаренгейт
                        System.out.println("Введите в какую единицу измерения температуры переконвертировать: ");
                        TemperatureChoice();
                        System.out.print("Введите номер опции: ");
                        int s = in.nextInt();

                        switch(s) {
                            case(1): // Цельсий
                                System.out.print("Введите ваше значение температуры: ");
                                int temp = in.nextInt();
                                System.out.print("Ваше значение в цельсий: " + (temp - 32 * 5/9) + "°C");
                                break;

                            case(2): // Фаренгейт
                                System.out.print("Введите ваше значение температуры: ");
                                int temp1 = in.nextInt();
                                System.out.print("Ваше значение в фаренгейтах: " + (temp1) + "°F");
                                break;
                            case(3): // Кельвин
                                System.out.print("Введите ваше значение температуры: ");
                                int temp2 = in.nextInt();
                                System.out.print("Ваше значение в кельвинах: " + (temp2 - 32 * 5/9 + 273.15) + "°K");
                                break;
                            default:
                                System.out.println("Введена неверная опция");
                                break;
                        }
                        break;

                    case(3): // Кельвин
                        System.out.println("Введите в какую единицу измерения температуры переконвертировать: ");
                        TemperatureChoice();
                        System.out.print("Введите номер опции: ");
                        int e = in.nextInt();

                        switch(e) {
                            case(1): // Цельсий
                                System.out.print("Введите ваше значение температуры: ");
                                int temp = in.nextInt();
                                System.out.print("Ваше значение в цельсий: " + (temp + 273.15) + "°C");
                                break;

                            case(2): // Фаренгейт
                                System.out.print("Введите ваше значение температуры: ");
                                int temp1 = in.nextInt();
                                System.out.print("Ваше значение в фаренгейтах: " + (temp1 - 273.15 * 9/5 + 32) + "°F");
                                break;
                            case(3): // Кельвин
                                System.out.print("Введите ваше значение температуры: ");
                                int temp2 = in.nextInt();
                                System.out.print("Ваше значение в кельвинах: " + (temp2) + "°K");
                                break;
                            default:
                                System.out.println("Введена неверная опция");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Введено некорректное значение");
                        break;
                }
                break;
            default:
                System.out.println("Введено некорректное значение");
                break;
        }

    }
    public static void Choice() {
        String Ansi_Purple = "\u001B[35m";
        String Reset = "\u001B[0m";
        System.out.println("Возможности конвертера: " + Reset);
        System.out.println(Ansi_Purple + "1 - Валюта" + Reset);
        System.out.println(Ansi_Purple + "2 - Температура" + Reset);
    }

    public static void WalletChoice(){
        String Purple = "\u001B[35m";
        String Reset = "\u001B[0m";
        System.out.println(Purple + "1 - Рубли" + Reset);
        System.out.println(Purple + "2 - Доллары" + Reset);
        System.out.println(Purple + "3 - Фунты" + Reset);
        System.out.println(Purple + "4 - Йены" + Reset);
        System.out.println(Purple + "5 - Евро" + Reset);
    }
    public static void TemperatureChoice(){
        String Purple = "\u001B[35m";
        String Reset = "\u001B[0m";
        System.out.println(Purple + "1 - Цельсий" + Reset);
        System.out.println(Purple + "2 - Фаренгейт" + Reset);
        System.out.println(Purple + "3 - Кельвин" + Reset);

    }
}
