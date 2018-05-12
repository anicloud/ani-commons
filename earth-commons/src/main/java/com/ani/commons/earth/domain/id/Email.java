package com.ani.commons.earth.domain.id;

import java.io.Serializable;

public class Email extends AccountId implements Serializable {

    String email;

    public Email() {
    }

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
