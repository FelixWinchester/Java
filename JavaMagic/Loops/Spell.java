import java.util.*;
import java.lang.*;

public class Spell{
    public void Values() {
        for (int i = 1; i <= 3; i++) {
            System.out.print("Запущен мяч под названием: ");
            if (i == 1) System.out.println("Quaffle");
            if (i == 2) System.out.println("Bludger");
            if (i == 3) System.out.println("Golden Snitch");
        }
    }

    public void Game(){
        Scanner in = new Scanner(System.in);
        System.out.print("Загадайте ваше число: ");
        int answer = in.nextInt();
            while (true) {
                int control = new Random().nextInt(0,100)+1;
                if (control == answer){
                    System.out.println("Снич пойман!");
                    break;
                } if (control != answer){
                    System.out.println("Снич не пойман");
                }
            }
    }

    public void Chetnoe(){
        int n  = 0;
        int first = 222;
        int second = 444;
        for (int i = first; i <= second; i++){
            n += first + (first + 2);
        }
        System.out.println("Сумма: " + n);
    }
}
