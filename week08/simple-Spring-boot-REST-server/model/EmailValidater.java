
package com.example.demo.model;

public class EmailValidater {

    public boolean checkForAtSign(String email) {
        return email != null && email.contains("@");
    }

}