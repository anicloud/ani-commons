package com.ani.commons.earth.dto.organization.node;

import com.ani.utils.core.DataState;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-5-9.
 */
public class EmployeeStateUpdateDto implements Serializable {

    private static final long serialVersionUID = 3400064266516960000L;

    private Long employeeId;
    private DataState dataState;
    private OTNodeOpDto otNodeOpDto;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public DataState getDataState() {
        return dataState;
    }

    public void setDataState(DataState dataState) {
        this.dataState = dataState;
    }

    public OTNodeOpDto getOtNodeOpDto() {
        return otNodeOpDto;
    }

    public void setOtNodeOpDto(OTNodeOpDto otNodeOpDto) {
        this.otNodeOpDto = otNodeOpDto;
    }
}
