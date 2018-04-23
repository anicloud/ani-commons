package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.utils.core.AniArray;
import com.ani.utils.core.AniByte;
import com.ani.utils.core.AniSecureUtils;
import com.ani.utils.dto.AniDto;
import com.ani.utils.exception.AniRuleException;

import java.util.Arrays;

public abstract class ObjectRegisterDto extends AniDto {

    private static final long serialVersionUID = -9024030952112129525L;

    private String name;

    /**
     * Authentication code for registering object
     * 0-63bit: modelId
     * 64-127bit: timestamp
     * HMAC( token, (modelId && timestamp) )
     */
    private AniByte authCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AniByte getAuthCode() {
        return this.authCode;
    }

    public Long getModelId() {
        Long modelId = new AniByte(Arrays.copyOfRange(authCode.getBytes(), 0, 63)).bytes2Long();
        return modelId;
    }

    /**
     * Set authentication code by model token, model id and current timestamp
     *
     * @param modelToken
     * @param modelId
     * @param timestamp
     * @throws AniRuleException
     */
    public void setAuthCode(AniByte modelToken, long modelId, long timestamp) throws AniRuleException {
        byte[] hmacByte = AniSecureUtils.generateHMACByte(
                modelToken.getBytes(),
                new AniByte(modelId & timestamp).getBytes(),
                "HmacSHA256");
        byte[] modelBytes = new AniByte(modelId).getBytes();
        byte[] timeByte = new AniByte(timestamp).getBytes();
        byte[] result = AniArray.concatByteAll(modelBytes, timeByte, hmacByte);
        this.authCode = new AniByte(result);
    }

}
