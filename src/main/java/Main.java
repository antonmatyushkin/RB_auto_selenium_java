public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        System.out.println("Площадь прямоугольника = " + rectangle.rectangleArea(5, 5));
        System.out.println("Периметр прямоугольника = " + rectangle.rectanglePerimeter(2, 3));
        System.out.println("Площадь треугольника = " + triangle.triangleArea(2, 3, 4));
        System.out.println("Периметр треугольника = " + triangle.trianglePerimetr(2, 3, 4));
        System.out.println("Площадь круга = " + circle.circleleArea(5));
    }
}
