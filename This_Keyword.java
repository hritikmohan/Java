class Human{
    private int age;
    private String name;

    // 'this’ is a reference variable that refers to the current object, or can be said “this” in Java is a keyword that refers to the current object instance
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class This_Keyword {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(10);
        obj.setName("Hritik");
                
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        
    }
}
