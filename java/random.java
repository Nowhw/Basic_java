import java.util.Random;

public class random {
    public static void main(String [] args)
    {
        Random ran = new Random();
        int x=ran.nextInt(6);
        System.out.println(x);
        boolean y = ran.nextBoolean();
        System.out.println(y);

    }
}
