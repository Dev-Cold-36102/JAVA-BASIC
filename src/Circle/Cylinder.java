package Circle;

public class Cylinder extends Cirlce {
    public double height;

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(30);
        cylinder.setHeight(10);
        System.out.println("area=" + cylinder.getArea());
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {

        area = super.getArea() * this.height;
        return area;
    }
}
