import java.util.Scanner;

public class countdown_forloop {
    public static void main(String[] args) throws InterruptedException {
        int num=0;
        Scanner scanner=new Scanner(System.in);
        System.err.print("Enter the no from which you want to start countdown : ");
        num=scanner.nextInt();
        for(int i=num;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.err.println("Happy New year !");
        scanner.close();
    }
}
