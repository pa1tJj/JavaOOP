/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package withabstarct;

import data.Disk;
import data.Retangcle;
import data.Shape;
import data.Square;
import data.Triangle;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class WithAbstarct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        playWithShape();
    }
    
    public static void playWithShape() {
        Retangcle r1 = new Retangcle(5, 6, "ier", "black", "jeb");
        Shape r2 = new Retangcle(4, 3, "agh", "ihre", "ierj");
        Disk d1 = new Disk("fehf", 4, "hgfre", "bva", "ireyf");
        Disk d2 = new Disk("fef", 2, "jcver", "igf", "ij");
        Square s1 = new Square(10, 7, "feiw", "ỏe", "iêr");
        Shape s2 = new Square(11, 8, "jer", "fiewj", "feow");
        Triangle t1 = new Triangle(4, 5, 6, "fer", "fher", "ahef");
        Shape t2 = new Triangle(5, 7, 9, "aifwe", "fweu", "fowe");
        r1.in();//của retangcle 
        r2.in();// của lớp cha nhưng trỏ chay qua mặt shape đến luôn retangcle 
        d1.in();
        d2.in();
        s1.in();
        s2.in();
        t1.in();
        t2.in();
        
        System.out.println("list:");
        Shape a[] = new Shape[]{r1, r2, d1, d2, s1, s2, t1, t2};
        for (Shape shape : a) {
            shape.in();
        }
        System.out.println("sap xep");
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                if(a[i].getArea() > a[j].getArea()) {
                    Shape tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        
        for (Shape x : a) {
            x.in();
        }
        
    }
    
}
