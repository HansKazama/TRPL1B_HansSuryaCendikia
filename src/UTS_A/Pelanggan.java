/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

/**
 *
 * @author ACER
 */
import controller.WarnetController;
import model.Pelanggan;

public class Pelanggan {
    public static void main(String[] args) {
        Pelanggan pelanggan = new Pelanggan("P001", "John Doe", "VIP");
        Warnet warnet = new Warnet(pelanggan, "2023-05-25", 10, 13);

        int totalBayar = warnet.hitungTotalBayar();
        System.out.println("Total Bayar: " + totalBayar);
    }
}
}
