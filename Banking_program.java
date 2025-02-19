import java.util.Scanner;

public class Banking_program {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        double balance=0;
        boolean isRunning=true;
        int choice;

        while(isRunning){
            System.out.println("----------------------");
            System.out.println("Bankig Program");
            System.out.println("----------------------");
            System.err.println("1.Show Balance");
            System.err.println("2.Deposit");
            System.err.println("3.Withdraw");
            System.err.println("4.Exit");
            System.out.println("----------------------");

            System.out.print("Enter Your Choice (1-4) : ");
            choice=scanner.nextInt();

            switch (choice) {
                case 1:
                    show_balance(balance);
                    break;
                case 2:
                    balance+=deposit();
                    break;
                case 3:
                    balance-=Withdraw(balance);
                    break;
                case 4:
                    isRunning=false;
                    break;
                default:
                    System.err.println("Wrong choice !!");
                    break;
            }
        }
    }

    static void show_balance(double balance){
        System.out.println("----------------------");
        System.out.printf("Your Balance is %.2f\n",balance);
    }
    static double  deposit(){
        double amount;
        System.out.print("Enter The Amount To Be Deposited: ");
        amount=scanner.nextDouble();
        if(amount<0){
            System.out.println("Amount Cannot Be Less Than Zero!");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double Withdraw(double balance){
        double amount;
        System.out.println("Enter The Amount To Be Withdrawn: ");
        amount=scanner.nextDouble();
        if(amount>balance){
            System.out.println("Insufficient Funds!");
            return 0;
        }
        else if(amount<0){
            System.out.println("Negative amount can't be withdrawn!");
            return 0;
        }
        else{
            return amount;
        }
    }
}
