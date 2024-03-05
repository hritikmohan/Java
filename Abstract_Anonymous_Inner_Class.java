abstract class A{
    public abstract void show();
    public abstract void config();

}

// An abstract method can be defined in an anonymous class
// multiple abstract methods can be defined
public class Abstract_Anonymous_Inner_Class {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in show");
            }
            public void config(){
                System.out.println("in config");
            }
        };
        obj.show();
        obj.config();
    }
}
