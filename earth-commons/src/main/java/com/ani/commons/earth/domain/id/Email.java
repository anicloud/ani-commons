package com.ani.commons.earth.domain.id;

import java.io.Serializable;

public class Email implements Serializable {

    private static final long serialVersionUID = -3538023069825487345L;
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
