package ByteStreams;

public class LAB1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redCircle.draw();
        redRectangle.draw();
    }
}
