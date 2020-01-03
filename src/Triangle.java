import kethua.Shape;

public class Triangle extends Shape {
    protected double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    Triangle() {

    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    protected double getArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p - this.side3) * (p - this.side2) * (p - this.side1));
    }

    protected double getPerimeter() {
        double perimeter = this.side1 + this.side3 + this.side2;
        return perimeter;
    }

    @Override
    public String toString() {
        return "side=" + this.side1 + "," + this.side2 + "," + this.side3 + " area=" + this.getArea() + " perimeter=" + this.getPerimeter();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2.0, 2.0, 2.0);
        System.out.println(triangle.toString());
    }
}
