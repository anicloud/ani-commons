package com.ani.commons.bus.site.enumeration;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhanglina on 18-4-3.
 */
public enum AniSiteType {

    NATIVEAPP(1),
    WEBAPP(2),
    INSTAPP(4),
    QUICKAPP(8),
    WCMINIAPP(16),
    WCPUBACCOUNT(32);

    private final int id;

    AniSiteType(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public static Set<AniSiteType> getByTypes(int typesSum){
        AniSiteType[] types = AniSiteType.values();
        Set<AniSiteType> curTypes = null;
        for(
                int oneTypeIdx = types.length - 1;
                oneTypeIdx >= 0; oneTypeIdx--) {
            AniSiteType oneType = types[oneTypeIdx];
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

}
