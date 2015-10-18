package com.jamalludin.dao.impl;

import com.jamalludin.dao.NilaiDao;
import com.jamalludin.model.MataKuliah;
import com.jamalludin.model.Nilai;
import com.jamalludin.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamal on 13/10/15.
 */
public class NilaiDaoImpl implements NilaiDao {
    private final Connection connection;

    public NilaiDaoImpl(Connection connection) {
        this.connection = connection;
    }


    @Override
    public void insert(Nilai nilai) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO nilai (id,kode_kul,nama_kul,nilai) VALUES (?,?,?,?)");
        preparedStatement.setInt(1, nilai.getId());
        preparedStatement.setInt(2, nilai.getMataKuliah().getKode());
        preparedStatement.setString(3, nilai.getMataKuliah().getNama());
        preparedStatement.setString(4, nilai.getNilai());

        preparedStatement.executeUpdate();

    }

    @Override
    public void update(Nilai updatedNilai) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE nilai SET nilai=? WHERE id=?");
        preparedStatement.setString(1, updatedNilai.getNilai());
        preparedStatement.setInt(2, updatedNilai.getId());

        preparedStatement.executeUpdate();

    }

    @Override
    public void delete(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM nilai WHERE id=?");
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();

    }

    @Override
    public List<Nilai> findAll() {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT n.id,s.student_id , s.nama as student_name,mk.mata_kuliah_kode, mk.nama_kuliah as matakuliah_name,n.nilai, mk.sks FROM nilai n" +
                    "  INNER JOIN matakuliah mk ON mk.mata_kuliah_kode = n.mata_kuliah_kode" +
                    "  INNER JOIN student s ON s.student_id = n.student_id");
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Nilai>nilaiList = new ArrayList<>();
            while (resultSet.next()){

                Student s = new Student();
                MataKuliah mk = new MataKuliah();
                Nilai nilai = new Nilai();

                nilai.setId(resultSet.getInt("id"));
                s.setId(resultSet.getInt("student_id"));
                s.setNama(resultSet.getString("student_name"));
                mk.setKode(resultSet.getInt("mata_kuliah_kode"));
                mk.setNama(resultSet.getString("matakuliah_name"));
                nilai.setNilai(resultSet.getString("nilai"));
                mk.setSks(resultSet.getInt("sks"));

                nilai.setStudent(s);
                nilai.setMataKuliah(mk);

                nilaiList.add(nilai);
            }
            return nilaiList;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();

        }

    }

    @Override
    public Nilai findById(int id) {
        Nilai nilai = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT kode_kuliah, nama_kuliah, nilai FROM nilai WHERE idbr=?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Nilai n = new Nilai();
            while (resultSet.next()) {
                nilai.setNilai(resultSet.getString("nilai"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nilai;

    }

    @Override
    public List<Nilai> findByNameLike(String name) {
        return null;
    }
}
