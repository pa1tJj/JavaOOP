/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data;

/**
 *
 * @author Admin
 */
//là nơi gom những class , obj mà có chung hành động
//tập hợp những hành động, giao tiếp/interface cũng là hình thức gom khuôn, obj phân loại về nhóm gì đó
//lỏng lẻo hơn kế thừa, k đặc điểm, chung hành động vào chơi chung
// 1 obj, khuôn sẽ hội nhập theo hai cách:hội bà con, hội nhóm xã hội
// hội bà con: di truyền và kế thừa
// hội nhóm xã hội: cùng nhau hành động
//interface để tự hành động theo cách của mình
// ==> interface chứa hàm abstract

/* Interface cũng là một dạng class "cha", vì class là gom nhóm và đặt tên nhóm "cha" 
này chỉ có các hành động(abstract, k có code) đám "con",thành viên có nhiệm vụ triển khai/thi hành */
/*ứng dụng của interface:giúp 1 class/obj có nhiều cách hành xử khác nhau,lớp này là thành
viên của hội nào thì có hành động của hội đó,giúp 1 obj đóng nhiều vai, vai nào thì có hành động tương ứng chính là một hình dạng của đa kế thừa*/
/* Interface c1 hàm abstract..f() k code
/*           c2 hàm abstract..f() k code
/*           c3 hàm abstract..f() k code
con extends Cha như bình thường,implement/tham gia c1,c2,c3 (con phải có code ngay f()
chỉ duy nhất hàm f() Con có code @Overide f())
             
*/
public interface DeathRacer {
    //public abstract double runToDead();
    public double runToDead();
    public void showHowToDead();
}
