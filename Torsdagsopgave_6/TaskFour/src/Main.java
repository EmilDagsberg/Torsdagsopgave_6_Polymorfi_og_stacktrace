public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10);
        System.out.println(circle.getArea());
        System.out.println(square.getArea());

        ShapeBuilder sB = new ShapeBuilder();
        sB.addShape(circle);
        sB.addShape(square);

        System.out.println(sB.getTotalArea());
    }
}