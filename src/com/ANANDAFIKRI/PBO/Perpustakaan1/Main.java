package com.ANANDAFIKRI.PBO.Perpustakaan1;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan("Institut Teknologi Telkom Purwokerto");

        // Menambahkan atribut buku
        Buku buku1 = new Buku(1, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", 223, 5);
        Buku buku2 = new Buku(2, "The Hobbit", "J.R.R. Tolkien", 310, 3);
        Buku buku3 = new Buku(3, "The Da Vinci Code", "Dan Brown", 454, 0);
        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);
        perpus.tambahBuku(buku3);

        // Constructor Untuk Anggota Perpustakaan
        Anggota anggota1 = new Anggota(1,"\"Abdullah");
        perpus.tambahAnggota(anggota1);
        Anggota anggota2 = new Anggota(2,"\"Jane Doe\"");
        perpus.tambahAnggota(anggota2);

        // Constructor Untuk Petugas Perpustakaan
        Petugas petugas1 = new Petugas(1, "Adam Smith");
        perpus.tambahPetugas(petugas1);

        Petugas petugas2 = new Petugas(2, "Budi Prasetyo");
        perpus.tambahPetugas(petugas2);

        Petugas petugas3 = new Petugas(3, "Slamet Widodo");
        perpus.tambahPetugas(petugas3);


        System.out.println("==== DAFTAR LIST BUKU ==== ");
        System.out.println("1, \"Harry Potter and the Philosopher's Stone\", \"J.K. Rowling\", 223, 5");
        System.out.println("2, \"The Hobbit\", \"J.R.R. Tolkien\", 310, 3");
        System.out.println("3,\"The Da Vinci Code\", \"Dan Brown\", 454, 03");

        System.out.println("\n==== DAFTAR NAMA ANGGOTA ====");
        System.out.println("1, \"Abdullah\"");
        System.out.println("2, \"Jane Doe\"");
        perpus.tampilkanDaftarAnggota();

        System.out.println("\n==== DAFTAR NAMA PETUGAS ==== ");
        System.out.println("1, \"Adam Smith\"");
        System.out.println("2, \"Budi Prasetyo\"");
        System.out.println("1, \"Slamet Widodo \"");

        perpus.tampilkanDaftarPetugas();

        System.out.println("\n===== JUMLAH PEMINJAMAN BUKU ====");
        perpus.pinjamBuku(1, 1); // anggota 1 meminjam buku 1
        perpus.pinjamBuku(2, 2); // anggota 2 meminjam buku 2
        perpus.pinjamBuku(1, 3); // anggota 1 mencoba meminjam buku 3 (jumlah buku 0)


        System.out.println("\n==== PENGEMBALIAN BUKU ====");
        perpus.kembalikanBuku(1, 1); // anggota 1 mengembalikan buku 1
        perpus.kembalikanBuku(2, 2); // anggota 2 mengembalikan buku 2
        perpus.kembalikanBuku(1, 3); // anggota 1 mencoba mengembalikan buku 3 (belum dipinjam)
    }
}