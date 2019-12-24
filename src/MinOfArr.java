import java.sql.Array;
import java.util.Scanner;

public class MinOfArr {
    public static void minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        System.out.println("min:" + min);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 1; i < size + 1; i++) {
            System.out.print("element " + i + " :");
            arr[i - 1] = scanner.nextInt();
        }
        minValue(arr);
    }
}
