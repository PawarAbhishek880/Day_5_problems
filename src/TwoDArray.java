import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size : ");
        int size = sc.nextInt();
        System.out.println("Enter second array size : ");
        int size1 = sc.nextInt();
        int[][] array = new int[size][size1];

        System.out.println("Enter elements for 2D array");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                array[i][j] = sc.nextInt();

            }
        }
        System.out.println("array elements of 2D array is: ");
        for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.println(array[i][j]);
            }
        }
    }
}
