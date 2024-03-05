class A
{
    public void show()
    {
        System.out.println("in A");
    }

    // class B is inside class A, it is INNER class
    class B
    {
        public void show()
        {
            System.out.println("in B");
        }
    }
}

public class Inner_Class
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();

        // an inner class can be instantiated as below
        // refering class B to A in obj1 and creating object of class B refering to class B using obj
        A.B obj1 = obj.new B();
        obj1.show();        


        // below is defined an ANONUMOUS class which has no name and is created when an object is instantiated
        // Anonymous class is gwnerally used for overriding
        A obj2 = new A()
        {
            public void show()
            {
                System.out.println("inside ANONYMOUS class");
            }
        };
        obj2.show();
    }

}