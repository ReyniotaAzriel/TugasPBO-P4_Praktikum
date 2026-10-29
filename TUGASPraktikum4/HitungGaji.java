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

public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK : ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-2-3-4) : ");
        int golongan = input.nextInt();
        System.out.print("Status Pernikahan (1 = Menikah, 2 = Belum, 3 = Cerai, 4 = Menikah & Punya Anak) : ");
        int status = input.nextInt();
        System.out.print("Jumlah Anak : ");
        int jumlahAnak = input.nextInt();

        double gajiPokok = 0;
        switch (golongan) {
            case 1: 
                gajiPokok = 1200000;
                break;
            case 2: 
                gajiPokok = 1500000;
                break;
            case 3: 
                gajiPokok = 1750000;
                break;
            case 4: 
                gajiPokok = 2000000;
                break;
            default: 
                System.out.println("Golongan tidak valid!");
        }

        double tunjanganPasangan = 0;
        if (status== 1 || status == 4) {
            tunjanganPasangan = 0.10* gajiPokok;
        }

        double tunjanganAnak = 0;
        if (jumlahAnak > 0) {
             tunjanganAnak = (0.05 *gajiPokok)* jumlahAnak;
        }

        double totalTunjangan = tunjanganPasangan + tunjanganAnak;
        double gajiBersih = gajiPokok + totalTunjangan;

        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan : Rp" + tunjanganPasangan);
        System.out.println("Tunjangan Anak : Rp" + tunjanganAnak);
        System.out.println("Gaji Bersih : Rp" + gajiBersih);
    }
}