package com.jamalludin.model;

/**
 * Created by jamal on 13/10/15.
 */
public class Nilai {
    private int id;
    private int kode_kul;
    private String nama_kul;
    private String nilai;

    public Nilai() {
    }

    public Nilai(int id, int kode_kul, String nama_kul, String nilai) {
        this.id = id;
        this.kode_kul = kode_kul;
        this.nama_kul = nama_kul;
        this.nilai = nilai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
}
