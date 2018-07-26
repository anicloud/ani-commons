package com.ani.commons.earth.dto.organization.node;

import com.ani.utils.dto.AniDto;
import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-26.
 * Last Modified by xuben on 18-7-26.
 */
public class OTNodeAddDto extends AniDto implements Serializable {
    private static final long serialVersionUID = -463500843397755139L;

    private Long ownerId;

    private String nodeDesc;

    private Long parentNodeId;

    private String tel;

    private Integer businessCategory;

    private String postalCode;

    private String postalAddress;

    public OTNodeAddDto(Long ownerId, String nodeDesc, Long parentNodeId, String tel, Integer businessCategory, String postalCode, String postalAddress) {
        this.ownerId = ownerId;
        this.nodeDesc = nodeDesc;
        this.parentNodeId = parentNodeId;
        this.tel = tel;
        this.businessCategory = businessCategory;
        this.postalCode = postalCode;
        this.postalAddress = postalAddress;
    }

    public OTNodeAddDto() {
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
