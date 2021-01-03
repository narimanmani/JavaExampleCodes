public class PowerOf2 {

    // Program to find whether a number is power of two
    public static void main(String[] args)
    {
        powerTwo(4);
        powerTwo(3);
    }

    public static void powerTwo(int x)
    {
        if (x!=0 && (x & (x-1))==0)
            System.out.println("Power of 2");
        else
            System.out.println("Not Power of 2");
    }
}
