package com.jamalludin.dao;

import com.jamalludin.model.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jamal on 09/10/15.
 */
public interface StudentDao {

    void insert(Student student) throws SQLException;

    void update(Student updatedStudent) throws SQLException;

    void delete(int id) throws SQLException;

    Student findById(int id);

    List<Student> findAll();

    List<Student> findByNameLike(String name);

}
