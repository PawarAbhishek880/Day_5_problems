import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        double result = 0;
        while (num > 0){
            result = result + (double) 1/num;
            num--;
        }
        System.out.println("Harmonic value is : " + result);
    }
}
