/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6no1;

/**
 *
 * @author iMOp
 */

import java.util.Scanner;

public class Bab6No1 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.print("NIM : ");
        String nim = myInput.nextLine();
        System.out.print("Nama : ");
        String nama = myInput.nextLine();
        System.out.print("Nilai : ");
        int nilai = myInput.nextInt();
        
        if (nilai < 50){
            System.out.println("Tidak Lulus");
        } else if (nilai >= 50 && nilai < 60) {
            System.out.println("Grade D");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("Grade C");
        } else if (nilai >=70 && nilai < 80) {
            System.out.println("Grade B");
        } else if (nilai >=80 && nilai < 90) {
            System.out.println("Grade A");
        } else if (nilai >=90 && nilai < 100) {
            System.out.println("Grade A+");
        } else if (nilai == 100) {
            System.out.println("Perfecto");
        } else {
            System.out.println("DATA NILAI SALAH!!");
        }
    }
}
