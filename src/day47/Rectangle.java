package day47;

public class Rectangle extends Shape{

    int width;
    int height;


    public Rectangle( int width, int height) {
        super("my rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = height * width; // the field i already have but don't see
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
//
//  Rectangle
//      instance fields : width and height
//      implements calculateArea method   area = height * width
//      add toString method