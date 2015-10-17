package com.jamalludin.model;

/**
 * Created by jamal on 13/10/15.
 */
public class Nilai {
    private int id;
    private int kode;
    private String nama;
    private String skor;

    public Nilai() {
    }

    public Nilai(int id, int kodeKuliah, String namaKuliah, String skor) {
        this.id = id;
        this.kode = kodeKuliah;
        this.nama = namaKuliah;
        this.skor = skor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSkor() {
        return skor;
    }

    public void setSkor(String skor) {
        this.skor = skor;
    }
}
