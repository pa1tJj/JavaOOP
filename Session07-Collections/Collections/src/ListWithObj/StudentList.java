/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListWithObj;

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
        String id;
        while (true) {
            System.out.print("nhap id:");
            id = sc.nextLine();
            Student x = searchStudent(id);
            if(x == null) {
                break;
            }else {
                System.out.println("id bi trung.nhap lai");
            }
        }
        System.out.print("nhap ten:");
        String name = sc.nextLine();
        System.out.print("nhap nam sinh:");
        int yob = Integer.parseInt(sc.nextLine());
        System.out.print("nhap diem:");
        double gpa = Double.parseDouble(sc.nextLine());
        st.add(new Student(id, name, yob, gpa));
        System.out.println("them thanh cong");
    }

    public void printStudentList() {
        if (st.isEmpty()) {
            System.out.println("danh sach rong");
            return;
        }
        for (Student student : st) {
            student.show();
        }
    }

    public Student searchStudent(String iD) {
        if (st.isEmpty()) {
            return null;
        }
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).getId().equalsIgnoreCase(iD)) {
                return st.get(i);
            }
        }
        return null;
    }

    public void searchAsStudent() {
        System.out.println("nhap id can tim:");
        String key = sc.nextLine();
        Student x = searchStudent(key);
        if (x == null) {
            System.out.println("not found");
        } else {
            x.show();
        }
    }
    
    public void updateStudent() {
        System.out.print("nhap id sinh vien can update:");
        String idNew = sc.nextLine();
        double gpaNew;
        Student x = searchStudent(idNew);
        if (x == null) {
            System.out.println("not found!nothing update");
        } else {
            x.show();
            System.out.print("nhap diem moi:");
            gpaNew = Double.parseDouble(sc.nextLine());
            x.setGpa(gpaNew);
            System.out.println("in lai sau khi cap nhat");
            x.show();
        }
    }
    public void updateAStudent(Student x, double newGPA) {
        x.setGpa(newGPA);
    }
    public void updateAsStudent(double newGPA, String id) {
        Student x = searchStudent(id);
        if(x == null) {
            System.out.println("not found!nothing update");
            return;
        }
        //x.setGpa(newGPA);
        updateAStudent(x, newGPA);
    }
    
    
}
