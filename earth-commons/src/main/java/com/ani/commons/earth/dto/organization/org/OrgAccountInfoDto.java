package com.ani.commons.earth.dto.organization.org;

import com.ani.commons.earth.dto.organization.node.OTNodeOpDto;
import com.ani.utils.dto.AniDto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-4-26.
 */
public class OrgAccountInfoDto extends AniDto implements Serializable {

    private static final long serialVersionUID = 5964602716066922903L;
    private List<Long> employeeId;
    private OTNodeOpDto otNodeOpDto;

    public OTNodeOpDto getOtNodeOpDto() {
        return otNodeOpDto;
    }

    public void setOtNodeOpDto(OTNodeOpDto otNodeOpDto) {
        this.otNodeOpDto = otNodeOpDto;
    }

    public List<Long> getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(List<Long> employeeId) {
        this.employeeId = employeeId;
    }
}
