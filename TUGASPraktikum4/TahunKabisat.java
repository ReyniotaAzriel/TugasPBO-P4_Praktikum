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

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tahun : ");
        int tahun = input.nextInt();

        if ((tahun % 400 == 0) || ((tahun % 4 == 0) && (tahun % 100 != 0))) {
            System.out.println(tahun + " adalah Tahun Kabisat");
        } else {
            System.out.println(tahun + " bukan Tahun Kabisat");
        }
    }
}