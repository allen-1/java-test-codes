package shape;

class Shape {
    public String toString() {
        return "a shape";
    }
}
class Triangle extends Shape{
    public String toString()
    {
        return "a triangle";
    }
}

public class DrawShape{
    static void draw(Shape s){
        System.out.println("Drawing " + s);
    }
    public static void main(String[] args){
        Shape s = new Shape();
        draw(s);
        // a triangle object is created but stored in a Shape Data Type
        Shape t = new Triangle();
        draw(t);
    }
}