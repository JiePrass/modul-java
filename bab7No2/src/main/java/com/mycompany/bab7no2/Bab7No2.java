/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7no2;

/**
 *
 * @author iMOp
 */
import java.util.Scanner;

public class Bab7No2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
         
        System.out.print("NIM : ");
        String nim = myInput.nextLine();
        System.out.print("Nama : ");
        String nama = myInput.nextLine();
        System.out.print("Tahun : ");
        int tahun = myInput.nextInt();
        System.out.print("Peminatan : ");
        char peminatan = myInput.next().charAt(0);
         
        switch( tahun ) { 
            case 1: 
            System.out.println("Bahasa Inggris, Matematika, Sain"); 
            break; 

            case 2: 
                switch( peminatan ) { 
                case 'C': 
                System.out.println("Sistem Operasi, Pemrograman Java, Struktur Data"); 
                break; 
                case 'E': 
                System.out.println("Algoritma, Logika Informatika"); 
                break; 
                case 'M': 
                System.out.println("DBMS,Manajemen Proyek "); 
                break; 
                } 
            break; 

            case 3: 
                switch( peminatan ) { 
                case 'C': 
                System.out.println("Organisasi Komputer, MultiMedia"); 
                break; 
                case 'E': 
                System.out.println("Perancangan Sistem, Pemrograman WEB"); 
                break;
                case 'M': 
                System.out.println("Pemrograman Mobile, Pemrograman Java 2"); 
                break; 
                } 
            break;

            case 4: 
                switch( peminatan ) { 
                case 'C': 
                System.out.println("Komunikasi Data, MultiMedia"); 
                break; 
                case 'E': 
                System.out.println(" Sistem Terdistribusi , Image Processing"); 
                break; 
                case 'M': 
                System.out.println("SIM , Sistem Jaringan "); 
                break; 
                } 
            break;
            }
    }
}
