package com.ANANDAFIKRI.PBO.Perpustakaan1;

public class Buku extends Perpustakaan {
    private int idBuku;
    private String judul;
    private String pengarang;
    private int jumlahHalaman;
    private int jumlahBuku;

     public Buku(int idBuku, String judul, String pengarang, int jumlahHalaman, int jumlahBuku) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.jumlahHalaman = jumlahHalaman;
        this.jumlahBuku = jumlahBuku;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int IdBuku){
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(int jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }
}