package com.ani.commons.earth.dto.group;

import com.ani.commons.earth.enumeration.GroupType;
import com.ani.utils.dto.AniRequiredField;
import com.ani.utils.exception.AniRuleException;

/**
 * Created by changhan on 18-8-20.
 */
public class GroupRegisterDto extends GroupAdminOpDto {

    private String description;

    @AniRequiredField
    private String name;

    @AniRequiredField
    private GroupType groupType;

    private Long ownerAccountId;

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public GroupType getGroupType() {return groupType;}

    public void setGroupType(GroupType groupType) {this.groupType = groupType;}

    public Long getOwnerAccountId() {return ownerAccountId;}

    public void setOwnerAccountId(Long ownerAccountId) {this.ownerAccountId = ownerAccountId;}

    public GroupRegisterDto() {
    }

    public GroupRegisterDto(Long opAccountId, Long privilegeGroupId, Long targetGroupId, String description, String name, GroupType groupType, Long ownerAccountId) {
        super(opAccountId, privilegeGroupId, targetGroupId);
        this.description = description;
        this.name = name;
        this.groupType = groupType;
        this.ownerAccountId = ownerAccountId;
    }

    @Override
    public void checkFields() throws AniRuleException {
        if(this.getPrivilegeGroupId() == null && this.ownerAccountId == null) {
            throw new AniRuleException("ONE_OF_OWNER_AND_PRIVACY_GROUP_MUST_BE_PROVIDED");
        }
        super.checkFields();
    }
}
