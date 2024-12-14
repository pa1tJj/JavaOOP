/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import ListWithObj.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentList {
    private List<Student> st = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public StudentList() {
    }
    
    public void addStudent() {
        System.out.println("nhap sinh vien thu:" + (st.size() + 1));
        System.out.print("nhap id:");
        String id = sc.nextLine();
        System.out.print("nhap ten:");
        String name = sc.nextLine();
        System.out.print("nhap nam sinh:");
        int yob = Integer.parseInt(sc.nextLine());
        System.out.print("nhap diem:");
        double gpa = Double.parseDouble(sc.nextLine());
        st.add(new Student(id, name, yob, gpa));
    }
    
    public void printStudentList() {
        if(st.isEmpty()) {
            System.out.println("danh sach rong");
            return;
        }
        for (Student student : st) {
            student.show();
        }
    }
}
