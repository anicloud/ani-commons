package com.ani.commons.earth.dto.organization.node;

import com.ani.commons.earth.enumeration.BusinessCategoryType;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by zhanglina on 18-4-26.
 * Last Modified by xuben on 18-7-31.
 */
public class OTNodeInfoUpdateDto extends AniDto implements Serializable {

    private static final long serialVersionUID = -463500843397755139L;

    private Long groupId;
    private Long nodeId;
    private Long ownerId;
    private String name;
    private String nodeDesc;
    private Long parentNodeId;
    private String tel;
    private Set<BusinessCategoryType> businessCategory;
    private String postalCode;
    private String postalAddress;

    public OTNodeInfoUpdateDto(String name, String nodeDesc, String tel, Set<BusinessCategoryType> businessCategory, String postalCode, String postalAddress, Long ownerId) {
        this.name = name;
        this.nodeDesc = nodeDesc;
        this.tel = tel;
        this.businessCategory = businessCategory;
        this.postalCode = postalCode;
        this.postalAddress = postalAddress;
        this.ownerId = ownerId;
    }

    public OTNodeInfoUpdateDto(Long nodeId, Long ownerId, String name, String nodeDesc, Long parentNodeId, String tel, Set<BusinessCategoryType> businessCategory, String postalCode, String postalAddress) {
        this.nodeId = nodeId;
        this.ownerId = ownerId;
        this.name = name;
        this.nodeDesc = nodeDesc;
        this.parentNodeId = parentNodeId;
        this.tel = tel;
        this.businessCategory = businessCategory;
        this.postalCode = postalCode;
        this.postalAddress = postalAddress;
    }

    public Long getGroupId() {return groupId;}

    public void setGroupId(Long groupId) {this.groupId = groupId;}

    public OTNodeInfoUpdateDto(Long nodeId) {
        this.nodeId = nodeId;
    }

    public OTNodeInfoUpdateDto() {
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }

    public Long getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Long parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Set<BusinessCategoryType> getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(Set<BusinessCategoryType> businessCategory) {
        this.businessCategory = businessCategory;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
