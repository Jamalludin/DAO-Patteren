package com.jamalludin.model;

/**
 * Created by jamal on 13/10/15.
 */
public class MataKuliah {
    private int kode;
    private String nama;
    private int sks;

    public MataKuliah() {
    }

    public MataKuliah(int kodeKuliah, String namaKuliah, int sks) {
        this.kode = kodeKuliah;
        this.nama = namaKuliah;
        this.sks = sks;
    }

    public int getKodeKuliah() {
        return kode;
    }

    public void setKodeKuliah(int kodeKuliah) {
        this.kode = kodeKuliah;
    }

    public String getNamaKuliah() {
        return nama;
    }

    public void setNamaKuliah(String namaKuliah) {
        this.nama = namaKuliah;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
