/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11_lab4;

/**
 *
 * @author PHAN ANH TUAN
 */
public class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }
    
    T getObj() {
        return super.getObj();
    }
    public static void main(String[] args) {
        Gen2<Long> g = new Gen2<>(99L);
        System.out.println(g.getObj());
    }
}
