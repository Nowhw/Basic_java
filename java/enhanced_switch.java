import java.util.Scanner;

public class enhanced_switch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String day;
        System.out.println("Enter The Day : ");
        day=scanner.nextLine();

        switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday":
                System.out.println("It is a week day");
                break;
            case "Saturday","Sunday":
                System.err.println("It is a holiday");
            default:
                System.out.println("Please enter a valid day");
        }

        scanner.close();

    }
}
