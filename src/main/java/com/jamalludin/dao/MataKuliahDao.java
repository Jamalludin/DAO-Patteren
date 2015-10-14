package com.jamalludin.dao;

import com.jamalludin.model.MataKuliah;


import java.sql.SQLException;
import java.util.List;

/**
 * Created by jamal on 13/10/15.
 */
public interface MataKuliahDao {
    void insert (MataKuliah mataKuliah) throws SQLException;
    void update (MataKuliah updatedMataKuliah) throws  SQLException;
    void delete (int id) throws SQLException;
    List<MataKuliah> findAll();
}
