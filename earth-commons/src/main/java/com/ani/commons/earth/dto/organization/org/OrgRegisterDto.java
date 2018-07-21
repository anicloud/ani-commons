package com.ani.commons.earth.dto.organization.org;

import com.ani.utils.dto.AniDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * Created by zhanglina on 18-4-26.
 */
public class OrgRegisterDto extends AniDto implements Serializable {

    private static final long serialVersionUID = 5608174783706635645L;

    private String name;
    private String description;
    private Long ownerId;
    private Long curUserId;
    // TODO: 18-4-26  add other info

    public OrgRegisterDto() {
    }

    public OrgRegisterDto(String name, String description, Long ownerId, Long curUserId) {
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.curUserId = curUserId;
    }

    public Long getOwnerId() {
        return ownerId;
    }


    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCurUserId() {
        return curUserId;
    }

    public void setCurUserId(Long curUserId) {
        this.curUserId = curUserId;
    }
}
