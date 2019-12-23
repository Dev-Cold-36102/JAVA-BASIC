import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("plrase enter the year:");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if (year%4==0) {
            if (year%100==0) {
                if (year%400!=0) {
                    System.out.printf("%d is not a leap year",year);
                } else {
                    System.out.printf("%d is a leap year",year);
                }
            } else {
                System.out.printf("%d is a leap year",year);
            }
        } else {
            System.out.printf("%d is not a leap year",year);
        }

    }
}
