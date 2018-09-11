/**
 * Created by nw4771ch on 9/11/2018.
**/
import static input.InputUtils.intInput;
public class Main4 {
    public static void main (String[] args) {
        int n=(int)(Math.random()*10)+1;
        int q=0;
        while (q!=n) {
            q=intInput("Please enter your guess: ");
            if (q>n) {
                System.out.println("Too high!");
                continue;
            } else if (q<n) {
                System.out.println("Too low.");
                continue;
            } else {
                break;
            }
        }
        System.out.println("You guessed it! The number is " + n + ".");
    }

}

