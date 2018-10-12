package typeconversion;

/**
 *
 * @author agozie
 */
public class TypeConversion {

    /**
     * @param args the command line arguments
     */
    // Type promotion rules:
    // 1. All byte, short and char values are promoted to int.
    // 2. If one operand in an expression is long, the whole expression is promoted to long.
    // 3. Rule 2 also apllies for float and double data type.
        
    public static void main(String[] args) {
            byte b = 42;
            char c = 'a';
            short s = 1024;
            int i = 50000;
            float f = 5.67f;
            double d = .1234;
            double result = (f*b) + (i*c) - (d*s);
//            System.out.println((f*b) + " + " (i / c) + " - " + (d*s));
            
    }

}
