/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woon;

/**
 *
 * @author eusea
 */
public class EmployeeData extends UserData {

    private String password;
    private String username;

    public EmployeeData(String password, String username, String firstName, String lastName, String email) {
        super(firstName, lastName, email);
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
