package com.ani.commons.octopus.objmeta;

import com.ani.utils.core.datatype.AniDataType;

import java.io.Serializable;

public class AniMetaArgument implements Serializable {
    
    private static final long serialVersionUID = 4521631854136338733L;

    protected AniDataType dataType;

    protected String name;

    protected boolean isRequired;

    public AniMetaArgument() {
    }

    public AniMetaArgument(AniDataType dataType, String name, boolean isRequired) {
        this.dataType = dataType;
        this.name = name;
        this.isRequired = isRequired;
    }
    
    public AniDataType getDataType() {
        return dataType;
    }

    public void setDataType(AniDataType dataType) {
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }
}
