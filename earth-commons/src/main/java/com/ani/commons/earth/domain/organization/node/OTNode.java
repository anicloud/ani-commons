package com.ani.commons.earth.domain.organization.node;

import com.ani.commons.earth.enumeration.organization.NodeType;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by zhanglina on 18-5-2.
 * Last Modified by xuben on 18-7-26.
 */
public abstract class OTNode implements Serializable {
    private static final long serialVersionUID = 5520644352781449962L;

    protected Long ownerId;

    protected Long parentNodeId;

    protected Long nodeId;

    protected String nodeDesc;

    protected Long accountGroupId;

    protected List<Long> children;

    protected Timestamp createTime;

    protected Timestamp updateTime;

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
        return children;
    }

    public void setChildren(List<Long> children) {
        this.children = children;
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
}
