// Идея задачи состояла в том, чтобы создать мини интерактивное консольное приложение, которое реагирует на выбор пользователя и в зависимости от этого выбора
// вызывает необходимые функции с действиями и возвращается к функции выбора

// Идея задачи состояла в том, чтобы создать мини интерактивное консольное приложение, которое реагирует на выбор пользователя и в зависимости от этого выбора
// вызывает необходимые функции с действиями и возвращается к функции выбора

import java.util.*;
import java.lang.*;


public class Main{

    // Функция для инициализации одномерного массива размера n //
    public static void FirstArray_Odnom(Scanner in) {

        System.out.print("Введите размер одномерного массива: ");
        int n = in.nextInt();
        float arr[] = new float[n];
        ActionsArray(in);
        System.out.print("Введите опцию: ");
        int o = in.nextInt();
        System.out.print("Введите элементы массива типа float: ");
        for (int i = 0; i < arr.length; i++) {
            float m = in.nextFloat();
            arr[i] = m;
        }
            switch(o){
                case(1):
                    String Array = Arrays.toString(arr);
                    System.out.println("Элементы массива: " + Array);
                   // Choice(in);
                    break;
                case(2):
                    Arrays.sort(arr);
                    System.out.println(Arrays.toString(arr));
                  //  Choice(in);
                    break;
                case(3):
                    System.out.println("Введите число для заполнения: ");
                    float a =  in.nextFloat();
                    Arrays.fill(arr,a);
                    String massive = Arrays.toString(arr);
                    System.out.println(massive);
                  //  Choice(in);
                    break;
            }
    }
    // Функция для инициализации двумерного массива размера nxm //
    public static void SecondArray_Dvum(Scanner in){

        System.out.println("Введите размер двумерного массива: ");

        int a = in.nextInt();
        int b = in.nextInt();


        float arr[][] = new float[a][b];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; i < b; i++) {
                float elem = in.nextFloat();
                arr[i][j] = elem;
            }
        }
        ActionsArray(in);
        System.out.print("Введите опцию: ");
        int o = in.nextInt();
        switch(o) {
            case(1):
                for (int i = 0; i < a; i++){
                    for (int j = 0; i < b; i++){
                        System.out.println("Элемент массива:" + arr[i][j]);
                    }
                }
             //   Choice(in);
                break;
            case(2):
                String Array = Arrays.toString(arr);
                Arrays.sort(arr);
                System.out.println("Элементы массива: " + Array);
              //  Choice(in);
                break;
            case(3):
                System.out.print("Введите элемент для заполнения: ");
                int n = in.nextInt();
                Arrays.fill(arr, n);
                System.out.println(arr);
              //  Choice(in);
                break;
        }

    }

    // Функция для действий с массивом //
    public static void ActionsArray(Scanner in){
        System.out.println("1 - Вывести элементы");
        System.out.println("2 - Отсортировать элементы по возрастанию");
        System.out.println("3 - Заполнить массив элементом");
    }

    // Функция для выбора действий с программой //
    public static void Choice(Scanner in){
        System.out.println("1 - завершить программу");
        System.out.println("2 - перейти к одномерному массиву");
        System.out.println("3 - перейти к двумерному массиву");
    }
    // Мейн функция //
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        boolean programRunning = true;

        while (programRunning) {
        Choice(in);
        System.out.print("Введите опцию: ");
        int n = in.nextInt();
        switch(n) {
            case (1):
                System.out.print("Программа завершена...");
                break;
            case (2):
                FirstArray_Odnom(in);
                break;
            case (3):
                SecondArray_Dvum(in);
                break;
        }
        }
    }
}
