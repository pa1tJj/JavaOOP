
package studentmanagement;

import data.Student;
import java.util.Scanner;




public class StudentManagement {

   
    public static void main(String[] args) {
        //inputASstudent();
        saveASstudent();
    }
    public static void inputASstudent() {
        String id1, name1;
        System.out.println("in ra duoc chua");
        int yob1;
        double gpa1;
        String h;
        int a = 8;
        int b = 9;
        System.out.println((a+b));
        System.out.println("project so best");
        Scanner sc = new Scanner(System.in);
        System.out.println("input id:");
        id1 = sc.nextLine();
        System.out.println("input name:");
        name1 = sc.nextLine();
        System.out.println("input yob:");
        yob1 = sc.nextInt();
        System.out.println("input gpa:");
        gpa1 = sc.nextDouble();
        Student x = new Student(id1, name1, yob1, gpa1);
        x.showProfile();
    }
    public static void saveASstudent() {
        Student sc = new Student("21103100888", "PHAN ANH TUAN", 2003, 8.5);
        Student mike = new Student("82428", "Mike Brown", 1999, 7.8);
        Student lan = new Student("9374537", "Lan Mai", 2000,8.9);
        sc.showProfile();
        Student.name = "rank cao hon code";
        System.out.println("Mike Name: " + mike.name);
        System.out.println("Mike Name with get: " + mike.getName());
        mike.showProfile();
        System.out.println("SC name: " + sc.name);
        System.out.println("SC name with get: " + sc.getName());
        sc.showProfile();
        System.out.println("Student name: " + Student.name);
        mike.showProfile();
        sc.in();
        mike.in();
        Student.in();
    }
}
