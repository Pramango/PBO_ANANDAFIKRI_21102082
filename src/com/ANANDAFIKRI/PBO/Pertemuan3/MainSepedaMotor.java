package com.ANANDAFIKRI.PBO.Pertemuan3;

public class MainSepedaMotor {
    public static void main(String[] args){

        // Pembuatan class
        SepedaMotor honda = new SepedaMotor();
        SepedaMotor yamaha = new SepedaMotor();
        SepedaMotor vespa = new SepedaMotor();

        // Pembuatan class
        SepedaMotor Honda = new SepedaMotor("Honda","Vario 160",35000000);
        SepedaMotor Yamaha = new SepedaMotor("Yamaha","N Max",40000000);
        SepedaMotor Vespa = new SepedaMotor("Vespa","Vespa Matic",60000000);

        // Untuk menjalankan method
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();

        // Uji coba getter & Setter
        System.out.println("Motor merk "+ honda.getMerk() + " dengan tipe (sebelum) : " + honda.getTipe());
        honda.setTipe("Beat 110");
        System.out.println("Motor merk " + honda.getMerk() + " dengan tipe (sesudah) : " + honda.getTipe());
    }
}