package com.ani.commons.earth.dto.group;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by zhanglina on 18-7-26.
 */
public class GroupMemberUpdateDto extends AniDto{
    private static final long serialVersionUID = -2279589906861710169L;

    @AniRequiredField
    private Long groupId;
    @AniRequiredField
    private Long roleId;
}
