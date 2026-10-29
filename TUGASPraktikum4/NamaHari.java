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

public class NamaHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode hari (1 - 7) : ");
        int kodeHari = input.nextInt();

        String namaHari;
        switch (kodeHari) {
            case 1: 
                namaHari = "Senin";
                break;
            case 2: 
                namaHari = "Selasa";
                break;
            case 3: 
                namaHari = "Rabu";
                break;
            case 4: 
                namaHari = "Kamis";
                break;
            case 5: 
                namaHari = "Jumat";
                break;
            case 6: 
                namaHari = "Sabtu";
                break;
            case 7: 
                namaHari = "Minggu";
                break;
            default: 
                namaHari = "Kode tidak valid";
        }
        System.out.println("Hari : " + namaHari);
    }
}