/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amazingrace;

import data.Cat;
import data.Dog;
import data.Pet;

/**
 *
 * @author Admin
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        register();
    }
    public static void register() {
        Cat c = new Cat("TOM", 1950, 10);
        Pet c2 = new Cat("Jery :)))", 1950, 7);
        c.show();
        c2.show();
        
        Dog d = new Dog("Ngao da", 2000, 8);
        Pet beTo = new Dog("Peto", 1999, 12);
        d.show();
        beTo.show();
        System.out.println("sap xep theo toc do");
        Pet p[] = new Pet[]{c, c2, d, beTo};
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if(p[i].run() > p[j].run()) {
                    Pet tmp = p[i];
                    p[i] = p[j];
                    p[j] = tmp;
                }
            }
            
        }
        for (Pet x : p) {
            x.show();
        }
    }
}
