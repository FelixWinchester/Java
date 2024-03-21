import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        System.out.print("Введите размер количество элементов: ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i ++){
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(i + " ");
            }
        }

    }
}
