import java.util.Scanner;

public class compound_intrest {
    public static void main(String[] args){
        double A;
        double P;
        double r;
        double n;
        double t;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter The Principal Amount : ");
        P=scanner.nextDouble();

        System.err.print("Enter The Rate Of Intrest : ");
        r=scanner.nextDouble()/100;

        System.err.print("Enter the Number of times interest is compounded per year : ");
        n=scanner.nextDouble();

        System.err.print("Enter The Number of years : ");
        t=scanner.nextDouble();

        A=(P)*(Math.pow((1+(r/n)), (n*t)));

        System.out.print("Final amount (including interest) is : "+A);

        scanner.close();



    }
}
