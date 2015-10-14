package com.jamalludin.model;

/**
 * Created by jamal on 13/10/15.
 */
public class MataKuliah {
    private int kode_kul;
    private String nama_kul;
    private int sks;

    public MataKuliah() {
    }

    public MataKuliah(int kode_kul, String nama_kul, int sks) {
        this.kode_kul = kode_kul;
        this.nama_kul = nama_kul;
        this.sks = sks;
    }

    public int getKode_kul() {
        return kode_kul;
    }

    public void setKode_kul(int kode_kul) {
        this.kode_kul = kode_kul;
    }

    public String getNama_kul() {
        return nama_kul;
    }

    public void setNama_kul(String nama_kul) {
        this.nama_kul = nama_kul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
