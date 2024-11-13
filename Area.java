import java.util.*;

abstract class Shape{
	public abstract void findArea();
}

class Rectangle extends Shape{
	int length, breadth;
	int area;
	Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public void findArea(){
		area=length*breadth;
		System.out.println("Area of the Rectangle is "+area);
	}
}

class Triangle extends Shape{
	int base, height;
	double area;
	Triangle(int base, int height){
		this.base=base;
		this.height=height;
	}
	public void findArea(){
		area=0.5*base*height;
		System.out.println("Area of the triangle is "+area);
	}
}

class Circle extends Shape{
	int radius;
	double area;
	Circle(int radius){
		this.radius=radius;
	}
	public void findArea(){
		area=3.14*radius*radius;
		System.out.println("Area of the circle is "+area);
	}
}

public class Area{
	public static void main(String[] args){
    System.out.println("Chitrashree K\n 1BM23CS081");
		Scanner a=new Scanner(System.in);
		System.out.println("To find the area of rectangle:");
		System.out.println("enter length and breadth of the rectangle:");
		int l=a.nextInt();
		int b=a.nextInt();
		Rectangle r=new Rectangle(l, b);
		r.findArea();

		System.out.println("\nTo find the area of triangle:");
		System.out.println("enter base and height of the triangle:");
		int ba=a.nextInt();
		int h=a.nextInt();
		Triangle t=new Triangle(ba, h);
		t.findArea();

		System.out.println("\nTo find the area of circle:");
		System.out.println("enter radius of the circle:");
		int ra=a.nextInt();
		Circle c=new Circle(ra);
		c.findArea();
	}
}
