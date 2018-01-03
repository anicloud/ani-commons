package com.ani.commons.earth.dto;

/**
 * Created by zhanglina on 17-12-29.
 */
public class EmailDto extends RegistrationDto {
    String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    
    @Override
    public String getCacheKey(String prefix) {
        return String.format("%s:%s:%s", prefix, "emailverf", this.email);
    }

    
}
