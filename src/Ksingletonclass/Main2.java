package Ksingletonclass;
import java.util.*;

class Student {

    private String rollNo;
    private static int count = 1;


    private String generateRollNo() {
        Date d = new Date();
        String rn = "univ-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return rn;
    }


    public Student() {
        rollNo = generateRollNo();
    }

    
    public void display() {
        System.out.println("Roll No: " + rollNo);
    }
}

public class Main2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.display();
        s2.display();
        s3.display();
    }
}