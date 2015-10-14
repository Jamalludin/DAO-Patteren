package com.jamalludin.dao.impl;

import com.jamalludin.dao.StudentDao;
import com.jamalludin.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamal on 09/10/15.
 */
public class StudentDaoImpl implements StudentDao {
    private final Connection connection;

    public StudentDaoImpl(Connection connection) {

        this.connection = connection;
    }

    @Override
    public void insert(Student student) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student (id,nama,alamat) VALUES (?,?,?)");
        preparedStatement.setInt(1, student.getId());
        preparedStatement.setString(2, student.getNama());
        preparedStatement.setString(3, student.getAlamat());

        preparedStatement.executeUpdate();
    }

    @Override
    public void update(Student updatedStudent) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE student SET nama=? , alamat=? WHERE id=?");
        preparedStatement.setString(1, updatedStudent.getNama());
        preparedStatement.setString(2, updatedStudent.getAlamat());
        preparedStatement.setInt(3, updatedStudent.getId());

        preparedStatement.executeUpdate();

    }

    @Override
    public void delete(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM student WHERE id= ?");
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id,nama,alamat  FROM student");
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Student> studentList = new ArrayList<>();
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setNama(resultSet.getString("nama"));
                student.setAlamat(resultSet.getString("alamat"));

                studentList.add(student);
            }

            return studentList;

        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public List<Student> findByNameLike(String name) {
        return null;
    }
}
