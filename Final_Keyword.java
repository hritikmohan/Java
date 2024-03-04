// final keyword is used with variables, methods, classes

// with class, prevents inheritance
// final class Calc{
    class Calc{
        // with methods, prevents method overriding
        // public final void show(){
            public void show(){
                System.out.println("In Class Calc");
            }
            public void add(int a, int b){
                System.out.println(a+b);
            }
        }

        class AdvCalc extends Calc{
            public void show(){
                System.out.println("In Class AdvCalc");
    }
}

public class Final_Keyword {
    public static void main(String[] args) {
        // with variables, make the variable constant i.e., the value of variable cannot be changed
        // final int num = 8;
        int num = 8;
        num = 9;
        System.out.println(num);
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(5, 8);
    }  
}
