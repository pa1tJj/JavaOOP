/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement2;

import data.Shelf;
import data.Student;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentManagement2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shelf s = new Shelf(" "," ");
        Shelf s1 = new Shelf("uew", "rfeow");
        s1.addAStudent();
        s.addAStudent();
        System.out.println("output");
        s.outStudentList();
        System.out.println("output s1");
        s1.outStudentList();
    }
    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id,name;
        int yob;
        double gpa;
        int n;
        System.out.println("nhap so luong sinh vien:");
        n = Integer.parseInt(sc.nextLine());
        Student s[] = new Student[n];
        for(int i = 0; i < n; i++) {
            System.out.println("nhap ma so:");
            id = sc.nextLine();
            System.out.println("nhap ho ten:");
            name = sc.nextLine();
            System.out.println("nhap tuoi:");
            yob = Integer.parseInt(sc.nextLine());
            System.out.println("nhap diem:");
            gpa = Double.parseDouble(sc.nextLine());
            s[i] = new Student(id, name, yob, gpa);
        }
        System.out.println("SHOW PROFILE");
        for(Student x:s) {
            x.showProfile();
        }
    }
}
