package additionmethod;

public class AdditionMethod {
    static int add(int one, int two)
    {
        System.out.println("This method accepts two ints");
        int sum;
        sum = one + two;
        return sum;
    }
    
    static int add(int one, int two, int three)
    {
        System.out.println("This method accepts three ints");
        int sum;
        sum = one + two + three;
        return sum;
    }
    
    static int add(int one, int two, int three, int four)
    {
        System.out.println("This method accepts four ints");
        int sum;
        sum = one + two + three + four;
        return sum;
    }
    
    static void add()
    {
        System.out.println("This method accepts no parameter");
        System.out.println("This method accepts no value");
    }
    
    static String add(int one, String two)
    {
        System.out.println("This method accepts one int and one string");
        String concate = one + two;
        return concate;
    }
    
    public static void main(String[] args)
    {
        int answer;
        answer = add(4,5,6);
        System.out.println("Your answer is " + answer);
    }
}
