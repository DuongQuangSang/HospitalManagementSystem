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
import javax.swing.JOptionPane;
import model.Department;
import model.Doctor;
import model.Examination;
import model.Patient;
import model.ListPatient;
import view.ManagerView;

/**
 *
 * @author user
 */
public class ListPatientService {
    //患者情報と検査情報結合区一覧メソッド
    public List<ListPatient> selectAll() {
        JdbcConn jc = new JdbcConn();
        List<ListPatient> list = new ArrayList<>();
        try {
            jc.getDbcom();
            String sql = "select p.patient_id"
                    + ", p.patient_name"
                    + ", p.gender"
                    + ", e.examination_id"
                    + ", e.examination_date"
                    + ", dpm.department_name"
                    + ", d.doctor_name"
                    + ", e.diagnosis"
                    + ", e.treatment "
                    + "from patients p left join examinations e on p.patient_id = e.patient_id "
                    + "join doctors d on e.doctor_id = d.doctor_id "
                    + "join departments dpm on e.department_id = dpm.department_id "
                    + "order by e.examination_id;";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    ListPatient patient = new ListPatient();
                    patient.setId(resultSet.getInt("patient_id"));
                    patient.setName(resultSet.getString("patient_name"));
                    patient.setGender(resultSet.getString("gender"));
                    patient.setExaminationId(resultSet.getInt("examination_id"));
                    patient.setExamDate(resultSet.getString("examination_date"));
                    patient.setDepartmentName(resultSet.getString("department_name"));
                    patient.setDoctorName(resultSet.getString("doctor_name"));
                    patient.setDiagnosis(resultSet.getString("diagnosis"));
                    patient.setTreatment(resultSet.getString("treatment"));
                    list.add(patient);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(ListPatientService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListPatientService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    //患者の検査結果検索メソッド
    public List<ListPatient> selectInfo(String patientId, String examId) {
        JdbcConn jc = new JdbcConn();
        List<ListPatient> list = new ArrayList<>();
        try {
            jc.getDbcom();
            String sql = "select p.patient_name"
                    + ", e.examination_date"
                    + ", d.doctor_name"
                    + ", dpm.department_name"
                    + ", e.diagnosis"
                    + ", e.treatment "
                    + "from patients p left join examinations e on p.patient_id = e.patient_id "
                    + "left join doctors d on e.doctor_id = d.doctor_id "
                    + "left join departments dpm on e.department_id = dpm.department_id "
                    + "where e.examination_id = " + examId + "and p.patient_id = " + patientId
                    + " order by e.examination_date;";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    ListPatient patient = new ListPatient();
                    patient.setName(resultSet.getString("patient_name"));
                    patient.setExamDate(resultSet.getString("examination_date"));
                    patient.setDoctorName(resultSet.getString("doctor_name"));
                    patient.setDepartmentName(resultSet.getString("department_name"));
                    patient.setDiagnosis(resultSet.getString("diagnosis"));
                    patient.setTreatment(resultSet.getString("treatment"));
                    list.add(patient);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(ListPatientService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListPatientService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
