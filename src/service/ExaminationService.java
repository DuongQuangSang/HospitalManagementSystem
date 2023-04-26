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
import model.Examination;
import model.Patient;

/**
 *
 * @author user
 */
public class ExaminationService {
    //検査件削除メソッド
    public void deleteExamination(Examination exam) throws SQLException {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            StringBuilder sb = new StringBuilder();
            sb.append("delete from examinations ");
            sb.append("where ");
            sb.append("examination_id = " + exam.getId() + "");
            sb.append(";");
            System.out.println(sb.toString());
            jc.cud(sb.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExaminationService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //検査件新規メソッド
    public void insertExamination(Examination exam) throws SQLException {
        JdbcConn jc = new JdbcConn();
        LocalDateTime date = LocalDateTime.now();
        try {
            jc.getDbcom();
            jc.cud("insert into examinations (examination_id"
                    + " ,patient_id"
                    + " ,doctor_id"
                    + " ,department_id"
                    + " ,examination_date"
                    + " ,diagnosis"
                    + " ,treatment"
                    + " ,create_date) values (" + exam.getId() + "," + exam.getPatientId() + "," + exam.getDoctorId() + "," + exam.getDepartmentId() + ",'" + exam.getExamDate() + "','" + exam.getDiagnosis() + "','" + exam.getTreatment() + "','" + date + "');");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExaminationService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //検査件変更メソッド
    public void updateExamination(Examination exam) throws SQLException {
        JdbcConn jc = new JdbcConn();
        LocalDateTime date = LocalDateTime.now();
        try {
            jc.getDbcom();
            jc.cud("update examinations set patient_id = " + exam.getPatientId()
                    + ",doctor_id = " + exam.getDoctorId()
                    + ",department_id = " + exam.getDepartmentId()
                    + ",examination_date = '" + exam.getExamDate()
                    + "',diagnosis = '" + exam.getDiagnosis()
                    + "',treatment = '" + exam.getTreatment()
                    + "',modify_date = '" + date
                    + "' where examination_id = " + exam.getId() + ";");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExaminationService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //検査件検索メソッド
    public List<Examination> searchExamination(String keywordNo) {
        JdbcConn jc = new JdbcConn();
        List<Examination> list = new ArrayList<>();
        try {
            jc.getDbcom();
            String sql = "select * from examinations where examination_id ="+keywordNo+";";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    Examination exam = new Examination();
                    exam.setId(resultSet.getInt("examination_id"));
                    exam.setPatientId(resultSet.getInt("patient_id"));
                    exam.setDoctorId(resultSet.getInt("doctor_id"));
                    exam.setDepartmentId(resultSet.getInt("department_id"));
                    exam.setExamDate(resultSet.getString("examination_date"));
                    exam.setDiagnosis(resultSet.getString("diagnosis"));
                    exam.setTreatment(resultSet.getString("treatment"));
                    list.add(exam);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(ExaminationService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExaminationService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    //検査件一覧メソッド
    public List<Examination> selectAll() {
        JdbcConn jc = new JdbcConn();
        List<Examination> list = new ArrayList<>();
        try {
            jc.getDbcom();
            String sql = "select * from examinations;";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    Examination exam = new Examination();
                    exam.setId(resultSet.getInt("examination_id"));
                    exam.setPatientId(resultSet.getInt("patient_id"));
                    exam.setDoctorId(resultSet.getInt("doctor_id"));
                    exam.setDepartmentId(resultSet.getInt("department_id"));
                    exam.setExamDate(resultSet.getString("examination_date"));
                    exam.setDiagnosis(resultSet.getString("diagnosis"));
                    exam.setTreatment(resultSet.getString("treatment"));
                    list.add(exam);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(ExaminationService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExaminationService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
