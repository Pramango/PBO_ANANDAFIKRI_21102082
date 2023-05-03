package com.ANANDAFIKRI.PBO.Pertemuan2;

import java.util.Scanner;
public class Tugas2_HitungGajidanTunjanganPegawai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.println("Gaji yang diterima oleh " +nama+ " adalah sebagai berikut:");

        System.out.print("Masukkan gaji: ");
        double Gaji = input.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = input.nextDouble();

        System.out.print("Masukkan pajak: ");
        double pajak = input.nextDouble();

        double Gaji_kotor = Gaji + tunjangan;
        double pajak_negara = Gaji_kotor * pajak;
        double Gaji_bersih = Gaji_kotor - pajak_negara;

        System.out.println("Total Gaji bersih dari " +nama+ " yang diterima yaitu " +Gaji_bersih+ ".");
    }
}
