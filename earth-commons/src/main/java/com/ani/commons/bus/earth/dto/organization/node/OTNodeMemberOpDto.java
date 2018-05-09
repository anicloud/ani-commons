package com.ani.commons.bus.earth.dto.organization.node;

import com.ani.utils.dto.AniDto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 18-5-2.
 */
public class OTNodeMemberOpDto extends AniDto implements Serializable{

    private static final long serialVersionUID = 5612168550800665762L;

    private OTNodeOpDto otNodeOpDto;

    private List<Long> employeesId;

    public List<Long> getEmployeesId() {
        return employeesId;
    }

    public void setEmployeesId(List<Long> employeesId) {
        this.employeesId = employeesId;
    }

    public OTNodeOpDto getOtNodeOpDto() {
        return otNodeOpDto;
    }

    public void setOtNodeOpDto(OTNodeOpDto otNodeOpDto) {
        this.otNodeOpDto = otNodeOpDto;
    }
}
