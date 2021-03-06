/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.13.0  - built at: 2019-08-07 15:10:42<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.13.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * User Authentication Data
 */
@ApiModel(description = "User Authentication Data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-13T14:08:20.178+02:00")
public class UserAuthData {
    @JsonProperty("method")
    private String method = null;

    @JsonProperty("login")
    private String login = null;

    @JsonProperty("password")
    private String password = null;

    @JsonProperty("mustChangePassword")
    private Boolean mustChangePassword = null;

    @JsonProperty("adConfigId")
    private Integer adConfigId = null;

    @JsonProperty("oidConfigId")
    private Integer oidConfigId = null;

    public UserAuthData method(String method) {
        this.method = method;
        return this;
    }

    /**
     * Authentication method  Authentication methods: * &#x60;basic&#x60; (or &#x60;sql&#x60;) * &#x60;active_directory&#x60; * &#x60;radius&#x60; * &#x60;openid&#x60;
     *
     * @return method
     **/
    @ApiModelProperty(required = true, value = "Authentication method  Authentication methods: * `basic` (or `sql`) * `active_directory` * `radius` * `openid`")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public UserAuthData login(String login) {
        this.login = login;
        return this;
    }

    /**
     * User login name
     *
     * @return login
     **/
    @ApiModelProperty(value = "User login name")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserAuthData password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Password (only relevant for &#x60;basic&#x60; authentication type) *NOT* your Active Directory, OpenID or RADIUS password!
     *
     * @return password
     **/
    @ApiModelProperty(value = "Password (only relevant for `basic` authentication type) *NOT* your Active Directory, OpenID or RADIUS password!")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserAuthData mustChangePassword(Boolean mustChangePassword) {
        this.mustChangePassword = mustChangePassword;
        return this;
    }

    /**
     * Determines whether user has to change his / her password * default: &#x60;true&#x60; for &#x60;basic&#x60; auth type * default: &#x60;false&#x60; for &#x60;active_directory&#x60;, &#x60;openid&#x60; and &#x60;radius&#x60; auth types
     *
     * @return mustChangePassword
     **/
    @ApiModelProperty(value = "Determines whether user has to change his / her password * default: `true` for `basic` auth type * default: `false` for `active_directory`, `openid` and `radius` auth types")
    public Boolean isMustChangePassword() {
        return mustChangePassword;
    }

    public void setMustChangePassword(Boolean mustChangePassword) {
        this.mustChangePassword = mustChangePassword;
    }

    public UserAuthData adConfigId(Integer adConfigId) {
        this.adConfigId = adConfigId;
        return this;
    }

    /**
     * ID of the user&#39;s Active Directory.
     *
     * @return adConfigId
     **/
    @ApiModelProperty(value = "ID of the user's Active Directory.")
    public Integer getAdConfigId() {
        return adConfigId;
    }

    public void setAdConfigId(Integer adConfigId) {
        this.adConfigId = adConfigId;
    }

    public UserAuthData oidConfigId(Integer oidConfigId) {
        this.oidConfigId = oidConfigId;
        return this;
    }

    /**
     * ID of the user&#39;s OIDC provider.
     *
     * @return oidConfigId
     **/
    @ApiModelProperty(value = "ID of the user's OIDC provider.")
    public Integer getOidConfigId() {
        return oidConfigId;
    }

    public void setOidConfigId(Integer oidConfigId) {
        this.oidConfigId = oidConfigId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        UserAuthData userAuthData = (UserAuthData) o;
        return Objects.equals(this.method, userAuthData.method) &&
            Objects.equals(this.login, userAuthData.login) &&
            Objects.equals(this.password, userAuthData.password) &&
            Objects.equals(this.mustChangePassword, userAuthData.mustChangePassword) &&
            Objects.equals(this.adConfigId, userAuthData.adConfigId) &&
            Objects.equals(this.oidConfigId, userAuthData.oidConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, login, password, mustChangePassword, adConfigId, oidConfigId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAuthData {\n");

        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    mustChangePassword: ").append(toIndentedString(mustChangePassword)).append("\n");
        sb.append("    adConfigId: ").append(toIndentedString(adConfigId)).append("\n");
        sb.append("    oidConfigId: ").append(toIndentedString(oidConfigId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if(o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

