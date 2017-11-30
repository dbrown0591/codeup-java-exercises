package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5,5);

        System.out.println(myShape.getArea());



        myShape = new Square(10,10);

        System.out.println(myShape.getPerimeter());

//
//            int area = box1.getArea();
//            int  perimeter = box1.getPerimeter();
//
//        System.out.println(area + " " + perimeter);
//
//        Rectangle box2 = new Square(5);
//
//         area = box2.getArea();
//         perimeter = box2.getPerimeter();
//
//        System.out.println(area + " " + perimeter);


    }

}
