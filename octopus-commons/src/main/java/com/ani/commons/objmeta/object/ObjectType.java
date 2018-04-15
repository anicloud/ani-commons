package com.ani.commons.objmeta.object;

import java.util.HashSet;
import java.util.Set;

public enum ObjectType {

    SERVICE(1),
    DEVICE(2),
    SITE(3);

    private final int id;

    ObjectType(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public static Set<ObjectType> getTypes(int typesIdSum){
        Set<ObjectType> types = null;
        ObjectType[] typesEnum = ObjectType.values();
        if(typesIdSum < typesEnum[0].getId()) return null;
        for(
                int oneIdx = typesEnum.length - 1;
                oneIdx >= 0;
                oneIdx--){
            ObjectType oneObj = typesEnum[oneIdx];
            if(typesIdSum < oneObj.getId()) continue;
            if(types == null)
                types = new HashSet<>(oneIdx + 1);
            if(typesIdSum - oneObj.getId() < 0) continue;
            types.add(oneObj);
            typesIdSum--;
        }
        return types;
    }
}