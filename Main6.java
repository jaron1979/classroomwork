/**
 * Created by nw4771ch on 9/11/2018.
 */
import static input.InputUtils.doubleInput;
public class Main6 {
    public static void main(String[] args) {
        String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        double m[]=new double[12];
        int i;
        double sum=0;
        for (i=0;i<12;i++) {
            m[i]=doubleInput("What is the bill for " + months[i] + "?");
            sum=sum+m[i];
        }
        double avg=sum/12;
        int j;
        for (j=0;j<12;j++) {
            System.out.print(months[j] + " ");
            System.out.println(m[j]);
        }
        System.out.print("The average is " + avg);
    }
}
