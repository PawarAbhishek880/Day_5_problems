public class Function_3 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double dist = Math.sqrt(a*a + b*b);


        System.out.println("distance from point (" + a + ", " + b + ") to (0, 0) = " + dist);
    }
}
