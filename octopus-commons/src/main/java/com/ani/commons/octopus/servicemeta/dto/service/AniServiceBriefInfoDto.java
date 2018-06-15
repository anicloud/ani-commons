package com.ani.commons.octopus.servicemeta.dto.service;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-1.
 */
public class AniServiceBriefInfoDto implements Serializable {

    private static final long serialVersionUID = -3364853920873221375L;
    @JsonSerialize(using = ToStringSerializer.class)
    private Long modelId;

    private Integer ObjNum;

    private Integer activeObjNum;

    private Integer testObjNum;

    private String  name;

    private String logoPath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Integer getObjNum() {
        return ObjNum;
    }

    public void setObjNum(Integer objNum) {
        ObjNum = objNum;
    }

    public Integer getActiveObjNum() {
        return activeObjNum;
    }

    public void setActiveObjNum(Integer activeObjNum) {
        this.activeObjNum = activeObjNum;
    }

    public Integer getTestObjNum() {
        return testObjNum;
    }

    public void setTestObjNum(Integer testObjNum) {
        this.testObjNum = testObjNum;
    }
}
