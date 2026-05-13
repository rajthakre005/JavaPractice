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
public class abstract_class{
    public static void main(String[] args){
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();
    }
}
