package com.jamalludin;

import com.jamalludin.dao.MataKuliahDao;
import com.jamalludin.dao.NilaiDao;
import com.jamalludin.dao.StudentDao;
import com.jamalludin.dao.impl.MataKuliahDaoImpl;
import com.jamalludin.dao.impl.NilaiDaoImpl;
import com.jamalludin.dao.impl.StudentDaoImpl;
import com.jamalludin.db.DataBaseConnection;
import com.jamalludin.model.MataKuliah;
import com.jamalludin.model.Nilai;
import com.jamalludin.model.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jamal on 09/10/15.
 */
public class MainApp {
    public static void main(String[] args) {
        //Student jamal = new Student(9, "Jamal Jack", "yukum jaya");
        //Student jesika = new Student(3, "jesika adelia", "bandar jaya barat");
        //Nilai jamal= new Nilai(3, 1234432, "KDJK", "A");
        //Nilai jamal = new Nilai(3, 1234432, "KDJK", "B");
        //MataKuliah jamal = new MataKuliah(124327, "sertifikasi", 3);

        try {
            StudentDao studentDao = new StudentDaoImpl(DataBaseConnection.getInstance().getConnection());
            NilaiDao nilaiDao = new NilaiDaoImpl(DataBaseConnection.getInstance().getConnection());
            MataKuliahDao mataKuliahDao = new MataKuliahDaoImpl(DataBaseConnection.getInstance().getConnection());

            //studentDao.insert(jamal);
            //studentDao.insert(jesika);
            //studentDao.delete(3);
            //studentDao.update(jamal);
            //nilaiDao.insert(jamal);
            //nilaiDao.update(jamal);
            //nilaiDao.delete(2);
            //mataKuliahDao.insert(jamal);
            //mataKuliahDao.update(jamal);
            //mataKuliahDao.delete(124321);

            /*List<Student> studentList = studentDao.findAll();
            for (Student s : studentList) {
                System.out.println("ID      : " + s.getId());
                System.out.println("Nama    : " + s.getNama());
                System.out.println("Alamat  : " + s.getAlamat());
                System.out.println("============================");
            }*/

            /*List<Nilai> nilaiList = nilaiDao.findAll();
            for (Nilai n : nilaiList){
                System.out.println("id       : "+n.getId());
                System.out.println("kode_kul : "+n.getKode_kul());
                System.out.println("nama_kul : "+n.getNama_kul());
                System.out.println("nilai    : "+n.getNilai());
                System.out.println("==============================");
            }*/

            /*List<MataKuliah> mataKuliahList = mataKuliahDao.findAll();
            for(MataKuliah m : mataKuliahList){
                System.out.println("kode_kul    : "+m.getKodeKuliah());
                System.out.println("nama_kul    : "+m.getNamaKuliah());
                System.out.println("sks         : "+m.getSks());
                System.out.println("===================================");
            }*/
            Student mhs = studentDao.findById(1);
            System.out.println("Nama : " +mhs.getNama());
            System.out.println("alamat : "+mhs.getAlamat());


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
