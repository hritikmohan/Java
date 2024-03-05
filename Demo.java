class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B");
    }
    public void display(){
        System.out.println("in B display");
    }
}
public class Demo {
    // public static void main(String args[]){
    //     int x = 2;
    //     int y = 6;
        
    //     int a = 9;
    //     int b=6;

    //     if(x<y && a>b){
    //         System.out.println("x<y a>b");
    //     }
    //     else if(x>a || y<b){
    //         System.out.println("Temp");
    //     }
    //     else 
    //         System.out.println("bye");    
    // }

        public static void main(String args[]){
            A obj = new B();
            obj.show();
            obj.display();
        }
}
