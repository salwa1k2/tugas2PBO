/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2no2;

/**
 *
 * @author Acer
 */

import java.util.Scanner;

public class Tugas2no2 {

    public static void main(String[] args) {
    Scanner objek = new Scanner(System.in);
    
    System.out.println("berapa uang yang dimiliki? ");
    
    int b =objek.nextInt();
    
    System.out.println("apakah pasangan sedang ada kelas??(1=Ya), (0=Tidak)");
    int pilihan = objek.nextInt();
    boolean c =(pilihan == 1);
    
    if ((b > 10000) && !c) {
        System.out.println("anda akan keluar membeli mie gacoan");  
    }else{
        System.out.println("kelas dulu aja baru gacoan");
    }     
    }
}
