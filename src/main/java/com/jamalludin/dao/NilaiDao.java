package com.jamalludin.dao;



import com.jamalludin.model.Nilai;
import com.jamalludin.model.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jamal on 13/10/15.
 */
public interface NilaiDao {
    void insert(Nilai nilai) throws SQLException;

    void update(Nilai updatedNilai ) throws SQLException;

    void delete(int id) throws SQLException;

    List<Nilai> findAll();
    Nilai findById(int id);
    List<Nilai> findByNameLike(String name);
}
