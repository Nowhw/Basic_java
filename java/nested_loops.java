import java.util.Scanner;

public class nested_loops {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.err.print("Enter The No Of Rows : ");
        rows=scanner.nextInt();
        System.err.print("Enter The No Of Columns : ");
        columns=scanner.nextInt();
        System.err.print("Enter The Symbol : ");
        symbol=scanner.next().charAt(0);

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(symbol);
            }
            System.err.print("\n");
        }
        scanner.close();
    }
}
