// A functional interface is an interface with only one method

@FunctionalInterface
interface A
{
    void show();
    // void config();    // this will give error
}

class B implements A
{
    public void show()
    {
        System.out.println("In B Show");
    }
}

public class Functional_Interface 
{
    public static void main(String[] args)
    {
        A obj = new B();
        obj.show();

        A obj1 = new A()
        {
            public void show()
            {
                System.out.println("In anonymous abstract class");
            }
        };
        obj1.show();
    }
}
