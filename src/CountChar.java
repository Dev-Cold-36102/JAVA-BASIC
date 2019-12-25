import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the string:");
        String string = scanner.nextLine();
        System.out.println("enter the char want to check: ");
        char value = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == value) {
                count++;
            }
        }
        System.out.println("result=" + count);
    }
}
