/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import daojdbcconn.JdbcConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doctor;
import model.Patient;

/**
 *
 * @author user
 */
public class DoctorService {
    //医師削除メソッド
    public void deleteDoctor(Doctor dr) throws SQLException {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            jc.cud("delete from doctors where doctor_id = " + dr.getId() + ";");
            jc.closeDbcom();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DoctorService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //医師新規メソッド
    public void insertDoctor(Doctor dr) throws SQLException {
        JdbcConn jc = new JdbcConn();
        LocalDateTime date = LocalDateTime.now();
        try {
            jc.getDbcom();
            jc.cud("insert into doctors (doctor_id,doctor_name,gender,department_id,salary,create_date) values (" + dr.getId() + ",'" + dr.getName() + "','" + dr.getGender() + "'," + dr.getDepartmentId() + "," + dr.getSalary() + ",'" + date + "');");
            jc.closeDbcom();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DoctorService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //医師更新メソッド
    public void updateDoctor(Doctor dr) throws SQLException {
        JdbcConn jc = new JdbcConn();
        LocalDateTime date = LocalDateTime.now();
        try {
            jc.getDbcom();
            jc.cud("update doctors set doctor_name = '" + dr.getName()
                    + "',gender = '" + dr.getGender()
                    + "',department_id = " + dr.getDepartmentId()
                    + ",salary = " + dr.getSalary()
                    + ",modify_date = '" + date
                    + "' where doctor_id = " + dr.getId() + ";");
            jc.closeDbcom();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DoctorService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
