import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner=new Scanner(System.in);

        System.out.println("What Is Your Name :");
        String name=scanner.nextLine();
        System.out.println("How Old Are You :");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("What Is Your Fav Sports :");
        String sports=scanner.nextLine();
        System.out.println("Hello Im :"+name);
        System.out.println("Im :"+age);
        System.out.println("I Like :"+sports);
    }
}
