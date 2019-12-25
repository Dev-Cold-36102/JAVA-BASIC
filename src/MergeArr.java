import java.util.Scanner;

public class MergeArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the size of array 1:");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 1; i < size1 + 1; i++) {
            System.out.print("element " + i + " :");
            arr1[i - 1] = scanner.nextInt();
        }
        System.out.print("please enter the size of array 2:");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 1; i < size2 + 1; i++) {
            System.out.print("element " + i + " :");
            arr2[i - 1] = scanner.nextInt();
        }
        int[] mergeArr = new int[size1 + size2];
        for (int i = 0; i < arr1.length; i++) {
            mergeArr[i] = arr1[i];
        }
        for (int i = size1; i < mergeArr.length; i++) {
            mergeArr[i] = arr2[i - size1];
        }
        System.out.print("the new array:");
        for (int i = 0; i < mergeArr.length; i++) {
            System.out.print(mergeArr[i] + " ");
        }
    }
}
