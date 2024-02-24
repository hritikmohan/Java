/* private instance variables are not directly accessible
    so they are bundled up with the methods in order to perform operations on them
    this bundling of private instance variables and methods is called encapsulation.
*/

class Human{
    private int age;
    private String name;

    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        
        // obj.name = 12;    ---> it will give error

        obj.setAge(10);
        obj.setName("Hritik");
                
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        
    }
}
