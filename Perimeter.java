interface Polygon{
    default double getPerimeter(){
        return 0.0;
    }
    abstract double getArea();
}
class Triangle implements Polygon{
    double x,y,z;
    double area;
    Triangle(double x,double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double getPerimeter(){
        return x+y+z;
    }
    public double getArea(){
        double s=(x+y+z)/2;
        area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
        return area;
    }
}
class Rectangle implements Polygon{
    double x,y;
    double area;
    Rectangle(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getPerimeter(){
        return (2*x)+(2*y);
    }
    public double getArea(){
        area=x*y;
        return area;
    }
} 
class Circle implements Polygon{
    double r;
    double area;
    Circle(double r){
        this.r=r;
    }
    public double getPerimeter(){
        return 2*3.14*r;
    }
    public double getArea(){
        area=3.14*r*r;
        return area;
    }
}
public class Perimeter{
    public static void main(String[] args) {
        Polygon triangle = new Triangle(5.5, 3.5, 4.5);
        Polygon rectangle = new Rectangle(5.5, 4.5);
        Polygon circle = new Circle(5.5);
        System.out.println("Chitrashree K\n 1BM23CS081");
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
    }
}
