class Calc{
    public int add(int a, int b){
        return a+b;
    }
}

class AdvCalc extends Calc{
    public int add(int a, int b){
        return a+b+1;
    }
}

// Above two classes have methods with same name and parameters due to which the on calling the method the method of the lower-most(sub-class) class will be called overridding the method of the higher(super) class

public class MethodOverriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(5, 6));
    }
    
}