import java.util.*;
import java.lang.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        double arr[] = new double[n];

        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < arr.length; i++){
            int m = in.nextInt();
            arr[i] = m;
        }
        double max = arr[0];
        double min = arr[0];
        int middle = 0;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
            middle += arr[i]/arr.length;
        }

        System.out.println("Максимальный элемент: " + max + "; Минимальный элемент: " + min + "; Среднее значение: " + middle);
    }
}
