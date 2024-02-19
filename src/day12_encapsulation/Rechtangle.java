package day12_encapsulation;

public class Rechtangle {

    private int width;
    private int length;

    public Rechtangle(int width, int length) {
        setWidth(width);
        setLength(length);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width<=0){
            System.out.println("Width must be a positive value.");
            System.exit(1);
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            System.err.println("Length must be a positive value.");
            System.exit(1);
        }
        this.length = length;
    }
    public double calcArea() {
        return width * length;
    }

    public double calcPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString() {
        return "Rechtangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter()+
                '}';
    }
}
/*
2. Create a custom class named Rectangle with the following specifications:

	Attributes:
		width
		length

	Ensure encapsulation for both fields.
		Conditions:
			The width and length cannot be set to negative or zero values.

	Add a constructor that allows the user to set both fields during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the rectangle object.
		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
		toString(): Displays the width, length, area, and perimeter of the rectangle when the object is printed.

	Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
 */
