package com.ani.commons.earth.dto.organization.node;

import com.ani.commons.earth.enumeration.BusinessCategoryType;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by xuben on 18-8-10.
 * Last Modified by xuben on 18-8-10.
 */
public class OTNodeDetailDto implements Serializable {
    private static final long serialVersionUID = 5178457830140115174L;

    private Long nodeId;

    private Long ownerId;

    private Long parentNodeId;

    private String name;

    private String nodeDesc;

    private Long accountGroupId;

    private String tel;

    private Set<BusinessCategoryType> businessCategory;

    private String postalCode;

    private String postalAddress;

    private OTNodeDetailDto children;

    public OTNodeDetailDto() {
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Long parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }

    public Long getAccountGroupId() {
        return accountGroupId;
    }

    public void setAccountGroupId(Long accountGroupId) {
        this.accountGroupId = accountGroupId;
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

    public OTNodeDetailDto getChildren() {
        return children;
    }

    public void setChildren(OTNodeDetailDto children) {
        this.children = children;
    }
}

