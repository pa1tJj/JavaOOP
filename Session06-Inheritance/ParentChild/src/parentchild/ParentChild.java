/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parentchild;

/**
 *
 * @author Admin
 */
public class ParentChild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        playWithParentChild();
    }
    
    public static void playWithParentChild() {
        Parent p = new Parent("ajij", "irhger");
        p.in();
        Parent c = new Child("ighjieds", "iager");
        c.in();
        Child x = (Child)c;//keo gian con tro cha xuong day new Child(
        // c van la Parent -- ki thuat ep kieu    
        x.say();
        
        ((Child)c).say();
    }
}
