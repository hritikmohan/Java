// Ducking the exceptions means to transfer the responsibility of handling the exception to other class
// throws keyword is used in ducking the exception
// throws keyword is used with methods only

class A{
    public void show() throws ClassNotFoundException{
        Class.forName( "ducking");
    }
}


public class ducking_exception {
    static{
        System.out.println("ducking_exception class loaded");
    }
    // throws keyword should not be used with the main method
    public static void main(String[] args) {
        try{
            A obj = new A();
            obj.show();
        }
        catch(Exception e){
            System.out.println("Required class not found" + e);
            e.printStackTrace();
        }
    }
}