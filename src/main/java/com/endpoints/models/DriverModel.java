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

/**
 * DriverModel
 */

public class DriverModel {
  @SerializedName("address")
  private String address = null;

  @SerializedName("badgeId")
  private String badgeId = null;

  @SerializedName("contactEmail")
  private String contactEmail = null;

  @SerializedName("contactPhone")
  private String contactPhone = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("driverId")
  private String driverId = null;

  @SerializedName("licenseExpiresAt")
  private Long licenseExpiresAt = null;

  @SerializedName("licenseNumber")
  private String licenseNumber = null;

  @SerializedName("licenseType")
  private String licenseType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nickName")
  private String nickName = null;

  public DriverModel address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public DriverModel badgeId(String badgeId) {
    this.badgeId = badgeId;
    return this;
  }

   /**
   * Get badgeId
   * @return badgeId
  **/
  @ApiModelProperty(value = "")
  public String getBadgeId() {
    return badgeId;
  }

  public void setBadgeId(String badgeId) {
    this.badgeId = badgeId;
  }

  public DriverModel contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
  @ApiModelProperty(value = "")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public DriverModel contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * Get contactPhone
   * @return contactPhone
  **/
  @ApiModelProperty(value = "")
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public DriverModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DriverModel deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @ApiModelProperty(value = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public DriverModel driverId(String driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * Get driverId
   * @return driverId
  **/
  @ApiModelProperty(value = "")
  public String getDriverId() {
    return driverId;
  }

  public void setDriverId(String driverId) {
    this.driverId = driverId;
  }

  public DriverModel licenseExpiresAt(Long licenseExpiresAt) {
    this.licenseExpiresAt = licenseExpiresAt;
    return this;
  }

   /**
   * Get licenseExpiresAt
   * @return licenseExpiresAt
  **/
  @ApiModelProperty(value = "")
  public Long getLicenseExpiresAt() {
    return licenseExpiresAt;
  }

  public void setLicenseExpiresAt(Long licenseExpiresAt) {
    this.licenseExpiresAt = licenseExpiresAt;
  }

  public DriverModel licenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
    return this;
  }

   /**
   * Get licenseNumber
   * @return licenseNumber
  **/
  @ApiModelProperty(value = "")
  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public DriverModel licenseType(String licenseType) {
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @ApiModelProperty(value = "")
  public String getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }

  public DriverModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DriverModel nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

   /**
   * Get nickName
   * @return nickName
  **/
  @ApiModelProperty(value = "")
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverModel driverModel = (DriverModel) o;
    return Objects.equals(this.address, driverModel.address) &&
        Objects.equals(this.badgeId, driverModel.badgeId) &&
        Objects.equals(this.contactEmail, driverModel.contactEmail) &&
        Objects.equals(this.contactPhone, driverModel.contactPhone) &&
        Objects.equals(this.description, driverModel.description) &&
        Objects.equals(this.deviceId, driverModel.deviceId) &&
        Objects.equals(this.driverId, driverModel.driverId) &&
        Objects.equals(this.licenseExpiresAt, driverModel.licenseExpiresAt) &&
        Objects.equals(this.licenseNumber, driverModel.licenseNumber) &&
        Objects.equals(this.licenseType, driverModel.licenseType) &&
        Objects.equals(this.name, driverModel.name) &&
        Objects.equals(this.nickName, driverModel.nickName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, badgeId, contactEmail, contactPhone, description, deviceId, driverId, licenseExpiresAt, licenseNumber, licenseType, name, nickName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverModel {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    badgeId: ").append(toIndentedString(badgeId)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    licenseExpiresAt: ").append(toIndentedString(licenseExpiresAt)).append("\n");
    sb.append("    licenseNumber: ").append(toIndentedString(licenseNumber)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
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
