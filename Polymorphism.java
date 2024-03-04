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

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}