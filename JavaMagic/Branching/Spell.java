import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){

        int first = new Random().nextInt();
        int second = new Random().nextInt();
        System.out.println("Число 1: " + first + " " + "Число 2: " + second);

        if (first % 2 == 0 && second % 2 == 0){
            int res1 = first / 2;
            int res2 = second / 2;
            int summ = res1 + res2;
            System.out.println("Сумма: " + summ);
        } if (first % 2 == 0 && second % 2 != 0){
            int res_f = first / 2;
            System.out.println("Первое число, четное: " + res_f);
        } if (first % 2 != 0 && second % 2 == 0){
            int res_s = second / 2;
            System.out.println("Второе число, четное: " + res_s);
        } if (first % 2 != 0 && second % 2 != 0) {
            System.out.println("Оба числа нечетные, их сумма: " + (first + second));
        }
        Spell cl = new Spell();
        cl.hat();

    }
}
