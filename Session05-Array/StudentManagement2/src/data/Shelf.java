/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Shelf {

    String color;
    String label;
    private Student ds[] = new Student[100];
    private Scanner sc = new Scanner(System.in);
    private int n = 0;

    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;
        System.out.println("nhap ma so:");
        id = sc.nextLine();
        System.out.println("nhap ho ten:");
        name = sc.nextLine();
        System.out.println("nhap tuoi:");
        yob = Integer.parseInt(sc.nextLine());
        System.out.println("nhap diem:");
        gpa = Double.parseDouble(sc.nextLine());
        ds[n] = new Student(color, label, yob, gpa);
        n++;
    }

    public void outStudentList() {
        for (int i = 0; i < n; i++) {
            ds[i].showProfile();
        }
    }

    public void inputStudentList() {
        String id, name;
        int yob;
        double gpa;
        System.out.println("nhap ma so:");
        id = sc.nextLine();
        System.out.println("nhap ho ten:");
        name = sc.nextLine();
        System.out.println("nhap tuoi:");
        yob = Integer.parseInt(sc.nextLine());
        System.out.println("nhap diem:");
        gpa = Double.parseDouble(sc.nextLine());
        ds[n] = new Student(id, name, yob, gpa);
        n++;
    }

}
