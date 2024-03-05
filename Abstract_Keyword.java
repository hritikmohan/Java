// abstract keyword is used to declare classes and objects
// declaring method in parent class and defining in subclass

// abstract method can only be declared in abstract class
abstract class Car{
    // asbtract method is declared when its definition is not clear
    public abstract void drive();
    public abstract void sunroof();
    
    public void music(){
        System.out.println("Listening to music");
    }
}

// an abstract method is defined in a subclass
// if a subclass of an abstract class is present, abstract method must be declared 
// all the abstract methods must be defined in all the subclasses
class Swift extends Car{
    public void drive(){
        System.out.println("manual drive");
    
    }
    public void sunroof(){
        System.out.println("no sunroof");
    
    }
}

class Creta extends Car{
    public void drive(){
        System.out.println("automatic drive");
    
    }
    public void sunroof(){
        System.out.println("panoramic sunroof");
    
    }
}

// no effect on sub-sub-classes
class Creta24 extends Creta{

}

public class Abstract_Keyword {
    public static void main(String[] args) {
        // an abstract class cannot be instantiated
        // Car obj = new Car();
        Car obj1 = new Swift();
        obj1.drive();
        obj1.music();

        Car obj2 = new Creta();
        obj2.drive();
        obj2.music();
    }
}