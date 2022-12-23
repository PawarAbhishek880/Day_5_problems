import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args) {
        int yearNum;

        System.out.println("Enter an Year: ");

        Scanner sc = new Scanner(System.in);
        yearNum = sc.nextInt();

        if ( ((yearNum % 4 == 0) && (yearNum % 100 != 0)) || (yearNum % 400 == 0) )
            System.out.println( yearNum + " The Entered year is a Leap Year");

        else
            System.out.println( yearNum + " The Entered year is not a leap year");
    }
}
