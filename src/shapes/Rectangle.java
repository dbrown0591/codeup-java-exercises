
package shapes;

public class Rectangle extends Quadrilateral implements Measurable  {
//    protected int length;
//    protected int width;
////
//    public Rectangle(int length, int width) {
//
//        this.length = length;
//         this.width = width;
//    }
//
//    public Rectangle() {
//
//    }
//
//    public int getArea(){
//
//        return length * width;
//    }
//
//    public int getPerimeter(){
//
//        return 2 * length + 2 * width;
//
//    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {
        this.length = length;

    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        System.out.println(2 * length + 2 * width);
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        System.out.println(length * width);
        return length * width;
    }
}

