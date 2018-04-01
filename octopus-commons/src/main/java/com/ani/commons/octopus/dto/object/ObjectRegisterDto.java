package com.ani.commons.octopus.dto.object;

import com.ani.utils.core.AniArray;
import com.ani.utils.core.AniByte;
import com.ani.utils.core.AniSecureUtils;
import com.ani.utils.exception.AniRuleException;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by zhanglina on 18-3-29.
 */
public class ObjectRegisterDto implements Serializable {

    private static final long serialVersionUID = -7893713192108329556L;
    /**
     * default name
     */
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
    public Long  getModelId(){
        Long modelId= new AniByte(Arrays.copyOfRange(authCode.getBytes(),0,63)).bytes2Long();
        return modelId;
    }
    /**
     * Set authentication code by model token, model id and current timestamp
     * @param modelToken
     * @param modelId
     * @param timestamp
     * @throws AniRuleException
     */
    public void setAuthCode(AniByte modelToken, long modelId, long timestamp) throws AniRuleException {
       byte[] hmacByte= AniSecureUtils.generateHMACByte(modelToken.getBytes(), new AniByte(modelId & timestamp).getBytes(), "HmacSHA256");
       byte[] modelBytes=new AniByte(modelId).getBytes();
       byte[] timeByte=new AniByte(timestamp).getBytes();
       byte[] result = AniArray.concatByteAll(modelBytes,timeByte,hmacByte);
        authCode=new AniByte(result);
    }


}
