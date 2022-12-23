import java.util.Scanner;

public class Swap2nos {
    public static void main(String[] args) {
        int i , j , temp;

        System.out.println("Enter any two numbers to swap");

        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        j = sc.nextInt();

        System.out.println("before swapping " + i + " " + j);

        temp = i;
        i = j;
        j = temp;

        System.out.println("after swapping " + i + " " + j);

    }
}
