package com.ani.commons.earth.interfaces;

import com.ani.commons.earth.domain.account.AniAccount;
import com.ani.commons.earth.dto.op.GroupOpDto;
import com.ani.commons.earth.dto.op.OpDto;
import com.ani.commons.earth.dto.role.RoleOpDto;
import org.springframework.stereotype.Service;

/**
 * Created by changhan on 18-8-25.
 */
@Service
public interface OpService {

    public AniAccount checkOperatorAccount(OpDto op);

    /**
     * Check operation legality by privilege of resource owner account
     * @param groupOpDto
     * @return resource account object
     */
    public AniAccount checkOpGroupOwner(GroupOpDto groupOpDto);

    /**
     * Check operation legality by operator and privilege of resource account group.
     * @param roleOpDto
     * @return target group of resource account.
     */
    public AniAccount checkOpPrivilegeInGroup(RoleOpDto roleOpDto);

}
