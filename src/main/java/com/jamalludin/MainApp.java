package com.jamalludin;

import com.jamalludin.dao.StudentDao;
import com.jamalludin.dao.impl.StudentDaoImpl;
import com.jamalludin.db.DataBaseConnection;
import com.jamalludin.model.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jamal on 09/10/15.
 */
public class MainApp {
    public static void main(String[] args) {
        //Student jamal = new Student(4 , "jamalludinn", "bandar jaya");
        //Student jesika = new Student(3, "jesika adelia", "bandar jaya barat");

        try {
            StudentDao studentDao = new StudentDaoImpl(DataBaseConnection.getInstance().getConnection());
            //studentDao.insert(jamal);
            //studentDao.insert(jesika);
            studentDao.delete(9);
            //studentDao.update(jamal);
            List<Student> studentList = studentDao.findAll();

            for (Student s : studentList) {
                System.out.println("ID      : "+s.getId());
                System.out.println("Nama    : "+s.getNama());
                System.out.println("Alamat  : "+s.getAlamat());
                System.out.println("============================");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
