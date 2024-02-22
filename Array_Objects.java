class Student{
    int rollNumber;
    String name;
    int marks;
}

public class Array_Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNumber = 1;
        s1.name = "Hritik";
        s1.marks = 89;
        
        Student s2 = new Student();
        s2.rollNumber = 1;
        s2.name = "Shubham";
        s2.marks = 92;

        Student s3 = new Student();
        s3.rollNumber = 1;
        s3.name = "Yash";
        s3.marks = 90;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
