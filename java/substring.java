import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter Your Name :");
        email=scanner.nextLine();

        if (email.contains("@")) {
            username=email.substring(0,email.indexOf("@"));
            domain=email.substring(email.indexOf("@")+1);

            System.out.println("Your Username is : "+username);
            System.out.println("Your domain is : "+domain);
        }
        else{
            System.out.println("Enter A Valid!");
        }

        scanner.close();
    }
}
