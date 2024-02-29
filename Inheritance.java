// Inheritance is when the properties of one class are acquired or used by other class
// In the below example, properties of GrandFather class can be used by Father class.
// A keyword 'extend' is used to create inherited class.
//      <sub-class> extends <super-class>
//      <parent-class> extends <child-class>
//      <base-class> extends <derived-class>


public class Inheritance {
    public static void main(String[] args) {
        // GrandFather obj = new GrandFather();
        // obj.car();
        // obj.home();

        Father obj1 = new Father();
        obj1.car();
        obj1.home();
        obj1.bike();
        obj1.mobile();
    }
    
}
