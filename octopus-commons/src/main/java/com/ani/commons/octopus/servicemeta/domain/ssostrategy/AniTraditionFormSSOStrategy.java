package com.ani.commons.octopus.servicemeta.domain.ssostrategy;

import com.ani.commons.octopus.servicemeta.enumeration.IntegrateType;
import com.ani.commons.octopus.servicemeta.enumeration.SubmitMethod;

/**
 * Created by zhanglina on 18-5-22.
 */
public class AniTraditionFormSSOStrategy extends AniSSOStrategy {

    private static final long serialVersionUID = -2678251783431332834L;
    private String usernameField;
    private String passwordField;
    private SubmitMethod submitMethod;
    private String handlePage;
    private String fileType;
    public AniTraditionFormSSOStrategy(){
        this.integrateType = IntegrateType.TRIDATIONFORM;
    }

    public String getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(String usernameField) {
        this.usernameField = usernameField;
    }

    public String getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(String passwordField) {
        this.passwordField = passwordField;
    }

    public SubmitMethod getSubmitMethod() {
        return submitMethod;
    }

    public void setSubmitMethod(SubmitMethod submitMethod) {
        this.submitMethod = submitMethod;
    }

    public String getHandlePage() {
        return handlePage;
    }

    public void setHandlePage(String handlePage) {
        this.handlePage = handlePage;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
