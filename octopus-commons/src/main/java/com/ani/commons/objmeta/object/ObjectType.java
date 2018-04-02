package com.ani.commons.objmeta.object;

public enum ObjectType {
    SERVICE(1),
    DEVICE(2),
    SITE(4);

    private final int id;

    ObjectType(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
}