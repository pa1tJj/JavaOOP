/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parentchild;

/**
 *
 * @author Admin
 */
public class Child extends Parent{
    private String assetThree;
    
    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    
    @Override
    public void in() {
        System.out.println("parent> asset1:" + assetOne + " asset2:" + assetTwo);
    }
    public void say() {
        System.out.println("hi everyone");
    }
}
