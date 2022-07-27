/* Create an abstract class 'Shape' with three abstract methods namely 
'RectangleArea()' taking two parameters, 'SquareArea()' and 'CircleArea()' 
taking one parameter each. The parameters of 'RectangleArea()' are its length 
and breadth, that of 'SquareArea()' is its side and that of 'CircleArea()' is its 
radius. Now create another class 'Area' containing all the three methods 
'RectangleArea()', 'SquareArea()' and 'CircleArea()' for printing the area of 
rectangle, square and circle respectively. Create an object of class 'Area' and call 
all the three methods to display the area of a rectangle, a square and a circle. */


abstract class Shape{
    abstract void Rectnagle_Area(double length,double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);

}

class Area extends Shape{
    @Override
    void Rectnagle_Area(double length, double breadth) {
        // TODO Auto-generated method stub
        double re=length*breadth;
        System.out.println(re);
    }

    void SquareArea(double side)
    {
        double re=side*side;
        System.out.println(re);
    }

    void CircleArea(double radius)
    {
        double re=(radius*radius)*3.14;
        System.out.println(re);
    }
}


public class as83 {

    public static void main(String[] args) {
        Area a=new Area();
        a.Rectnagle_Area(4, 5);
        a.CircleArea(20);
        a.SquareArea(5);
    }
    
}
