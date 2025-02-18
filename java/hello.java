import java.util.Scanner;

class hello{
    public static void main(String[] args) {
        // System.out.println("Hello");
        Scanner scanner =new Scanner(System.in);
        // System.out.print("Enter Your Name");
        // String name=scanner.nextLine();
        // System.out.println("Hello I am :"+name);
        
        double length=0;
        double width=0;
        double area=0;

        System.out.print("Enter The Lenth : ");
        length=scanner.nextDouble();
        System.out.print("Enter The Width : ");
        width=scanner.nextDouble();
        area=(length*width);

        System.out.println("The Area Of The Rectangle Is :"+area);


        scanner.close();

    }

}