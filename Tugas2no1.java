/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2no1;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Tugas2no1 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        System.out.println("Masukkan 3 bilangan negatif: ");
        
        int a = angka.nextInt();
        int b = angka.nextInt();
        int c = angka.nextInt();

        if (a >= 0 || b >= 0 || c >= 0) {
            System.out.println("Harap masukkan bilangan negatif.");
            angka.close();
            return;
        }

        int tambah = a + b + c;
        int kali = a * b * c;
        int kurang = a - b - c;
        double bagi = (b != 0 && c != 0) ? (double) a / b / c : 0;

        System.out.println("hasil penjumlahan: " + tambah);
        System.out.println("hasil perkalian: " + kali);
        System.out.println("hasil pengurangan: " + kurang);
        System.out.println("hasil pembagian: " + bagi);

        angka.close();
    }
}
