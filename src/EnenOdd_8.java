import java.util.Scanner;

public class EnenOdd_8 {
    public static void main(String[]args) {
        int num;
        System.out.println(" Enter any no= ");
        Scanner sc =new Scanner(System.in);
        num = sc.nextInt();

        if (num%2==0) {
            System.out.println("Even ");
        }
        else {
            System.out.println("Odd ");
        }
    }
}
