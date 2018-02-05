package com.ani.commons.octopus.object.enumeration;

/**
 * Created by yeh on 15-10-16.
 */
public enum ConnState {
    ACTIVE,
    DISABLE,
    REMOVED;

    public static ConnState[] values = ConnState.values();

    public byte getStateByte() {
        return (byte) this.ordinal();
    }

    public byte[] getStateByteArr() {
        return new byte[]{
                getStateByte()
        };
    }
}
