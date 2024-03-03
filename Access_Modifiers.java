// Access modifiers allow access control for variables and methods inside and outside classes and packages.
// Four types of access modifiers:
//      Private, Public, Protected, Default

import Test.*;

public class Access_Modifiers {

    public static void main(String[] args) {
        Test1 obj = new Test1();

        // here x can be accessed because 'x in Test1' is public
        System.out.println(obj.x);

        // it will show 'x is not visible' error as the access modifier is "default" which cannot accessed outside the package
        // System.out.println(obj.x);
    }
}