interface Shape {
    void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Hexagon implements Shape{
    public void draw(){
        System.out.println("Drawing Hexagon");
    }
}
class Pentagon implements Shape{
    public void draw(){
        System.out.println("Drawing Pentagon");
    }
}
class Triangle implements Shape{
    public void draw(){
        System.out.println("Drawing Triangle");
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Hexagon();
        Shape s4 = new Pentagon();
        Shape s5 = new Triangle();
        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();
        s5.draw();
    }
}