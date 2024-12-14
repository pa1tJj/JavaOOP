/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListWithObj;

/**
 *
 * @author Admin
 */
public class StudentManager {
    public static void main(String[] args) {
        StudentList st = new StudentList();
        System.out.println("input st");
        st.addStudent();
        st.addStudent();
        st.printStudentList();
        st.updateStudent();
        System.out.println("sau update");
        st.printStudentList();
    }
}
