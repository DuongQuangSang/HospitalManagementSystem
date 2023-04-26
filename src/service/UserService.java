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
import model.User;

/**
 *
 * @author user
 */
public class UserService {
    //ユーザーとパスワードが合ってるかどうか確認メソッド
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
    
    //ユーザー登録メソッド
    public void signUp(User user) throws SQLException {
        JdbcConn jc = new JdbcConn();
        LocalDateTime date = LocalDateTime.now();
        String sql = "insert into users (user_name,password,name,create_date) values (" + "'" + user.getUserName()+ "','" + user.getPassWord()+ "','" + user.getName() + "','"+ date +"');";
        try {
            jc.getDbcom();
            jc.cud(sql);
            jc.closeDbcom();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //ユーザーはもう存在した確認メソッド
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
