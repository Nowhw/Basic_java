import java.util.Scanner;

public class Weights_conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.println("Enter A Choice : ");
        choice=scanner.nextInt();

        if(choice==1){
            System.out.println("Enter The weight in lbs :");
            weight=scanner.nextDouble();
            newWeight=weight*(0.453592);
            System.out.printf("The New Weight in kgs is : %.2f ",newWeight);
        }
        else if(choice==2){
            System.out.println("Enter The weight in Kgs :");
            weight=scanner.nextDouble();
            newWeight=weight*(2.20462);
            System.out.printf("The New Weight in lbs is : %.2f ",newWeight);
        }
        else{
            System.out.println("Invalid Choice!");
        }

        scanner.close();
    }
}
