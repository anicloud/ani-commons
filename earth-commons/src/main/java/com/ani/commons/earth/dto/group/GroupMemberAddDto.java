package com.ani.commons.earth.dto.group;

import com.ani.utils.dto.AniDto;

import java.util.Map;
import java.util.Set;

/**
 * Created by zhanglina on 18-7-26.
 */
public class GroupMemberAddDto extends AniDto {
    private static final long serialVersionUID = 7335217867980603248L;
    private Long groupId;
    private Map<Long,Set<Long>> members;


}
