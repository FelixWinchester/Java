import java.util.*;
import java.lang.*;

public class Spell {
    public void hat() {

        Scanner in = new Scanner(System.in);
        System.out.println("“Ты предпочитаешь работать в команде? (Да/Нет)” ");
        String answer1 = in.next();

        System.out.println("“Ты любишь разгадывать головоломки? (Да/Нет)” ");
        String answer2 = in.next();

        System.out.println("“Ты идешь на риск, чтобы достичь своей цели? (Да/Нет)” ");
        String answer3 = in.next();

        System.out.println("“Ты проявляешь заботу к существам и природе? (Да/Нет)” ");
        String answer4 = in.next();


        if (answer1.equals("Да")) {
            if (answer3.equals("Да")) {
                System.out.println("Гриффиндор");
            } else {
                System.out.println("Пуффендуй");
            }
        } else if (answer2.equals("Да")) {
            if (answer1.equals("Да")) {
                System.out.println("Когтевран");
            } else if (answer3.equals("Да")) {
                System.out.println("Когтевран");
            } else {
                System.out.println("Слизерин");
            }
        } else {
            if (answer3.equals("Да")) {
                System.out.println("Слизерин");
            } else {
                System.out.println("Пуффендуй");
            }
        }
    }
}
