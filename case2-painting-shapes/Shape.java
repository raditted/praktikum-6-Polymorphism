//*****************************************
// Shape.java
//
// Represents a generic shape.
//*****************************************

public abstract class Shape {
    protected String shapeName;

    //-------------------------------------
    // Constructor: Sets up the shape name.
    //-------------------------------------
    public Shape(String name) {
        shapeName = name;
    }

    //-------------------------------------
    // Computes and returns the area of the shape.
    //-------------------------------------
    public abstract double area();

    //-------------------------------------
    // Returns the name of the shape as a String.
    //-------------------------------------
    @Override
    public String toString() {
        return shapeName;
    }
}