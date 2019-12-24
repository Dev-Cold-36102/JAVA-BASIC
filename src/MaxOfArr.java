import java.util.Scanner;

public class MaxOfArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 1; i < size + 1; i++) {
            System.out.print("element " + i + " :");
            arr[i - 1] = scanner.nextInt();
        }
        System.out.println("your arr: ");

        int max = arr[0];
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("\n");
        System.out.println("max :" + max);
    }
}
