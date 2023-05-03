package com.ANANDAFIKRI.PBO.Perpustakaan1;

import java.util.ArrayList;
public class Perpustakaan {
    private String nama;
    private ArrayList<Buku> daftarBuku;
    private ArrayList<Anggota> daftarAnggota;
    private ArrayList<Petugas> daftarPetugas;

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.daftarBuku = new ArrayList<Buku>();
        this.daftarAnggota = new ArrayList<Anggota>();
        this.daftarPetugas = new ArrayList<Petugas>();
    }

    public Perpustakaan() {
    }

    public void tambahBuku(Buku buku) {
        this.daftarBuku.add(buku);
    }

    public void tambahAnggota(Anggota anggota) {
        this.daftarAnggota.add(anggota);
    }

    public void tambahPetugas(Petugas petugas) {
        this.daftarPetugas.add(petugas);
    }

    public void daftarSemuaBuku() {
        for (Buku buku : this.daftarBuku) {
            System.out.println(buku);
        }
    }

    public void daftarSemuaAnggota() {
        for (Anggota anggota : this.daftarAnggota) {
            System.out.println(anggota);
        }
    }

    public void daftarSemuaPetugas() {
        for (Petugas petugas : this.daftarPetugas) {
            System.out.println(petugas);
        }
    }

    public void pinjamBuku(int i, int i1) {
    }

    public void kembalikanBuku(int i, int i1) {
    }

    public void tampilkanDaftarPetugas() {
    }

    public void tampilkanDaftarAnggota() {
    }
}
