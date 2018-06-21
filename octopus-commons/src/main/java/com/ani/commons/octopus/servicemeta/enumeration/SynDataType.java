package com.ani.commons.octopus.servicemeta.enumeration;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhanglina on 18-6-1.
 */
public enum SynDataType {
    ACCOUNT(1),
    ORGANIZATION(2),
    GROUP(4),
    SERVICE(8);

    private final Integer typeId;

    SynDataType(int typeId) {
        this.typeId = typeId;
    }

    public int getId() {
        return this.typeId;
    }
    public static Set<SynDataType> getByTypes(int typesSum){
        SynDataType[] types = SynDataType.values();
        Set<SynDataType> curTypes = null;
        for(
                int oneTypeIdx = types.length - 1;
                oneTypeIdx >= 0; oneTypeIdx--) {
            SynDataType oneType = types[oneTypeIdx];
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
    public static short getByTypes(Set<SynDataType> SynDataTypes){
        int types=0;
        if (SynDataTypes!=null && SynDataTypes.size()!=0){
            for (SynDataType SynDataType:SynDataTypes){
                types=types+SynDataType.getId();
            }
        }
        return (short)types;
    }
}
