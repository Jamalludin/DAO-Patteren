package com.jamalludin.model;

/**
 * Created by jamal on 13/10/15.
 */
public class Nilai {
    private int id;
    private Student student;
    private MataKuliah mataKuliah;
    private String nilai;

    public Nilai() {
    }

    public Nilai(int id, Student student, MataKuliah mataKuliah, String nilai) {
        this.id = id;
        this.student = student;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
}
