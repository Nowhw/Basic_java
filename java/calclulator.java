import java.util.Scanner;

public class calclulator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result=0;
        boolean validoperator=true;

        System.out.print("Enter The First Number : ");
        num1=scanner.nextDouble();

        System.out.print("Enter The Operator : ");
        operator=scanner.next().charAt(0);

        System.out.print("Enter The second number : ");
        num2=scanner.nextDouble();


        switch (operator) {
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num2-num1;
                break;
            case '*':
                result= num1*num2;
                break;
            case '/':
                if(num2==0){
                    System.out.println("Cannot Divide By Zero");
                    validoperator=false;
                }else{
                    result= num1/num2;
                }
                break;
            default:
                System.out.print("Enter A valid Operator !");
                validoperator=false;
                break;
        }

        if (validoperator==true) {
            System.out.print("The result of the operation is : "+result);
        }


        scanner.close();
    }
}
