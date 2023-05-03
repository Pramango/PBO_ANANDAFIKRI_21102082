package com.ANANDAFIKRI.PBO.Pertemuan3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membaca input dari user
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi paket layanan wifi
        Layanan paket1 = new Layanan("Paket Hemat", "Kecepatan internet 20 Mbps, kuota data 50 GB", 125000);
        Layanan paket2 = new Layanan("Paket Unlimited", "Kecepatan internet 40 Mbps, kuota data 100 GB", 275000);
        Layanan paket3 = new Layanan("Paket Promo", "Kecepatan internet 60 Mbps, kuota data 200 GB", 200000);
        PemasanganWifi Wifi = new PemasanganWifi("300.000");

        // Menyimpan objek-objek layanan dalam ArrayList
        ArrayList<Layanan> paketLayanan = new ArrayList<>();
        paketLayanan.add(paket1);
        paketLayanan.add(paket2);
        paketLayanan.add(paket3);

        ArrayList<PemasanganWifi> paketWifi = new ArrayList<>();
        paketWifi.add(Wifi);

        int angka;
        String yn;
        boolean balik = true;
        while (balik) {
            System.out.println("Pilih Paket Layanan");
            System.out.println("=====================");
            System.out.println("1. " + paket1.getNamaPaket());
            System.out.println("2. " + paket2.getNamaPaket());
            System.out.println("3. " + paket3.getNamaPaket());
            System.out.println("4. " + paket1.getNamaPaket() + " + " + paket2.getNamaPaket());
            System.out.println("5. Pemasangan Wifi");

            System.out.print("Masukkan nomor paket yang dipilih: ");
            angka = scanner.nextInt();
            scanner.nextLine();

            // Menampilkan informasi paket layanan yang dipilih
            switch (angka) {
                case 1:
                    System.out.println("Nama Paket: " + paket1.getNamaPaket());
                    System.out.println("Benefit: " + paket1.getBenefit());
                    System.out.println("Biaya: Rp " + paket1.getBiaya());
                    System.out.print("Kembali ke menu? (Ya/keluar): ");
                    yn = scanner.next();
                    if (yn.equalsIgnoreCase("keluar")) {
                        balik = false;
                    }
                     break;

                case 2:
                    System.out.println("Nama Paket: " + paket2.getNamaPaket());
                    System.out.println("Benefit: " + paket2.getBenefit());
                    System.out.println("Biaya: Rp " + paket2.getBiaya());
                    System.out.print("Kembali ke menu? (Ya/keluar): ");
                    yn = scanner.next();
                    if (yn.equalsIgnoreCase("keluar")) {
                        balik = false;
                    }
                    break;

                case 3:
                    System.out.println("Nama Paket: " + paket3.getNamaPaket());
                    System.out.println("Benefit: " + paket3.getBenefit());
                    System.out.println("Biaya: Rp " + paket3.getBiaya());
                    System.out.print("Kembali ke menu? (Ya/keluar): ");
                    yn = scanner.next();
                    if (yn.equalsIgnoreCase("keluar")) {
                        balik = false;
                    }
                    break;

                case 4:
                    System.out.println("paket 1");
                    System.out.println("Nama Paket: " + paket1.getNamaPaket());
                    System.out.println("Benefit: " + paket1.getBenefit());
                    System.out.println("Biaya: Rp " + paket1.getBiaya());

                    System.out.println(" ");

                    System.out.println("paket 2");
                    System.out.println("Nama Paket: " + paket2.getNamaPaket());
                    System.out.println("Benefit: " + paket2.getBenefit());
                    System.out.println("Biaya: Rp " + paket2.getBiaya());

                    System.out.println(" ");

                    double total4;
                    total4 = paket1.getBiaya() + paket2.getBiaya();
                    System.out.println("Jumlah yang harus dibayar untuk paket tersebut adalah : " + total4);
                    System.out.print("Kembali ke menu? (Ya/keluar): ");
                    System.out.println(" ");
                    yn = scanner.next();
                    if (yn.equalsIgnoreCase("keluar")) {
                        balik = false;
                    }
                    break;

                case 5:
                    System.out.println("Biaya: Rp " + Wifi.getBiaya());
                    System.out.print("Kembali ke menu? (Ya/keluar): ");
                    yn = scanner.next();
                    if (yn.equalsIgnoreCase("keluar")) {
                        balik = false;
                    }
                    break;

                case 6:
                    balik = false;
                    break;

                default:
                    System.out.println("Masukan sesuai dengan instruksi!");
                    break;
            }
        }
    }
}