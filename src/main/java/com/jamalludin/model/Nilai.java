package com.jamalludin.model;

/**
 * Created by jamal on 13/10/15.
 */
public class Nilai {
    private int id;
    private int kodeKuliah;
    private String namaKuliah;
    private String skor;

    public Nilai() {
    }

    public Nilai(int id, int kodeKuliah, String namaKuliah, String skor) {
        this.id = id;
        this.kodeKuliah = kodeKuliah;
        this.namaKuliah = namaKuliah;
        this.skor = skor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKodeKuliah() {
        return kodeKuliah;
    }

    public void setKodeKuliah(int kodeKuliah) {
        this.kodeKuliah = kodeKuliah;
    }

    public String getNamaKuliah() {
        return namaKuliah;
    }

    public void setNamaKuliah(String namaKuliah) {
        this.namaKuliah = namaKuliah;
    }

    public String getSkor() {
        return skor;
    }

    public void setSkor(String skor) {
        this.skor = skor;
    }
}
