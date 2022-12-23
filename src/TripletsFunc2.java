import java.util.Scanner;

public class TripletsFunc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array ");
        int size = sc.nextInt();
        int count=0;
        int[] array = new int[size];
        System.out.println("enter the array elements");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();

        }
        for (int i = 0; i <= array.length - 3; i++) {
            for (int j = i + 1; j <= array.length - 2; j++) {
                for (int k = j + 1; k <= array.length - 1; k++) {
                    if (array[i] + array[j] + array[k] == 0){
                        count++;
                        System.out.println(array[i]+" " +array[j]+ "" +array[k]);
                    }
                }
            }
        }
    }
}
