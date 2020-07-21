package Lab4;

import java.util.Date;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated = new java.util.Date();

    public SimpleGeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public SimpleGeometricObject() { }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public java.util.Date getDateCreated() { return dateCreated; }
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}

class Triangle extends SimpleGeometricObject {
    // Data field
    private double side1 = 1, side2 = 1, side3 = 1;

    // Constructor
    public Triangle() {}
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // Methods get
    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    // Methods
    public double getPerimeter() {
        double sum = side1 + side2 + side3;
        double s = sum/2;
        return s;
    }
    public double getArea() {
        double s = getPerimeter();
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
    public String toString() {
        return "Triangle:side1="+side1+"side2="+side2+"side3="+side3;
    }
}
