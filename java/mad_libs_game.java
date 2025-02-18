import java.util.Scanner;

public class mad_libs_game {
    public static void main(String[] args){
    String adjective1;
    String noun;
    String adjective2;
    String verb;
    String adjective3;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter An Adjective : ");
    adjective1=scanner.nextLine();
    System.out.println("Enter An Noun : ");
    noun=scanner.nextLine();
    System.out.println("Enter An Adjective : ");
    adjective2=scanner.nextLine();
    System.out.println("Enter An Verb : ");
    verb=scanner.nextLine();
    System.out.println("Enter An Adjective : ");
    adjective3=scanner.nextLine();

    System.out.println("Today I went to a " +adjective1+ "zoo");
    System.out.println("In an exhibit, I saw a "+noun+".");
    System.out.println(noun+" was "+adjective2+" and " +verb+ "!");
    System.out.println("I was "+adjective3+"!");

    scanner.close();

    }
}
