package shapes;

public class Square extends Quadrilateral {
//
//    public Square (int side){
//        super(side,side);
//    }
//
//
//    public int side = length;
//
    public double getArea(){

        System.out.println(length * width);
        return length * width;
    }

    public double getPerimeter(){
        System.out.println(2 * length + 2 * width);
        return 2 * length + 2 * width;

    }
    public Square(double length, double width)
    {
        super(length, width);
    }


    @Override
    void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    void setWidth(double side) {
        this.length = side;
        this.width = side;
    }
}
