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

public class BangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Menu Perhitungan Luas Bangun Datar ");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu (1-5) : ");
        int pilihan = input.nextInt();

        System.out.println();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi persegi : ");
                double sisi = input.nextDouble();
                double luasPersegi = sisi * sisi;
                System.out.println("Luas Persegi adalah : " + luasPersegi);
                break;
            case 2:
                System.out.print("Masukkan panjang alas segitiga : ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga : ");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga adalah : " + luasSegitiga);
                break;
            case 3:
                System.out.print("Masukkan panjang jari-jari lingkaran : ");
                double jari = input.nextDouble();
                double luasLingkaran = 3.14 * jari * jari; 
                System.out.println("Luas Lingkaran adalah : " + luasLingkaran);
                break;
            case 4:
                System.out.print("Masukkan panjang sisi sejajar a : ");
                double a = input.nextDouble();
                System.out.print("Masukkan panjang sisi sejajar b : ");
                double b = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium : ");
                double tinggiTrapesium = input.nextDouble();
                double luasTrapesium = 0.5 * (a +b) * tinggiTrapesium;
                System.out.println("Luas Trapesium adalah : " + luasTrapesium);
                break;
            case 5:
                System.out.print("Masukkan panjang diagonal 1 : ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan panjang diagonal 2 : ");
                double d2 = input.nextDouble();
                double luasLayangLayang = 0.5 * d1 * d2;
                System.out.println("Luas Layang-layang adalah : " + luasLayangLayang);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
