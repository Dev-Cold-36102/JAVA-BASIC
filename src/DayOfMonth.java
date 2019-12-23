import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the month: ");
        int month=scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("that month has 31 days");
                break;
            case 2:
                System.out.println("that month has 28 or 29 days");
                break;
            default:
                System.out.println("that month has 30 days");
        }
    }
}
