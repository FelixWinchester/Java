import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        String dumbledore = "dumbledore ";
        String mcgonagal = " mcgonagal ";
        String snape = " snape ";
        String lupin = " lupin ";
        String hagrid = " hagrid ";

        System.out.println("Teachers: " + dumbledore + mcgonagal + snape + lupin + hagrid);

        int grade_1 = new Random().nextInt(1,10) + 1;
        int grade_2 = new Random().nextInt(1,10) + 1;

        System.out.println(grade_1 + " " + grade_2);

        boolean result;
        result = (grade_1 >= 5 && grade_2 >= 5) ? true: false;
        System.out.println(result);

        int number = 4199;
        double first = 4199 % 13;
        double second = 4199 % 13;
        double third = 4199 % 15;
        double fourth = 4199 % 16;
        double fifth = 4199 % 17;
        double sixth = 4199 % 19;

        System.out.println(first + second + third + fourth + fifth + sixth);
    }
}

