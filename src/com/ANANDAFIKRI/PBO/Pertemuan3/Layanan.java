package com.ANANDAFIKRI.PBO.Pertemuan3;

class Layanan {
    String namaPaket;
    String benefit;
    double biaya;

    public Layanan(String namaPaket, String benefit, double biaya) {
        this.namaPaket = namaPaket;
        this.benefit = benefit;
        this.biaya = biaya;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public String getBenefit() {
        return benefit;
    }

    public double getBiaya() {
        return biaya;
    }
}
