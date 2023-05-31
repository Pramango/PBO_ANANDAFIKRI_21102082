package com.ANANDAFIKRI.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukan bilangan: ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukan pembaginya: ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1 / bilangan2;
            System.out.println(bilangan1 + "/ " + bilangan2 + " = " + hasil + "(dibulatkan)");
        }

        // MultiException
        // catch(ArithmeticException | InputMismatchException e){
        // System.out.println("Error gess.Tidak dapat di proses: )");
        // }

        // Multiple Catch
        catch (ArithmeticException e) {
            System.out.println("Error weh, Tidak bisa diproses!");
        }
        catch (InputMismatchException e) {
            System.out.println("Masukkan angka saja yooo :)");
        }

        System.out.println("Proses sudah selesai yooo :)");
    }
}