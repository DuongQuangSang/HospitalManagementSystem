/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daojdbcconn.JdbcConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doctor;
import model.User;

/**
 *
 * @author user
 */
public class UserService {
    public boolean loginUser(String userName,String passWord) throws SQLException {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            String sql = "select * from users where user_name = '" + userName + "' and password = '" + passWord + "';";
            try {
                ResultSet resultSet = jc.tt(sql);
                if (resultSet.next()) {
                    return true;
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(DoctorService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DoctorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void signUp(User user) throws SQLException {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            jc.cud("insert into users (user_name,password,name) values (" + "'" + user.getUserName()+ "','" + user.getPassWord()+ "','" + user.getName() + "');");
            jc.closeDbcom();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean userExist(String userName) {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            String sql = "select * from users where user_name = '" + userName + "';";
            try {
                ResultSet resultSet = jc.tt(sql);
                if (resultSet.next()) {
                    return true;
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(DoctorService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DoctorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
