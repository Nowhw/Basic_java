import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        // double x;
        // double y;
        // double z;
        // System.out.println("Enter First Variable : ");
        // x=scanner.nextDouble();
        // scanner.nextLine();
        // System.out.println("Enter Second Variable : ");
        // y=scanner.nextDouble();
        // z=Math.sqrt((x*x)+(y*y));
        // System.out.println("The Hypotenuse : "+z);
        // double a;
        // double b;
        // double c;
        // System.out.print("Enter First Side : ");
        // a=scanner.nextDouble();
        // System.out.print("Enter The Second Side");
        // b=scanner.nextDouble();
        // c=Math.sqrt((Math.pow(a, 2)+(Math.pow(b, 2))));
        // System.out.println("The Hypotenuse Of The Triangle Is :"+c);

        double radius;
        double circumference;
        double area;

        System.out.println("Enter the Radius : ");
        radius=scanner.nextDouble();

        circumference=(2*(Math.PI)*(radius));
        area=(Math.PI)*Math.pow(radius, 2);
        System.out.printf("The Circumference of the circle is %.1f \n", circumference);
        System.out.printf("The Value Of the Area of The Circle Is : %.1f", area);


        scanner.close();
    }
}
