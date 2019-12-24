import java.util.Scanner;
public class DrawMore {
    public static void main(String[] args) {
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        Scanner scanner =new Scanner(System.in);
        System.out.print("please choose:");
        int choice=scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 2:
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j <i ; j++) {
                        System.out.println("*");
                        System.out.println("\n");
                    }
                }
                break;
            case 3:
                for (int i = 4; i >0 ; i++) {
                    for (int j = 0; j <4 ; j++) {

                    }
                }
        }
    }
}
