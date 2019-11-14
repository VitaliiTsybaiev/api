/*
 * API V3
 * Please log in using your email and password in order to use API
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.endpoints.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JwtModel
 */

public class JwtModel {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("exp")
  private Long exp = null;

  @SerializedName("iat")
  private Long iat = null;

  @SerializedName("refreshToken")
  private String refreshToken = null;

  @SerializedName("roles")
  private List<String> roles = null;

  @SerializedName("speedUnits")
  private String speedUnits = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("username")
  private String username = null;

  public JwtModel accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public JwtModel exp(Long exp) {
    this.exp = exp;
    return this;
  }

   /**
   * Get exp
   * @return exp
  **/
  @ApiModelProperty(value = "")
  public Long getExp() {
    return exp;
  }

  public void setExp(Long exp) {
    this.exp = exp;
  }

  public JwtModel iat(Long iat) {
    this.iat = iat;
    return this;
  }

   /**
   * Get iat
   * @return iat
  **/
  @ApiModelProperty(value = "")
  public Long getIat() {
    return iat;
  }

  public void setIat(Long iat) {
    this.iat = iat;
  }

  public JwtModel refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @ApiModelProperty(value = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public JwtModel roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public JwtModel addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public JwtModel speedUnits(String speedUnits) {
    this.speedUnits = speedUnits;
    return this;
  }

   /**
   * Get speedUnits
   * @return speedUnits
  **/
  @ApiModelProperty(value = "")
  public String getSpeedUnits() {
    return speedUnits;
  }

  public void setSpeedUnits(String speedUnits) {
    this.speedUnits = speedUnits;
  }

  public JwtModel timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public JwtModel token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public JwtModel userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public JwtModel username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JwtModel jwtModel = (JwtModel) o;
    return Objects.equals(this.accountId, jwtModel.accountId) &&
        Objects.equals(this.exp, jwtModel.exp) &&
        Objects.equals(this.iat, jwtModel.iat) &&
        Objects.equals(this.refreshToken, jwtModel.refreshToken) &&
        Objects.equals(this.roles, jwtModel.roles) &&
        Objects.equals(this.speedUnits, jwtModel.speedUnits) &&
        Objects.equals(this.timezone, jwtModel.timezone) &&
        Objects.equals(this.token, jwtModel.token) &&
        Objects.equals(this.userId, jwtModel.userId) &&
        Objects.equals(this.username, jwtModel.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, exp, iat, refreshToken, roles, speedUnits, timezone, token, userId, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JwtModel {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    speedUnits: ").append(toIndentedString(speedUnits)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
