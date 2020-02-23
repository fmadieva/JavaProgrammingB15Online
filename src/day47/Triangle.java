package day47;

public class Triangle extends Shape {

    int height;
    int base;

    public Triangle(String name, int height, int base) {
        super(name);
        this.height=height;
        this.base=base;
    }

    public Triangle(String name) {
        super(name);
    }

    @Override
    public void calculateArea() {
        area =  height*base/2;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}

//  add two concrete class of Shape :
//  Triangle
//      instance fields : int height and base
// constructor
//        to set name , height , base
//        implements calculateArea method   area = height * base / 2
// add toString method

