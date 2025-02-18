import java.util.Scanner;

public class logicaloperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //username must contain between 4-12 characters
        //username must not contain any underscore or spaces
        String username;

        System.out.print("Enter Your username : ");
        username=scanner.nextLine();

        if (username.length()<4 || username.length()>12) {
            System.out.println("Username must contain between 4-12 characters!");
        }else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain any spaces or underscores!");
        }else{
            System.out.println("Welcome user : "+username);
        }
        
        scanner.close();
    }
}
