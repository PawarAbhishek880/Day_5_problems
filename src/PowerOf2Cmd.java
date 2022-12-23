public class PowerOf2Cmd {
    public static void main(String[] args) {
        int power = Integer.parseInt(args[0]);
        int result;

        if(power>= 0 && power <= 31)
        {
            result = (int) (Math.pow(2,power));
            System.out.println(result);

        for (int i = 1; i<= power; i++)
        {
            System.out.println("Power of 2^" + i + " is : " + Math.pow(2 , i));
        }
        }else {
            System.out.println("Number is not in range between 0 to 30");
        }
    }
}
