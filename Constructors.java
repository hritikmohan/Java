class Detail{
    int age;
    String name;

    // A constructor is a method which initailizes instances when an object is created.
    // When no constructor is defined, a blank default constructor is called.
    Detail(){
        age = 12;
        name = "Hritik";
    }

    // This is a parametrized constructor.
    Detail(int age, String name){
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println(age + name);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Detail obj = new Detail();
        Detail obj1 = new Detail(35, "Mohan");
        obj.display();
        obj1.display();


    }
}
