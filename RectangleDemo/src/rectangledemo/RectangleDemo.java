package rectangledemo;

class Rectangle{
    double length;
    double breadth;
    
    void setLength(int len)
    {
        length = len;
    }
}

public class RectangleDemo {
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        System.out.println("Before function length: " + r1.length);
        r1.setLength(20);
        System.out.println("After function length: " + r1.length);
    }
}
