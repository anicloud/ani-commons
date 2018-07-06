package com.ani.commons.earth.dto.register;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.util.List;

/**
 * Created by zhanglina on 18-7-5.
 */
public class OrgAccountInsideRegisterDto extends AniDto {

    private static final long serialVersionUID = 7159660789280525988L;
    @AniRequiredField
    private Long orgId;
    private List<AccountInsideRegisterDto> insideRegisterDtoList;


    public OrgAccountInsideRegisterDto() {
    }

    public OrgAccountInsideRegisterDto(List<AccountInsideRegisterDto> insideRegisterDtoList, Long orgId) {
        this.insideRegisterDtoList = insideRegisterDtoList;
        this.orgId = orgId;
    }

    public List<AccountInsideRegisterDto> getInsideRegisterDtoList() {
        return insideRegisterDtoList;
    }

    public void setInsideRegisterDtoList(List<AccountInsideRegisterDto> insideRegisterDtoList) {
        this.insideRegisterDtoList = insideRegisterDtoList;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}
