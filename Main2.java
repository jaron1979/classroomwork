/**
 * Created by nw4771ch on 9/11/2018.
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Here are all the dates in January");
        int day;
        for (day=1;day<=31;day++) {
            System.out.print("January " + day);

            if (day == 1 || day == 21 || day == 31) {
                System.out.print("st");
            } else if (day == 2 || day == 22) {
                System.out.print("nd");
            } else if (day == 3 || day == 23) {
                System.out.print("rd");
            } else {
                System.out.print("th");
            }
            System.out.println("");
        }
    }
}
