/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5no1;

/**
 *
 * @author iMOp
 */
import java.util.Scanner;

public class Bab5No1 {

    
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("### Pendataan Karyawan PT. Maju Mundur ###");
        System.out.print("Nama Karyawan : ");
        String nama = myInput.nextLine();
        System.out.print("Alamat : ");
        String alamat = myInput.nextLine();
        System.out.print("Usia : ");
        int usia = myInput.nextInt();
        System.out.print("Gaji : ");
        double gaji = myInput.nextInt();
        System.out.println("-----------------------------");
        
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia);
        System.out.println("Gaji : " + gaji);
    }
}
