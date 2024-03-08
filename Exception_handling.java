// Exceptions in java are handled using 'try-catch block'
// Exceptions are something which can be handled
public class Exception_handling {
    public static void main(String[] args) {
        
        int i = 2;
        int j = 0;
        int arr[] = new int[5];
        String s = null;
        
        // in 'try' block, the code which is suspected for exception is written        
        try{
            j = 18/i;
            System.out.println(j);
            System.out.println(s.length());
            System.out.println(arr[2]);
            System.out.println(arr[5]);
        }

        // if there is an exception, compiler jumps to catch block executing the statements inside the catch block
        // multiple catch statements can be used for multiple exceptions

        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index>4");
        }

        // 'Exception e' contains all types of exceptions i.e., it is superclass for all types of excep1tions, used to get catch for unknown exceptions
        // should be used at the last, if used in the starting, will not execute specified catch blocks

        catch(Exception e){
            System.out.println("Something went Wrong!!!" + e);
        }

        System.out.println("Exception Handled");
        System.out.println("Have A Good Day");

    }
    
}