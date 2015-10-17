package com.jamalludin.dao.impl;

import com.jamalludin.dao.MataKuliahDao;
import com.jamalludin.model.MataKuliah;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamal on 13/10/15.
 */
public class MataKuliahDaoImpl implements MataKuliahDao{
    private final Connection connection;

    public MataKuliahDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(MataKuliah mataKuliah) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO matakuliah (mata_kuliah_kode,nama_kuliah,sks) VALUES (?,?,?)");
        preparedStatement.setInt(1, mataKuliah.getKode());
        preparedStatement.setString(2, mataKuliah.getNama());
        preparedStatement.setInt(3, mataKuliah.getSks());

        preparedStatement.executeUpdate();
    }

    @Override
    public void update(MataKuliah updatedMataKuliah) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE matakuliah SET nama_kuliah=? WHERE mata_kuliah_kode=?");
        preparedStatement.setString(1, updatedMataKuliah.getNama());
        preparedStatement.setInt(2, updatedMataKuliah.getKode());

        preparedStatement.executeUpdate();


    }

    @Override
    public void delete(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM matakuliah WHERE mata_kuliah_kode=?");
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();

    }

    @Override
    public List<MataKuliah> findAll() {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT mata_kuliah_kode, nama_kuliah, sks FROM matakuliah");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<MataKuliah>mataKuliahList = new ArrayList<>();
            while(resultSet.next()){
                MataKuliah mataKuliah = new MataKuliah();
                mataKuliah.setKode(resultSet.getInt("kode_kul"));
                mataKuliah.setNama(resultSet.getString("nama_kul"));
                mataKuliah.setSks(resultSet.getInt("sks"));

                mataKuliahList.add(mataKuliah);

            }
            return mataKuliahList;


        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();

        }
    }

    @Override
    public MataKuliah findById(int id) {
        MataKuliah mataKuliah = new MataKuliah();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT  nama_kuliah, sks FROM matakuliah WHERE mata_kuliah_kode=?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                mataKuliah.setNama(resultSet.getString("nama_kuliah"));
                mataKuliah.setSks(resultSet.getInt("sks"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mataKuliah;

    }

    @Override
    public List<MataKuliah> findByNameLike(String name) {
        return null;
    }
}
