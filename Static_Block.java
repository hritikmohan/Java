class Mobile{
    String brand;
    int price;
    static String type;

    public Mobile(){
        brand = "";
        price = 200;
        type = "Phone";
        System.out.println("in constructor");
    }

    // A static block is one in which only the static members can be called irrespective of any method.
    // It is called when the class loader in JVM loads the class therefore, it always executes immediately after the class loads regardless of the order in which it is called.
    static{
        type = "Mobile";
        System.out.println("in static block");

    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + type);
    }
}

public class Static_Block {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile obj1 = new Mobile();
        
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.type = "Smartphone";
        
        // Mobile obj2 = new Mobile();


        // The below statement is to only load the class. The output shows that static block is executed which represents that it is called when the class has loaded.
        Class.forName("Mobile");
    }
}
