package com.ani.commons.earth.domain.organization.node;

import com.ani.commons.earth.enumeration.BusinessCategoryType;
import com.ani.commons.earth.enumeration.organization.NodeType;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by zhanglina on 18-5-2.
 * Last Modified by xuben on 18-8-10.
 */
public class OTNode implements Serializable {

    private static final long serialVersionUID = 5520644352781449962L;


    private Long orgAccountGroupId;
    private Long parentNodeId;
    private NodeType nodeType;
    private String name;
    private String nodeDesc;
    private Long accountGroupId;
    private Long childrenId;
    private String tel;
    private Set<BusinessCategoryType> businessCategory;
    private String postalCode;
    private String postalAddress;

    public OTNode(Long orgAccountId, Long parentNodeId, NodeType nodeType, String name, String nodeDesc, Long accountGroupId, Long childrenId, String tel, Set<BusinessCategoryType> businessCategory, String postalCode, String postalAddress) {
        this.orgAccountGroupId = orgAccountId;
        this.parentNodeId = parentNodeId;
        this.nodeType = nodeType;
        this.name = name;
        this.nodeDesc = nodeDesc;
        this.accountGroupId = accountGroupId;
        this.childrenId = childrenId;
        this.tel = tel;
        this.businessCategory = businessCategory;
        this.postalCode = postalCode;
        this.postalAddress = postalAddress;
    }

    public Long getAccountGroupId() {
        return accountGroupId;
    }

    public void setAccountGroupId(Long accountGroupId) {
        this.accountGroupId = accountGroupId;
    }

    public Long getOrgAccountId() {
        return orgAccountGroupId;
    }

    public void setOrgAccountId(Long orgAccountId) {
        this.orgAccountGroupId = orgAccountId;
    }

    public Long getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Long parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getChildrenId() {
        return childrenId;
    }

    public void setChildrenId(Long childrenId) {
        this.childrenId = childrenId;
    }
}
