public class Programme16_Point {
    /*You have to represent a point in 2D space. Write a class with the name Point. The class needs two
fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters x and y of type int and it needs to initialize the
fields.
Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this
Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance
between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance
between this Point and another Point as double.
How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.*/

    int x;
    int y;

    public Programme16_Point() {                        //constructor without parameter

    }

    public Programme16_Point(int x, int y) {               //constructor with two parameters
        this.x = x;
        this.y = y;

    }

    public int getX(int x) {                                //return x value
        return x;

    }

    public int getY(int y) {
        return y;
    }

    public void setX(int x) {
        this.x = x;

    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {

        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Programme16_Point point) {

        return distance(point.x, point.y);
    }

    public static void main(String[] args) {
        Programme16_Point first = new Programme16_Point(6, 5);                             //calling all the methods
        Programme16_Point second = new Programme16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Programme16_Point point = new Programme16_Point();
        System.out.println("distance()= " + point.distance());
    }


}

