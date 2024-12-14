/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class PlayWithTreeSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> tre = new TreeSet<>();//mặc định sắp xếp tăng dần , không chứa phần tử trùng
        tre.add(88);
        tre.add(12);
        tre.add(77);
        tre.add(2);
        tre.add(12);
        for (Integer integer : tre) {
            System.out.print(integer + " ");
        }
        System.out.print("\nnhap gia tri phan tu can them:");
        int n = sc.nextInt();
        if(tre.contains(n)) {
            System.out.println(n + " ton tai trong treeSet");
        }else {
            tre.add(n);
            System.out.print("them thanh cong");
            System.out.print("\ndanh sach sau khi them:");
            for (Integer integer : tre) {
                System.out.print(integer + " ");
            }
        }
        TreeSet<Integer> newTree = new TreeSet<>();
        newTree.add(1999);
        newTree.addAll(tre);//thêm tất cả phần tử của tre và newTree
        System.out.print("\nnewTree dau khi them:");
        System.out.print(newTree + " ");
        System.out.print("\ncac phan tu trong subset:");
        System.out.print(newTree.subSet(4, 88));//trả về 1 danh sách từ giá trị >= 4 đến giá trị < 88
        System.out.print("\nsanh sach headSet():" + newTree.headSet(100));// trả về danh sách từ phần tử đầu tiên đến giá trị phần tử  < 100
        System.out.print("\ndanh sách tailSet():" + newTree.tailSet(77));//trả về danh sách từ phần tử >=77 đến cuối danh sách
        System.out.print("\nphan tu nho nhat danh sach:" + newTree.first());
        System.out.print("\nphan tu lon nhat danh sach:" + newTree.last());
    }
}
