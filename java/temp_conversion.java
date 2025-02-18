import java.util.Scanner;

public class temp_conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter The Temperature : ");
        temp=scanner.nextDouble();

        System.out.print("Enter The Unit : ");
        unit=scanner.next().toUpperCase();

        newTemp=(unit.equals("C"))? (temp*(9/5)+32) : ((temp-32)*(5/9));

        System.out.println(newTemp);

        scanner.close();
    }
}
