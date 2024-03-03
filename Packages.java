// A package is like a folder which contains class/files which can be used inside the code
// package <folder-name> is used to make a directory/folder a package
// a class can be imported form a package by using below statement
//      import folder.sub-folder.<class-name>; for a specific class file inside the folder/package
//      import folder.sub-folder.*; for all the class files inside the folder/package
//      * is used to import all the files not the folders

// import Test.Test;
// import Test.Test1;

import Test.*;


public class Packages {
    public static void main(String[] args) {
        Test obj1 = new Test();
        Test1 obj = new Test1();
        obj.show();
        obj1.display();
    }
}
