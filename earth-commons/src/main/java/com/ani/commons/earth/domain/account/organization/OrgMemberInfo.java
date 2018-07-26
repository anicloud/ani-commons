package com.ani.commons.earth.domain.account.organization;


import com.ani.utils.core.DataState;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-11.
 */
public class OrgMemberInfo implements Serializable{
    private static final long serialVersionUID = 6395031521628568782L;
    private Long id ;
    private String employeeNum;
    private String name;
    private String nameAlphabet;
    private String phone;
    private DataState state;

    public OrgMemberInfo() {
    }

    public OrgMemberInfo(Long id, String employeeNum, String name, String nameAlphabet, String phone, DataState state) {
        this.id = id;
        this.employeeNum = employeeNum;
        this.name = name;
        this.nameAlphabet = nameAlphabet;
        this.phone = phone;
        this.state = state;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAlphabet() {
        return nameAlphabet;
    }

    public void setNameAlphabet(String nameAlphabet) {
        this.nameAlphabet = nameAlphabet;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DataState getState() {
        return state;
    }

    public void setState(DataState state) {
        this.state = state;
    }
}
