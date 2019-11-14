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
import com.endpoints.models.GeozoneActivityModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GeozoneWithActivitiesModel
 */

public class GeozoneWithActivitiesModel {
  @SerializedName("activities")
  private List<GeozoneActivityModel> activities = null;

  @SerializedName("arrivalZone")
  private Boolean arrivalZone = null;

  @SerializedName("autoNotify")
  private Boolean autoNotify = null;

  @SerializedName("coordinates")
  private List<GeozoneCoordinateModel> coordinates = null;

  @SerializedName("departureZone")
  private Boolean departureZone = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("geozoneId")
  private String geozoneId = null;

  @SerializedName("hideOnMaps")
  private Boolean hideOnMaps = null;

  @SerializedName("pushPin")
  private String pushPin = null;

  @SerializedName("radius")
  private Integer radius = null;

  @SerializedName("reverseGeoCode")
  private Boolean reverseGeoCode = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("zoneColor")
  private String zoneColor = null;

  public GeozoneWithActivitiesModel activities(List<GeozoneActivityModel> activities) {
    this.activities = activities;
    return this;
  }

  public GeozoneWithActivitiesModel addActivitiesItem(GeozoneActivityModel activitiesItem) {
    if (this.activities == null) {
      this.activities = new ArrayList<GeozoneActivityModel>();
    }
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * Get activities
   * @return activities
  **/
  @ApiModelProperty(value = "")
  public List<GeozoneActivityModel> getActivities() {
    return activities;
  }

  public void setActivities(List<GeozoneActivityModel> activities) {
    this.activities = activities;
  }

  public GeozoneWithActivitiesModel arrivalZone(Boolean arrivalZone) {
    this.arrivalZone = arrivalZone;
    return this;
  }

   /**
   * Get arrivalZone
   * @return arrivalZone
  **/
  @ApiModelProperty(value = "")
  public Boolean isArrivalZone() {
    return arrivalZone;
  }

  public void setArrivalZone(Boolean arrivalZone) {
    this.arrivalZone = arrivalZone;
  }

  public GeozoneWithActivitiesModel autoNotify(Boolean autoNotify) {
    this.autoNotify = autoNotify;
    return this;
  }

   /**
   * Get autoNotify
   * @return autoNotify
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoNotify() {
    return autoNotify;
  }

  public void setAutoNotify(Boolean autoNotify) {
    this.autoNotify = autoNotify;
  }

  public GeozoneWithActivitiesModel coordinates(List<GeozoneCoordinateModel> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public GeozoneWithActivitiesModel addCoordinatesItem(GeozoneCoordinateModel coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<GeozoneCoordinateModel>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(value = "")
  public List<GeozoneCoordinateModel> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<GeozoneCoordinateModel> coordinates) {
    this.coordinates = coordinates;
  }

  public GeozoneWithActivitiesModel departureZone(Boolean departureZone) {
    this.departureZone = departureZone;
    return this;
  }

   /**
   * Get departureZone
   * @return departureZone
  **/
  @ApiModelProperty(value = "")
  public Boolean isDepartureZone() {
    return departureZone;
  }

  public void setDepartureZone(Boolean departureZone) {
    this.departureZone = departureZone;
  }

  public GeozoneWithActivitiesModel description(String description) {
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

  public GeozoneWithActivitiesModel geozoneId(String geozoneId) {
    this.geozoneId = geozoneId;
    return this;
  }

   /**
   * Get geozoneId
   * @return geozoneId
  **/
  @ApiModelProperty(value = "")
  public String getGeozoneId() {
    return geozoneId;
  }

  public void setGeozoneId(String geozoneId) {
    this.geozoneId = geozoneId;
  }

  public GeozoneWithActivitiesModel hideOnMaps(Boolean hideOnMaps) {
    this.hideOnMaps = hideOnMaps;
    return this;
  }

   /**
   * Get hideOnMaps
   * @return hideOnMaps
  **/
  @ApiModelProperty(value = "")
  public Boolean isHideOnMaps() {
    return hideOnMaps;
  }

  public void setHideOnMaps(Boolean hideOnMaps) {
    this.hideOnMaps = hideOnMaps;
  }

  public GeozoneWithActivitiesModel pushPin(String pushPin) {
    this.pushPin = pushPin;
    return this;
  }

   /**
   * Get pushPin
   * @return pushPin
  **/
  @ApiModelProperty(value = "")
  public String getPushPin() {
    return pushPin;
  }

  public void setPushPin(String pushPin) {
    this.pushPin = pushPin;
  }

  public GeozoneWithActivitiesModel radius(Integer radius) {
    this.radius = radius;
    return this;
  }

   /**
   * Get radius
   * @return radius
  **/
  @ApiModelProperty(value = "")
  public Integer getRadius() {
    return radius;
  }

  public void setRadius(Integer radius) {
    this.radius = radius;
  }

  public GeozoneWithActivitiesModel reverseGeoCode(Boolean reverseGeoCode) {
    this.reverseGeoCode = reverseGeoCode;
    return this;
  }

   /**
   * Get reverseGeoCode
   * @return reverseGeoCode
  **/
  @ApiModelProperty(value = "")
  public Boolean isReverseGeoCode() {
    return reverseGeoCode;
  }

  public void setReverseGeoCode(Boolean reverseGeoCode) {
    this.reverseGeoCode = reverseGeoCode;
  }

  public GeozoneWithActivitiesModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeozoneWithActivitiesModel zoneColor(String zoneColor) {
    this.zoneColor = zoneColor;
    return this;
  }

   /**
   * Get zoneColor
   * @return zoneColor
  **/
  @ApiModelProperty(value = "")
  public String getZoneColor() {
    return zoneColor;
  }

  public void setZoneColor(String zoneColor) {
    this.zoneColor = zoneColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeozoneWithActivitiesModel geozoneWithActivitiesModel = (GeozoneWithActivitiesModel) o;
    return Objects.equals(this.activities, geozoneWithActivitiesModel.activities) &&
        Objects.equals(this.arrivalZone, geozoneWithActivitiesModel.arrivalZone) &&
        Objects.equals(this.autoNotify, geozoneWithActivitiesModel.autoNotify) &&
        Objects.equals(this.coordinates, geozoneWithActivitiesModel.coordinates) &&
        Objects.equals(this.departureZone, geozoneWithActivitiesModel.departureZone) &&
        Objects.equals(this.description, geozoneWithActivitiesModel.description) &&
        Objects.equals(this.geozoneId, geozoneWithActivitiesModel.geozoneId) &&
        Objects.equals(this.hideOnMaps, geozoneWithActivitiesModel.hideOnMaps) &&
        Objects.equals(this.pushPin, geozoneWithActivitiesModel.pushPin) &&
        Objects.equals(this.radius, geozoneWithActivitiesModel.radius) &&
        Objects.equals(this.reverseGeoCode, geozoneWithActivitiesModel.reverseGeoCode) &&
        Objects.equals(this.type, geozoneWithActivitiesModel.type) &&
        Objects.equals(this.zoneColor, geozoneWithActivitiesModel.zoneColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activities, arrivalZone, autoNotify, coordinates, departureZone, description, geozoneId, hideOnMaps, pushPin, radius, reverseGeoCode, type, zoneColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeozoneWithActivitiesModel {\n");
    
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    arrivalZone: ").append(toIndentedString(arrivalZone)).append("\n");
    sb.append("    autoNotify: ").append(toIndentedString(autoNotify)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    departureZone: ").append(toIndentedString(departureZone)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    geozoneId: ").append(toIndentedString(geozoneId)).append("\n");
    sb.append("    hideOnMaps: ").append(toIndentedString(hideOnMaps)).append("\n");
    sb.append("    pushPin: ").append(toIndentedString(pushPin)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    reverseGeoCode: ").append(toIndentedString(reverseGeoCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    zoneColor: ").append(toIndentedString(zoneColor)).append("\n");
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
