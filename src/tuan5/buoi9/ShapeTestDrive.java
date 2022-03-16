package tuan5.buoi9;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape circle = new Circle(3 , 4, 5);
        circle.draw();
        circle.erase();
        circle.moveTo(1, 2);
    }
}
