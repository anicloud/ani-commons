package com.ani.commons.octopus.servicemeta.domain.service;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-1.
 */
public class AniServiceBriefInfo implements Serializable {

    private static final long serialVersionUID = -3364853920873221375L;

    private Long modelId;

    private Integer ObjNum;

    private Integer activeObjNum;

    private Integer testObjNum;

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
