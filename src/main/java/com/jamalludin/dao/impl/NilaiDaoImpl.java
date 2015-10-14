package com.jamalludin.dao.impl;

import com.jamalludin.dao.NilaiDao;
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
        preparedStatement.setInt(2, nilai.getKode_kul());
        preparedStatement.setString(3, nilai.getNama_kul());
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
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id,kode_kul,nama_kul,nilai FROM nilai");
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Nilai>nilaiList = new ArrayList<>();
            while (resultSet.next()){
                Nilai nilai = new Nilai();
                nilai.setId(resultSet.getInt("id"));
                nilai.setKode_kul(resultSet.getInt("kode_kul"));
                nilai.setNama_kul(resultSet.getString("nama_kul"));
                nilai.setNilai(resultSet.getString("nilai"));

                nilaiList.add(nilai);
            }
            return nilaiList;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();

        }

    }
}
