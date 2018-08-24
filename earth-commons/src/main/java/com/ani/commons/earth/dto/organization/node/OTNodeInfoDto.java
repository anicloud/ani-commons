package com.ani.commons.earth.dto.organization.node;

import com.ani.commons.earth.enumeration.BusinessCategoryType;
import com.ani.commons.earth.enumeration.organization.NodeType;
import com.ani.utils.dto.AniRequiredField;

import java.util.Set;

/**
 * Created by zhanglina on 18-4-26.
 * Last Modified by xuben on 18-7-31.
 */
public class OTNodeInfoDto extends OTNodeAdminOpDto {

    private static final long serialVersionUID = -463500843397755139L;

    @AniRequiredField
    private String name;

    private NodeType nodeType;

    private String nodeDesc;

    private String tel;

    private Set<BusinessCategoryType> businessCategory;

    private String postalCode;

    private String postalAddress;

    public OTNodeInfoDto() {
    }

    public OTNodeInfoDto(Long opAccountId, Long targetNodeGroupId, String name, NodeType nodeType, String nodeDesc, String tel, Set<BusinessCategoryType> businessCategory, String postalCode, String postalAddress) {
        super(opAccountId, targetNodeGroupId);
        this.name = name;
        this.nodeType = nodeType;
        this.nodeDesc = nodeDesc;
        this.tel = tel;
        this.businessCategory = businessCategory;
        this.postalCode = postalCode;
        this.postalAddress = postalAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
