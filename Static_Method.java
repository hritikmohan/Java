class Mobile{
    String brand;
    int price;
    static String type;

    public void show(){
        System.out.println(brand + " : " + price + " : " + type);
    }

    // A static method is similar to static variable, it is defined for the class i.e., all objects of a class
    // It is called like static variable - <Class_Name>.<method_name>

    public static void show1(){
        System.out.println("In Static Method");
    }

    // To use variables of an object in a static method, the objects should be used as parameter.

    public static void show2(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + type);
    }
}

public class Static_Method {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.type = "Smartphone";
        
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.type = "Smartphone";

        obj1.show();
        obj2.show();

        System.out.println();
        
        obj1.show();
        obj2.show();
        
        System.out.println();

        Mobile.show1();
        Mobile.show2(obj1);
    }
}
