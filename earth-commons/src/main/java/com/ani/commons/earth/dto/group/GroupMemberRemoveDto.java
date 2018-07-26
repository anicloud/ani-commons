package com.ani.commons.earth.dto.group;

import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by zhanglina on 18-7-26.
 */
public class GroupMemberRemoveDto extends AniDto {

    private static final long serialVersionUID = 1197428592964861583L;
    private Long groupId;
    private List<Long> accountIds;

}
