/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA         : MIFTAH MUHAMMAD SIDQI
 * NIM          : 10117096
 * KELAS        : PBO3
 * DESKRIPSI    : Program ini berisi program untuk menginput data
 */
public class PBO310117096Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
    }
    
}
