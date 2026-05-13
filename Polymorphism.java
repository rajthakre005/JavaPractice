import java.util.Scanner;
interface Shape{
	void area();
	void draw();
}
class Circle implements Shape{
	double radius;
	Circle(double radius){
	this.radius=radius;
	}
	public void area(){
	double area = 3.14*radius*radius;
	System.out.println("Area of Circle:"+area);
	}

	public void draw(){
		System.out.println("Drawing a Circle");
	}
}
class Rectangle implements Shape{
	double length,breadth;
	Rectangle(double length,double breadth){
	this.length = length;
	this.breadth = breadth;
	}
	public void area(){
	double area = length*breadth;
	System.out.println("Area of Rectangle"+area);
	}

	public void draw(){
		System.out.println("Drawing a Rectangle");
	}
}
public class Polymorphism{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius for Circle:");
	double r = sc.nextDouble();
	System.out.println("Enter length for Rectangle:");
	double l = sc.nextDouble();
	System.out.println("Enter breadth for Rectangle:");
	double b = sc.nextDouble();
	
	Shape s1 = new Circle(r);
	Shape s2 = new Rectangle(l,b);
	s1.draw();
	s1.area();
	s2.draw();
	s2.area();
	
	}
}
