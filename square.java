/**
 * Created by nw4771ch on 9/11/2018.
 */
import static input.InputUtils.intInput;
public class square {
    public static void main (String args[]) {
    int h=intInput("Enter height: ");
    int w=intInput("Enter width: ");
    for (int i=0;i<h;i++) {
        for (int j = 0; j < w; j++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}
