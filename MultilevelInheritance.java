public class MultilevelInheritance {
    public static void main(String[] args) {
        
        // This is caused due to multilevel inheritance
        Me obj2 = new Me();
            obj2.car();
            obj2.home();
            obj2.bike();
            obj2.mobile();
            obj2.degree();
            obj2.city();
    }
}
