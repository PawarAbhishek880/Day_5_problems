import java.util.Scanner;

public class FlipCoinPercentage {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        int count = 0;


        System.out.println(" Enter any number: ");

        Scanner sc = new Scanner(System.in);
        int flip =sc.nextInt();

        while( count < flip) {
            double random = Math.random();
            System.out.println(count + " " + random);
            if ( random<0.5 ) {
                head++;
                System.out.println(" ITS HEADS ");
            }
            else {
                tail++;
                System.out.println(" ITS TAILS ");
            }
            count++;
        }


        System.out.println("Number of HEADS :" +head);
        System.out.println("Number of TAILS :" +tail);

        double headPercentage=(double)head/flip*100;
        double tailPercentage=(double)tail/flip*100;

        System.out.println(" Percentage of HEADS :" + headPercentage);
        System.out.println(" Percentage of TAILS :" + tailPercentage);
    }
}
