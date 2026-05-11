abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Pentagon extends Shape{
    void draw(){
        System.out.println("Drawing Pentagon");
    }
}
class Hexagon extends Shape{
    void draw(){
        System.out.println("Drawing Hexagon");
    }
}
public class abstract_class{
    public static void main(String[] args){
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Pentagon();
        Shape s4 = new Hexagon();
        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();
    }
}