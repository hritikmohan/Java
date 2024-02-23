class Mobile{
    String brand;
    int price;
    static String type;

    public void show(){
        System.out.println(brand + " : " + price + " : " + type);
    }
}

// When a static variable is used, it becomes a class variable i.e., its value is same for all the objects.
// A statis variable should be called via class name.

public class Static_Variable {
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

        //Any change ia a static variable by any object reflects in all the objects as shown below:
        obj1.type = "Symbion";

        obj1.show();
        obj2.show();
    }
}
