class SuperClass {
    void superClassMethod() {
        System.out.println("SuperClass method");
    }
}

public class Example {
    public static void main(String[] args) {
        // Anonymous class extending SuperClass and overriding superClassMethod
        SuperClass anonymousObject = new SuperClass() {
            @Override
            void superClassMethod() {
                System.out.println("Overridden method in AnonymousClass");
            }

            void additionalMethod() {
                System.out.println("Additional method in AnonymousClass");
            }
        };

        // Calling the overridden method through the anonymous class object
        anonymousObject.superClassMethod();  // Output: Overridden method in AnonymousClass
 // Output: Additional method in AnonymousClass
        // Calling the additional method in the anonymous class
        ((SuperClass) anonymousObject).additionalMethod(); 
    }
}
