package com.ANANDAFIKRI.PBO.Perpustakaan1;

import java.util.ArrayList;
public class Anggota extends Perpustakaan{
    private int idAnggota;
    private String nama;
    public ArrayList<Buku> bukuPinjaman;

    public Anggota(int i, String s) {

    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Buku> getBukuPinjaman() {
        return bukuPinjaman;
    }

    public void tambahBukuPinjaman(Buku buku) {
        bukuPinjaman.add(buku);
    }

    public void hapusBukuPinjaman(Buku buku) {
        bukuPinjaman.remove(buku);
    }

    public int getJumlahPinjam() {
        return bukuPinjaman.size();
    }
}
