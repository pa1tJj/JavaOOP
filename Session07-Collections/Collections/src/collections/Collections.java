/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import data.StudentManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<StudentManager> a = initData();
        StudentManager xx = timKiem(a, "m555");
        if(xx == null) {
            System.out.println("not found");
        }else{
            xx.show();
        }
    }
    
    public static void sortWithCollection2() {
        List<StudentManager> st = new ArrayList();
        st.add(new StudentManager("iahger", "kfa", 2000, 5.5));
        st.add(new StudentManager("fihfgew", "foew", 2003, 6.6));
        System.out.println("list");
        for (StudentManager studentManager : st) {//trong st là một đống con trỏ, được hiểu như studentManager = st[0], st[1]....
            studentManager.show();
        }
        
        
        
        StudentManager tmp = st.get(0);
        st.set(0, st.get(1));//con trỏ thứ 0 trong giỏ phải trỏ vào thằng mới là st.get(1)
        st.set(1, tmp);//con trỏ 1 thay cách trỏ, trỏ vùng tmp đang trỏ
        //vùng new StudentManager vẫn nằm im, chỉ có con trỏ trong giỏ trỏ lại vùng new
        System.out.println("sap xep");
        for (int i = 0; i < st.size(); i++) {
            StudentManager x = st.get(i);//lấy tọa độ đang nằm trỏ thứ i
            x.show();
        }
        
        st.remove(1);//phương thức xóa ở vi tri thứ 1
        System.out.println("danh sach sau khi xoa");
        for (int i = 0; i < st.size(); i++) {
            StudentManager x = st.get(i);//lấy tọa độ đang nằm trỏ thứ i
            x.show();
        }
    }
    
    public static void playWithSet() {
        //Set: là một loại giỏ, túi mà k cho phép trùng, không cho phép trỏ trùng 1 vùng new
        Set<StudentManager> a = new HashSet();
        StudentManager sm = new StudentManager("ekg", "an", 22, 4.4);
        a.add(sm);
        a.add(new StudentManager("jgd", "phat", 20, 3.5));
        a.add(new StudentManager("jgd", "phat", 20, 3.5));//không trùng vì có new có cùng ram mới,obj mới,trùng info trong new không ảnh hưởng gì
        //set k chấp nhận con trỏ trùng vùng new
        //set k có hàm get() vì khi add vào thì thứ tự không giữ nguyên
        for (StudentManager x : a) {//duyệt qua từng con trỏ,lấy tọa độ từng a rồi gán vào con trỏ x
            x.show();
        }
    }
     
    public static void playWithCollection() {
        List arr = new ArrayList(); //chứa lộn xộn tất cả các đôi tượng 
        List<StudentManager> a = new ArrayList();//chứa đồng 1 đối tượng generic
        List<StudentManager> a1 = new ArrayList<>();
        List<StudentManager> a2 = new ArrayList<StudentManager>();
        //a.add();lưu con trỏ, new StudentManager()
        StudentManager s1 = new StudentManager("qtu4343", "pan anh tun", 22, 8.8);
        StudentManager s2 = new StudentManager("jiehg", "agjre", 19, 7.9);
        a.add(s1);// vùng new ArrayLít có thêm 1 con trỏ
        a.add(s2);// sinh ra thêm 1 con trỏ nữa
        a.add(s1);//add trùng một đối tượng được
        a.add(new StudentManager("giehwg", "ìee", 22, 5.7));
        System.out.println("so doi tuong trong arraylist:" + a.size());
        //get(vi tri doi tuong muon lay): trả về tọa độ con trỏ thứ i, trả về địa chỉ vùng new đang trỏ
        // get(i) trả về tham chiếu con trỏ thues i
        StudentManager x = a.get(0);// trả về vị trí tọa độ con trỏ,gán  vào biến Student Manager khác nắm cùng tọa độ
        a.get(1).show();
        System.out.println("xuat het:");
        for (StudentManager xxx : a) {
            xxx.show();
        }
        System.out.println("xuat het cach 2:");
        for (int i = 0; i < a.size(); i++) {
            a.get(i).show();
        }
    }
    public static List<StudentManager> initData() {
        List<StudentManager> st;
        st = new ArrayList();
        st.add(new StudentManager("m555", "kfa", 2000, 5.5));
        st.add(new StudentManager("fihfgew", "foew", 2003, 6.6));
        return st;//initData() = st;
        //st ơi đang trỏ new nào cho tên hàm tao trỏ với
    }
    
    public static void inKieuMoiList() {
        List<StudentManager> result = initData();
        for (StudentManager x : result) {
            x.show();
        }
    }
    
    public static StudentManager timKiem(List<StudentManager> st, String id) {
        for (StudentManager x : st) {
            if(x.getId().equalsIgnoreCase(id)) {
                return x;
            }
        }
        return null;
    }
}
