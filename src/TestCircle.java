import java.util.Scanner;

public class TestCircle {
    static class Circle {
        private double radius = 1.0;
        private String color = "red";
        final double PI = 3.14;

        Circle() {

        }

        Circle(double r) {

        }

        private double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.pow(radius, 2) * PI;

        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("area=" + circle.getArea());
    }
}
