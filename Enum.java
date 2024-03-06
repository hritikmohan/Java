// enum is used to create a list of objects/constants
// enum creates a class i.e., Laptop is a class here therefore we can also use methods with enum
// enum is like array of objects being indexed from 0
// |    0    |     1    |   2    |     3    |
// | Macbook | Inspiron | Vostro | Thinkpad |



enum Laptop{
    Macbook(2200), Inspiron(2000), Vostro, Thinkpad(2500);
    // whenever an enum object is created a default constructor is called enum being a class

    private int price;

    private Laptop(){
        price = 500;

    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

enum Car{
    Swift, Creta, Brezza, Baleno, Verna
}

public class Enum {
    public static void main(String[] args) {
        Laptop lap = Laptop.Inspiron;
        System.out.println(lap);

        Laptop[] lap1 = Laptop.values();
        for(Laptop l : lap1)
        {
            System.out.println(l + " : " + l.ordinal());
        }

        Laptop lap2 = Laptop.Macbook;
        System.out.println(lap2);

        for(Laptop l : Laptop.values()){
            System.out.println(l + " : " + l.getPrice());
        }

        // enums can be used with if and switch
        Car c = Car.Brezza;

        if(c == Car.Swift)
            System.out.println(1);
        else if(c == Car.Creta)
            System.out.println(2);
        else if(c == Car.Brezza)
            System.out.println(3);
        else if(c == Car.Baleno)
            System.out.println(4);
        else
            System.out.println(5);
            
        
        switch (c) {
            case Swift:
                System.out.println(1);
                break;
            case Creta:
                System.out.println(2);
                break;
            case Brezza:
                System.out.println(3);
                break;
            case Baleno:
                System.out.println(4);
                break;
            case Verna:
                System.out.println(5);
                break;
            default:
                break;
        }
    }   
}
