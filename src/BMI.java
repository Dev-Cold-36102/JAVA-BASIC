import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the weight:");
        double weight = scanner.nextFloat();
        System.out.println("please enter the height:");
        double height = scanner.nextFloat();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%-30s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-30.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-30.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-30.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-30.2f%s", bmi, "Obese");
    }
}
