import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        int arr[][] = new int[100][];
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the amout of element:");
        int row = scanner.nextInt();
        for (int i = 0; i < row; i++) {

            arr[i] = new int[100];
            System.out.println("row" + i);
            for (int j = 0; j < row; j++) {
                System.out.printf(" elements %d:", j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("your array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
        int sum = 0;
        System.out.println("sum of diagonal left to right:0");
        System.out.println("sum of diagonal right to left:1");
        System.out.print("enter the number:");
        int choice = scanner.nextInt();
        if (choice == 0) {
            for (int i = 0; i < row; i++) {
                sum += arr[i][i];
            }
        } else {
            for (int i = row - 1; i >= 0; i--) {
                sum += arr[i][i];
            }
        }
        System.out.println("sum=" + sum);

    }
}
