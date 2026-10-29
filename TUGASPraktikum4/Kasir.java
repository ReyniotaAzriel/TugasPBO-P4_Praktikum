/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum4;

import java.util.Scanner;

/**
 *
 * @author rizky
 */

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah pembeli memiliki kartu member? (ya/tidak) : ");
        String statusMember = input.nextLine();
        
        System.out.print("Masukkan total belanja : Rp");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        if (statusMember.equalsIgnoreCase("ya")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        double totalBayar = totalBelanja - diskon;
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total yang harus dibayar : Rp" + totalBayar);

        System.out.print("Masukkan uang yang diberikan pembeli : Rp");
        double uangDiberikan = input.nextDouble();

        double kembalian = uangDiberikan - totalBayar;

        if (kembalian < 0) {
            System.out.println("Uang yang diberikan kurang sebesar : Rp" + kembalian);
        } else {
            System.out.println("Kembalian yang diberikan : Rp" + kembalian);
        }
    }
}