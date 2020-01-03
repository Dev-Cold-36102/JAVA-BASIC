import java.util.Scanner;
import java.lang.String;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the string: ");
        String string = scanner.nextLine();


        for (int i = 0,j = string.length() - 1; i < string.length() / 2; i++,j--) {
            if (string.charAt(i) != string.charAt(j)) {
                System.out.println("NO");
                return;
            } else {

                continue;
            }
        }
        System.out.println("YES");
    }
}
