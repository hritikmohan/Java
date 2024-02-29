class A{
    A(){
        System.out.println("Object created");
    }

    void show(){
        System.out.println("In A Show");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {

        // An object which is created in heap memory but has no reference variable to access is called anonymous object
        // Here, new A() is creating an object but the same object has no reference.
        new A().show();
        new A().show();

    }
}
