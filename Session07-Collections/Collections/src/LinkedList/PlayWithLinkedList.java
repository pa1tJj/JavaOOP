/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class PlayWithLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(1);
        li.add(99);
        li.add(88);
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }
        li.addFirst(20);
        System.out.print("\nsau khi them vao dau:");
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }
        li.addLast(99);
        System.out.print("\nsau khi them vao cuoi:");
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }
        System.out.print("\nphan tu dau tien trong dslk:" + li.getFirst());
        System.out.print("\nphan tu cuoi dslk:" + li.getLast());
        li.remove(1);
        System.out.print("\ndanh sach sau khi xoa:");
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }
        System.out.print("\nkiem tra trong danh sach co chua 200:" + li.contains(200));
        System.out.print("\nvi tri dau tien cua 99:" + li.indexOf(99));
        System.out.print("\nvi tri cuoi cung cua 99:" + li.lastIndexOf(99) + "\n");
    }
}
