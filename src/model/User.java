/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * ユーザー情報をインスタンス化
 * @author user
 */
public class User {
    private int id;
    private String userName;
    private String passWord;
    private String name;
    
    public User() {
    }

    public User(int id, String userName, String passWord, String name) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
