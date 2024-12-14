/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7_lab4;

/**
 *
 * @author PHAN ANH TUAN
 */
public class Person implements Comparable<Person>{
    private String fname;
    private String lname;

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Person{" + "fname=" + fname + ", lname=" + lname + '}';
    }

    @Override
    public int compareTo(Person o) {
        int result = lname.compareTo(o.lname);
        return result == 0 ? fname.compareTo(((Person)o).fname) : result;
    }
    
}
