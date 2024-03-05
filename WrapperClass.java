// Wrapper classes are the classes of primitive data types which allow them to be treated as objects
// Wrapper classes provide additional methods and functionalities in programming context
// Autoboxing and auto-unboxing are features in Java that simplify the process of converting between primitive data types and their corresponding wrapper classes. 


public class WrapperClass {
    public static void main(String[] args) {
        int num = 9;
        System.out.println("num="+num);
        //Integer num1 = new Integer(10);    --->  Depricated or no longer in use

        // Auto-boxing
        Integer num1 = num;
        System.out.println("num1="+num1);
        
        Integer num2 = 10;
        System.out.println("num2="+num2);
        
        // Auto-unboxing
        int num3 = num2;
        System.out.println("num3="+num3);
    }
}