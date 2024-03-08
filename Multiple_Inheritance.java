// Multiple inheritance in java can be implemented using interfaces

interface A{
    void show();
}

interface B{
    void display();
}

// One class can implement two interfaces simultaneously but cannot extend two classes simultaneously
class C implements A, B{
    public void show(){
        System.out.println("in show");
    }
    public void display(){
        System.out.println("in display");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();

    }
}
