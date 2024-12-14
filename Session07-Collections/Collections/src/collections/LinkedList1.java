package collections;

import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(6);
        list.addFirst(100);//thêm phần tử vào đầu danh sách
        list.addLast(99);//thêm phần tử vào cuối danh sách
        list.add(2,1111);//thêm giá trị 1111 vào vị trí thứ 2 trong danh sách
        for (int integer : list) {
            System.out.println(integer + " ");
        }
    }
}
