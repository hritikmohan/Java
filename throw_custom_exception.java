// A custom exception can be be created by creating the class of the exception such that it extends Exception class

class MyException extends Exception{

    // to call custom exception, constructor is required
    public MyException(String str){

        // custom exception is a subclass for Exception class which takes string as a parameter, to get custom message via custom exception Exception class should be passed with the string as the parameter
        super(str);
    }
}

public class throw_custom_exception {
    public static void main(String[] args){
        int i = 20;
        int j = 0;

        try{
            j =18/i;
            if(j==0){

                // throw keyword is used to throw exceptions based on certain conditions
                throw new ArithmeticException("I don't want to print zero");
            }
        }
        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("Exception thrown" + e);
        }

        try{
            if(j==18){
                throw new MyException("Random Exception");
            }
        }
        catch(MyException e){
            System.out.println("in Custom exception" + e);
        }

        System.out.println("Exception handled");
        System.out.println("bye");
    }
    
}