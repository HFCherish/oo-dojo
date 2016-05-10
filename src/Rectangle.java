public class Rectangle {

    private  int width;
    private  int length;

    public Rectangle( int width, int length ) {
        this.width = width;
        this.length = length;
    }

    public int area() {
        return width * length;
    }

    public int perimeter() {
        return 2 * width + 2 * length;
    }

    public static Rectangle createSquare(int sideLength) {
        return new Rectangle(sideLength, sideLength);
    }

    public boolean isSquare() {
        return width == length;
    }
}
