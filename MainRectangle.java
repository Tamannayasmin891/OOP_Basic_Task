class Rectangle {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }
}

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(7, 12);
        System.out.println("The area of the rectangle is " + rect.area());
        System.out.println("The perimeter of the rectangle is " + rect.perimeter());

        // Update dimensions
        rect.width = 6;
        rect.height = 12;
        System.out.println("\nThe area of the rectangle is now " + rect.area());
        System.out.println("The perimeter of the rectangle is now " + rect.perimeter());
    }
}
