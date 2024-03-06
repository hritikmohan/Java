interface A
{
    void show();
}

interface B
{
    void show(int i, int j);
}

public class Lambda_Expression
{
    public static void main(String[] args)
    {
        // lambda expression reduces lines of code for a single method definition
        

        // WITHOUT LAMBDA EXPRESSION
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in show");
            }
        };
        obj.show();


        //WITH LAMBDA EXPRESSION
        A obj1 = () -> System.out.println("In LAMBDA show");
        obj1.show();
        

        // parameters can also be passed in lambda expessions
        
        // for single parameter
        // B obj2 = i -> System.out.println("In B Lambda " + i);
        B obj2 = (i,j) -> 
        {
            System.out.println("In B lambda 2 parameter " + i + " " + j);
            System.out.println("Another statement in lambda 2 parameter");
        };
            obj2.show(5, 9);
    
    }   
}