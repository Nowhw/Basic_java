public class IfSwitch {
    public static void main(String[] args) {
        // int x=20;
        // if(x>=21){
        //     System.out.println("Your Very Old");
        // }
        // else{
        //     System.out.println("Your Young");
        // }
        String day="Tuesday";
        switch (day) {
            case "Sunday":System.out.println("It is Sunday");
                break;
            case "Monday":System.out.println("It is Monday");
            break;
            case "Tuesday":System.out.println("It is Tuesday");
            break;
            case "Wednesday":System.out.println("It is Wednesday");
            break;
            case "Thursday":System.out.println("It is Thursday");
            break;
            case "Friday":System.out.println("It is Friday");
            break;
            case "Saturday":System.out.println("It is Saturday");
            break;
            default:System.out.println("It is not a day");
        }
    }
}
