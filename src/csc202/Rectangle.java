package csc202;

public class Rectangle {
    private double length;
    private double height;

    public Rectangle (double length, double height) {
        // Do funny stuff
    }

    public double getLength() {
        return this.length;
    }

    public double getHeight() {
        return this.height;
    }

    public double setLength(double length) {
        this.length = length;
        return this.length;
    }

    public double setHeight(double height) {
        this.height = height;
        return this.height;
    }

    public double calculateArea () {
        return this.length * this.height;
    }

    public double calculatePerimeter () {
        return 2 * (this.length + this.height);
    }
}
