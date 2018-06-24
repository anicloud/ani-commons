package com.ani.commons.octopus.objmeta.dto.object;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

public abstract class ObjectRegisterDto extends AniDto {

    private static final long serialVersionUID = -9024030952112129525L;

    @AniRequiredField
    private Long modelId;
    private String name;
    private Long ownerAccountId;

    public ObjectRegisterDto() {
    }

    public ObjectRegisterDto(Long modelId, String name, Long ownerAccountId) {
        this.modelId = modelId;
        this.name = name;
        this.ownerAccountId = ownerAccountId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * Authentication code for registering domain
     * 0-63bit: modelId
     * 64-127bit: timestamp
     * HMAC( token, (modelId && timestamp) )
     */
//    @AniRequiredField
//    private byte[] authCode;

//    public Long getModelId() {
//        Long modelId = new AniByte(Arrays.copyOfRange(authCode, 0, 63)).bytes2Long();
//        return modelId;
//    }

//    /**
//     * Set authentication code by model token, model id and current timestamp
//     *
//     * @param modelToken
//     * @param modelId
//     * @param timestamp
//     * @throws AniRuleException
//     */
//    public void setAuthCode(byte[] modelToken, long modelId, long timestamp) throws AniRuleException {
//        byte[] hmacByte = AniSecureUtils.generateHMACByte(
//                modelToken,
//                new AniByte(modelId & timestamp).getBytes(),
//                "HmacSHA256");
//        byte[] modelBytes = new AniByte(modelId).getBytes();
//        byte[] timeByte = new AniByte(timestamp).getBytes();
//        byte[] result = AniArray.concatByteAll(modelBytes, timeByte, hmacByte);
//        this.authCode = result;
//    }

}
