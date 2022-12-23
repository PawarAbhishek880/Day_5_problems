import java.util.Scanner;

public class Function_4 {
    public static void main(String[] args) {
        System.out.println("First quadratic equation is = a*x*x + b*x + c");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a value for a =");
        int a = scan.nextInt();

        System.out.println("enter a value for b =");
        int b = scan.nextInt();

        System.out.println("enter a value for c =");
        int c = scan.nextInt();

        System.out.println(a + " *x*x " + b + " *x+ " + c);

        System.out.println(" To find the roots of number ");
        int roots =b*b - 4*a*c;
        int root_1 = (int) ((-b + Math.sqrt(roots)) / (2*a) );
        int root_2 = (int) ((-b - Math.sqrt(roots)) / (2*a) );

        System.out.println("root1 of x = " + root_1);
        System.out.println("root2 of x = " + root_2);


    }
}
