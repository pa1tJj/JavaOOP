/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7_lab4;

import java.util.Arrays;

/**
 *
 * @author PHAN ANH TUAN
 */
public class PersonTest {

    public static void main(String[] args) {
        Person[] authors = {
            new Person("D", "S"),
            new Person("J", "G"),
            new Person("T", "C"),
            new Person("C", "S"),
            new Person("P", "C"),
            new Person("B", "B")
        };
        Arrays.sort(authors); // Sắp xếp sử dụng phương thức Comparable
        System.out.println("\nSau khi sap xep:");
        for (Person author : authors) {
            System.out.println(author);
        }
    }
}
