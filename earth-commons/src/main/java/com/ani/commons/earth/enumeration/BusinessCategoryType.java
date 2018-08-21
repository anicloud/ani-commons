package com.ani.commons.earth.enumeration;

import com.ani.utils.core.data.type.PrivilegeType;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhanglina on 18-7-27.
 */
public enum BusinessCategoryType {
    IT(1),
    FINANCE(2),
    CHEMICAL(4),
    HEALTH(8);
    private final Integer id;
    BusinessCategoryType(int id) {
        this.id = id;
    }
    // TODO: 18-7-27 add anothors

    public Integer getId() {
        return id;
    }
    public static Set<BusinessCategoryType > getByTypes(int typesSum){
        BusinessCategoryType[] types = BusinessCategoryType.values();
        Set<BusinessCategoryType > curTypes = null;
        for(
                int oneTypeIdx = types.length - 1;
                oneTypeIdx >= 0; oneTypeIdx--) {
            BusinessCategoryType  oneType = types[oneTypeIdx];
            if(typesSum < oneType.getId())
                continue;
            if(curTypes == null)
                curTypes = new HashSet<>(oneTypeIdx + 1, 1f);
            typesSum = typesSum - oneType.getId();
            curTypes.add(oneType);
            if(typesSum == 0) break;
        }
        return curTypes;
    }
    public static short getByTypes(Set<BusinessCategoryType > bcts){
        int types=0;
        if (bcts!=null && bcts.size()!=0){
            for (BusinessCategoryType  bct:bcts){
                types=types+bct.getId();
            }
        }
        return (short)types;
    }
}
