/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hans130423;

/**
 *
 * @author ACER
 */
public class InterfaceExample {
    public static void main(String[] args){
        Relation MyInteger = new MyInteger();
        Relation MyDouble = new MyDouble();
        
        System.out.println("10 dan 11" + MyInteger.isEqual(10,11));
        System.out.println("10.5 dan 11.5" + MyInteger.isEqual(10.5 ,11.5));
    }
}
