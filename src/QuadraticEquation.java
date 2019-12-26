
import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public void getRoot1(double delta) {
        double root1 = ((-b) + Math.sqrt(delta) / (2 * a));
        System.out.print("root 1:" + root1);
    }

    public void getRoot2(double delta) {
        double root2 = ((-b) - Math.sqrt(delta) / (2 * a));
        System.out.print("root 2:" + root2);
    }

    public void getRoot() {
        double root = ((-b) / (2 * a));
        System.out.print("root :" + root);
    }

    public static void main(String[] args) {
        System.out.println("please enter the const:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        double a = scanner.nextDouble();
        System.out.print("b=");
        double b = scanner.nextDouble();
        System.out.print("c=");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            equation.getRoot1(delta);
            equation.getRoot2(delta);
        } else if (delta == 0) {
            equation.getRoot();
        } else System.out.println("The equation has no roots");
    }
}
