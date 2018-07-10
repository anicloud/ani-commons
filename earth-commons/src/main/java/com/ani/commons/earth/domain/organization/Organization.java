package com.ani.commons.earth.domain.organization;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-26.
 */
public class Organization implements Serializable {

    private static final long serialVersionUID = 974975520890838048L;

    private Integer orgId;
    private String name;
    private String description;
    private Long ownerId;
    private String fileType;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Organization() {
    }

}
