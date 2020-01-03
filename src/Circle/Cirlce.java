package Circle;

public class Cirlce {
    public double radius;
    public String color;
    public double area;
    public final double PI = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        this.area = Math.pow(this.radius, 2) * PI;
        return this.area;
    }

    public String toString() {
        System.out.println("radius=" + this.radius);
        return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
    }

    public static void main(String[] args) {
        Cirlce cirlce = new Cirlce();
        cirlce.setRadius(10);
        System.out.println(cirlce.getArea());
        cirlce.toString();
    }
}
