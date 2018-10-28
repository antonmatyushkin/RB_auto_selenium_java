public class Circle {

    double r;
    double pi = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public Circle() {
        r = 0;
    }

    public Circle(double r, double pi) {
        this.r = r;
        this.pi = pi;
    }

    public double circleleArea(double r) {
        if (r <= 0) {
            throw new MyException("Радиус круга не может быть отрицательными!");
        }
        return pi * Math.pow(r, 2);
    }
}
