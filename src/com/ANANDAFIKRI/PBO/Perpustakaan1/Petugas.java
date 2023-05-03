package com.ANANDAFIKRI.PBO.Perpustakaan1;

public class Petugas extends Perpustakaan {
    public int idPetugas;
    public String nama;

    public Petugas(int idPetugas, String nama) {
        this.idPetugas = idPetugas;
        this.nama = nama;
    }

    public int getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(int idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}