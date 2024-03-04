// Every class implicitly extends Object class predefined in java
// Object.class contains pre-defined methods which be used with the objects. These are:
//     * tostring() method
//     * hashCode() method
//     * equals(Object obj) method
//     * finalize() method
//     * getClass() method
//     * clone() method
//     * wait(), notify() notifyAll() methods


class A{

}

public class Object_Class {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.toString());
    }
    
}