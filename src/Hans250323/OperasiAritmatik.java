/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hans250323;

/**
 *
 * @author ACER
 */
public class OperasiAritmatik {
    public static void main(String[] args) {
        
        // mengambil dua bilangan dari argumen command line
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        // Melakukan operasi aritmatika
        int sum = a + b;
        int difference = Math.abs(a - b);
        int product = a * b;
        int quotient = a / b;
        
        // Menampilkan hasil operasi aritmatika
        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
    }
}
