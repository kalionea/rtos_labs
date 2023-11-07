public class Tester {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(3, 4),
                new Square(12)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}