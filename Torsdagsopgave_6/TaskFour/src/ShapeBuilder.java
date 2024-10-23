import java.util.ArrayList;
// 4.3
public class ShapeBuilder {
    ArrayList<Shape> shape = new ArrayList<>();

    public void addShape(Shape s) {
        shape.add(s);
    }

    // 4.4
    public double getTotalArea() {
        double totalArea = 0;
        for(Shape s: shape) {
            totalArea += s.getArea();
        }
        return totalArea;
    }
}
