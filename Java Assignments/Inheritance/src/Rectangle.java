class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Rectangle Area = " + (length * breadth));
    }

    void perimeter() {
        System.out.println("Rectangle Perimeter = " + (2 * (length + breadth)));
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }

    void squareArea() {
        System.out.println("Square Area = " + (length * breadth));
    }

    void squarePerimeter() {
        System.out.println("Square Perimeter = " + (2 * (length + breadth)));
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);

        Square s = new Square(5);

        r.area();
        r.perimeter();

        s.squareArea();
        s.squarePerimeter();
    }
}