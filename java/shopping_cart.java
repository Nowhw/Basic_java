import java.util.Scanner;
public class shopping_cart {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency='$';
        double total;

        System.out.print("Enter The Name Of The Item : ");
        item=scanner.nextLine();
        System.out.print("Enter The Price Of The Item : ");
        price=scanner.nextDouble();
        System.out.print("Enter The Quantity Of The Item : ");
        quantity=scanner.nextInt();

        total=(price*quantity);

        System.out.print("\n You have bought "+quantity+ " " +item+ "/s ");
        System.out.println("Your total is :"+currency+total);
        
        scanner.close();
    }
}
