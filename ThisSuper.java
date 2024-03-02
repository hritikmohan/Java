class A {
    public A() {
        System.out.println("In A");
    }

    public A(int n) {
        System.out.println(n);
        System.out.println("In A int");
    }
}

class B extends A {
    public B() {
        // super() is a default statement (not explicitly mentioned) inside a constructor to call the constructor of its parent class
        super();
        System.out.println("In B");
    }
    
    public B(int n) {
        // super(parameter) can be used inside a parameterized constructor to call the parameter constructor of its parent class
        super(n);
        System.out.println("In B int");
    }
}

class C extends B{
    public C() {
        System.out.println("In C");
    }
    
    public C(int n) {
        // this() is used to call the self constructor
        this();
        System.out.println("In C int");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        C obj = new C(5);
    }
}
