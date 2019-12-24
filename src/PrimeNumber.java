import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number:");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("that number is a prime one!");
        } else {
            System.out.println("that number is not a primer one!");
        }
    }
}
