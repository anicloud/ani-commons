package com.ani.commons.octopus.servicemeta.dto.service;

import com.ani.commons.octopus.objmeta.dto.model.ModelQueryDto;
import com.ani.commons.octopus.servicemeta.domain.service.AniDataSynStrategy;
import com.ani.commons.octopus.servicemeta.enumeration.InterfaceType;
import com.ani.commons.octopus.servicemeta.enumeration.InterfaceVersion;
import com.ani.commons.octopus.servicemeta.enumeration.SynDataType;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-6-6.
 */
public class AniDataSynStrategyRegisterDto implements Serializable {

    private static final long serialVersionUID = 7854278135303787411L;

    private String uniUserField;

    private String uniNodeField;

    private SynDataType synDataType;

    private String character;

    private String synCircle;

    private InterfaceVersion interfaceVersion ;

    private InterfaceType interfaceType;

    private String interfaceAddress;

    private String interfaceMethod;

    private ModelQueryDto modelQueryDto;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUniUserField() {
        return uniUserField;
    }

    public void setUniUserField(String uniUserField) {
        this.uniUserField = uniUserField;
    }

    public String getUniNodeField() {
        return uniNodeField;
    }

    public void setUniNodeField(String uniNodeField) {
        this.uniNodeField = uniNodeField;
    }

    public SynDataType getSynDataType() {
        return synDataType;
    }

    public void setSynDataType(SynDataType synDataType) {
        this.synDataType = synDataType;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getSynCircle() {
        return synCircle;
    }

    public void setSynCircle(String synCircle) {
        this.synCircle = synCircle;
    }

    public InterfaceVersion getInterfaceVersion() {
        return interfaceVersion;
    }

    public void setInterfaceVersion(InterfaceVersion interfaceVersion) {
        this.interfaceVersion = interfaceVersion;
    }

    public InterfaceType getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(InterfaceType interfaceType) {
        this.interfaceType = interfaceType;
    }

    public String getInterfaceAddress() {
        return interfaceAddress;
    }

    public void setInterfaceAddress(String interfaceAddress) {
        this.interfaceAddress = interfaceAddress;
    }

    public String getInterfaceMethod() {
        return interfaceMethod;
    }

    public void setInterfaceMethod(String interfaceMethod) {
        this.interfaceMethod = interfaceMethod;
    }

    public ModelQueryDto getModelQueryDto() {
        return modelQueryDto;
    }

    public void setModelQueryDto(ModelQueryDto modelQueryDto) {
        this.modelQueryDto = modelQueryDto;
    }
}
