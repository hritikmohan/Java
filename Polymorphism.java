// Polymorphism is when methods perform tasks in multiple forms
// Same object or same reference will have different behaviour based on how the instance is created
// Two types of polymorphism:
//      Compile-time Polymorphism
//      Run-time Polymorphism


// RUN-TIME POLYMORPHISM can be implemented using Dynamic Method Dispatch

class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
    public void config(){
        System.out.println("in config");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}

// Dynamic method dispatch can be implemented when there is inheritance

public class Polymorphism {

    public static void main(String[] args) {

//      Type of object remains the same but the reference changes which changes the behaviour

        A obj = new A();
        obj.show();

        A obj1 = new B();
        obj1.show();

        // below statement will give error: config method not defined for A
        // i.e., with reference of superclass and object of subclass only method of superclass can be called and method overriding is possible
        obj1.config();

        A obj2 = new C();
        obj2.show();
    }
}