package com.ani.commons.earth.domain.organization.node;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by zhanglina on 18-5-2.
 * Last Modified by xuben on 18-7-26.
 */
public class OTNode implements Serializable {

    private static final long serialVersionUID = 5520644352781449962L;

    private Long ownerId;
    private Long parentNodeId;
    private Long nodeId;
    private String nodeDesc;
    private Long accountGroupId;
    private List<Long> childrenId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String tel;
    private Integer businessCategory;
    private String postalCode;
    private String postalAddress;

    public Long getAccountGroupId() {
        return accountGroupId;
    }

    public void setAccountGroupId(Long accountGroupId) {
        this.accountGroupId = accountGroupId;
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

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }

    public List<Long> getChildren() {
        return childrenId;
    }

    public void setChildren(List<Long> children) {
        this.childrenId = children;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(Integer businessCategory) {
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
}
