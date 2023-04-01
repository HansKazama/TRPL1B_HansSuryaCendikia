/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hans300323;

/**
 *
 * @author ACER
 */

public class AritmatikaExample {
    
    public static void main(String[] args) {
        Aritmatika aritmatika = new Aritmatika();
        
        int[] angka = {1, 2, 3, 4, 5};
        
        // memanggil method tambah untuk menghitung jumlah semua angka dalam array
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total = aritmatika.tambah(total, angka[i]);
        }
        System.out.println("Total angka dalam array: " + total);
        
        // memanggil method ganjil untuk menampilkan semua angka ganjil dalam array
        System.out.println("Angka-angka ganjil dalam array:");
        for (int i = 0; i < angka.length; i++) {
            if (aritmatika.ganjil(angka[i])) {
                System.out.println(angka[i]);
            }
        }
    }
}