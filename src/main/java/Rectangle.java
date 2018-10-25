public class Rectangle {

    double a, b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle() {
        a = 0;
        b = 0;
    }

    public double rectangleArea(double a, double b) {
        return a * b;
    }

    public double rectanglePerimeter(double a, double b) {
        return 2 * (a + b);
    }
}
