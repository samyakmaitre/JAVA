// public class OOPS {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         // s1.name = "shradha";
//         // s1.roll = 456;
//         // s1.password = "abcd";
//         // s1.marks[0] = 100;
//         // s1.marks[1] = 90;
//         // s1.marks[2] = 80;

//         // Student s2 = new Student(s1);
//         // s2.password = "xyz";

        
//     }
// }
 
// class Student{
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     //copy constructor
//     // Student(Student s1){
//     //     this.name = s1.name;
//     //     this.roll = s1.roll;
//     //     marks = new int[3];
//     //     this.marks=s1.marks;
//     // }

//     // Student(String name){
        
//     //     marks = new int[3];
//     // }

//     Student(){
//         System.err.println("constructor is called...");
//         // marks = new int[3];
//     }

// }

public class OOPS{
    public static void main(String args[]){
        Student s1 = new Student();
    }
}

class Student{
    String name;
    int roll;

    Student(){
        this.name = "Samyak";
        this.roll = 234;
    }
}
