/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parentchild;

/**
 *
 * @author Admin
 */
public class Parent {
    protected String assetOne;
    protected String assetTwo;
    
    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }
    public void in() {
        System.out.println("parent> asset1:" + assetOne + " asset2:" + assetTwo);
    }
}
