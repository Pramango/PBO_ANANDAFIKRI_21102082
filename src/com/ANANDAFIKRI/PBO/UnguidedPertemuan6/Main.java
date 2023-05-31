package com.ANANDAFIKRI.PBO.UnguidedPertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static int BagiBilangan(int bilangan1, int bilangan2) {
        return bilangan1 / bilangan2;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan bilangan bulat pertama: ");
            int bilangan1 = input.nextInt();
            System.out.print("Masukkan bilangan bulat kedua: ");
            int bilangan2 = input.nextInt();

            int hasil = BagiBilangan(bilangan1, bilangan2);
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil);
        }

        // Multiple Catch
        catch (ArithmeticException e) {
            System.out.println("Terjadi Kesalahan : Pembagian dengan nol. Silakan masukkan angka lain.");
        }
        catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan : Input tidak valid. Harap masukkan bilangan bulat.");
        }
           System.out.println();
    }
}