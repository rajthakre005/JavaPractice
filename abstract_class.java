import java.util.Scanner;
abstract class Shape{
	abstract void area();
	abstract void draw();
}
class Circle extends Shape{
	double radius;
	Circle(double radius){
	this.radius = radius;
	}
	void area(){
	double area = 3.14 * radius * radius;
	System.out.println("Area of Circle"+area);
	}
	
	void draw(){
	System.out.println("Drawing a Circle:");
	}
}
class Rectangle extends Shape{
	double length;
	double breadth;
	Rectangle(double length,double breadth){
	this.length = length;
	this.breadth = breadth;
	}
	void area(){
	double area = length * breadth;
	System.out.println("Area of Rectangle"+area);
	}

	void draw(){
	System.out.println("Drawing a Rectangle");
	}
}
public class abstract_class{
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

	
