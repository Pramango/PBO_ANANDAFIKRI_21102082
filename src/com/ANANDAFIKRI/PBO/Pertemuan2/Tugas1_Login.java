package com.ANANDAFIKRI.PBO.Pertemuan2;

import java.util.Scanner;
public class Tugas1_Login {
    public static void main(String[] args) {
        /* Mendeklarasikan  serta menentukan kata username dan password yang akan diizinkan */
        String username = "ananda";
        String password = "1234";
        Scanner input = new Scanner(System.in);

        // Memasukkan username dan password yang telah dibuat sebelumnya
        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();

        /* Memeriksa apakah username dan password yang telah diizinkan sesuai dengan yang telah diizinkan.
        * Jika user menginputkan username dan password dengan benar maka akan muncul Login berhasil silahkan masuk
        * Jika user menginputkan username dan password tidak sesuai yang sah maka akan muncul username dan password Anda salah
        */
        if (inputUsername.isEmpty() || inputPassword.isEmpty()) {
            System.out.println("Silakan login dengan username dan password yang sah!");
        } else if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil silakan masuk");
        } else {
            System.out.println("Username dan password Anda salah");
        }
    }
}