
package com.example.demo.model;

public class EmailValidater {

    public boolean checkEmail(String email) {
        boolean emailValid = email != null ;

        int atCount = 0;
        int dotCount = 0;

        for (int i = 0; emailValid && i < email.length(); i++) {  
            if (email.charAt(i) == '@') {
                atCount++;
            }
            if (email.charAt(i) == '.') {
                dotCount++;
            }
        }

        if (atCount != 1) {
            emailValid = false;
        }

        if (dotCount == 0 || dotCount > 3) {
            emailValid = false;
        }

        return emailValid;
    }
}