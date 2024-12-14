/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testgenerics;

/**
 *
 * @author PHAN ANH TUAN
 */
public class So<T> {
    T a;
    T b;

    public So(T a, T b) {
        this.a = a;
        this.b = b;
    }
    
    public void in() {
        System.out.print("\nday so:" + a + ", " + b);   
    }
}
