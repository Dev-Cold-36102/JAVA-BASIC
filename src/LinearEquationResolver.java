

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x+b=0', please enter the const:");
        Scanner scanner=new Scanner(System.in);
        System.out.println("a=");
       double a=scanner.nextDouble();
        System.out.println("b=");
        double b=scanner.nextDouble();
        if (a!=0) {
            double solution=(-b)/a;
            System.out.println("x= "+ solution);
        } else {
            if (b!=0) {
                System.out.println("no answer!");
            } else {
                System.out.println("all x are correct");
            }
        }


    }
}
