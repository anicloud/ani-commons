package com.ani.commons.earth.domain.role;


import com.ani.utils.core.data.type.PrivilegeType;
import com.sun.org.glassfish.external.statistics.TimeStatistic;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by ebrx on 18-7-26.
 */
public class AccountRole implements Serializable {
    private static final long serialVersionUID = 2835983517461985839L;

    private Long id;
    private Long ownerId;
    private String name;
    private Set<PrivilegeType> privileges;
    private Timestamp updateTime;
    private Timestamp createTime;

    public AccountRole() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PrivilegeType> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Set<PrivilegeType> privileges) {
        this.privileges = privileges;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
