// class-class -> extends
// class-interface -> implements
// interface-interface -> extends

// an interface is an implementation of an idea where it can be used against abstract class

interface A
{   
    // variable in an interface are not only declared but also defined
    // variables in an interface are by default final and static
    
    // int x;         // final & static
    int x = 10;
    String s = "Sentence";

    // methods in an interface are by default public static
    // public static void show();
    void show();
    void display();
}

interface C extends A
{
    void config();
}

// to define methods of interface classes are used
// a class should define all the methods of a interface

class X implements C
{
    public void show()
    {
        System.out.println("In show");
    }
    public void display()
    {
        System.out.println("In display");
    }
    public void config()
    {
        System.out.println("In config");
    }
}

public class Interfaces
{
    public static void main(String[] args)
    {
        // an interface cannot be instantiated
        A obj = new X();
        obj.show();
        
        C obj1;
        obj1 = new X();
        System.out.println(obj1.x);
        obj1.config();
        obj1.display();    
    }
}
