/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import daojdbcconn.JdbcConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doctor;
import model.ListDoctor;

/**
 *
 * @author user
 */
public class ListDoctorService {
    //医師検索メソッド
    public List<ListDoctor> searchDoctor(String keyword) throws SQLException {
        JdbcConn jc = new JdbcConn();
        List<ListDoctor> list = new ArrayList<>();
        try {
            jc.getDbcom();
            String sql = "select * from doctors d left join departments dpm on d.department_id = dpm.department_id where doctor_name like '%" + keyword + "%' order by doctor_id;";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    ListDoctor dr = new ListDoctor();
                    dr.setDoctorId(resultSet.getInt("doctor_id"));
                    dr.setDoctorName(resultSet.getString("doctor_name"));
                    dr.setDoctorGender(resultSet.getString("gender"));
                    dr.setDepartmentId(resultSet.getInt("department_id"));
                    dr.setDepartmentName(resultSet.getString("department_name"));
                    dr.setSalary(resultSet.getInt("salary"));
                    list.add(dr);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(ListDoctorService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListDoctorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    //医師一覧メソッド
    public List<ListDoctor> selectAll() {
        JdbcConn jc = new JdbcConn();
        List<ListDoctor> list = new ArrayList<>();
        try {
            jc.getDbcom();
            String sql = "select * from doctors d left join departments dpm on d.department_id = dpm.department_id;";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    ListDoctor dr = new ListDoctor();
                    dr.setDoctorId(resultSet.getInt("doctor_id"));
                    dr.setDoctorName(resultSet.getString("doctor_name"));
                    dr.setDoctorGender(resultSet.getString("gender"));
                    dr.setDepartmentId(resultSet.getInt("department_id"));
                    dr.setDepartmentName(resultSet.getString("department_name"));
                    dr.setSalary(resultSet.getInt("salary"));
                    list.add(dr);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(ListDoctorService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListDoctorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
