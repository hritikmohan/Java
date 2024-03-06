interface A{
    int add(int i, int j);
}


public class Lambda_Return {
    public static void main(String[] args) {
        A obj = new A() {
            public int add(int i, int j){
                return i+j;
            }
        };
        
        int result = obj.add(5,8);
        System.out.println("Without lambda expession");
        System.out.println(result);
        

        // for only return statement, the return can be implemented as shown below
        A obj1 = (i, j) -> i+j;
        int result1 = obj1.add(5,6);
        System.out.println("With lambda expession");
        System.out.println(result1);
    }
    
}