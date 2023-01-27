/*
 * VocaDbWeb
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package mikufan.cx.vocadbapiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ArtistSortRule
 */
public enum ArtistSortRule {
  
  NONE("None"),
  
  NAME("Name"),
  
  ADDITIONDATE("AdditionDate"),
  
  ADDITIONDATEASC("AdditionDateAsc"),
  
  RELEASEDATE("ReleaseDate"),
  
  SONGCOUNT("SongCount"),
  
  SONGRATING("SongRating"),
  
  FOLLOWERCOUNT("FollowerCount"),
  
  ARTISTTYPE("ArtistType");

  private String value;

  ArtistSortRule(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ArtistSortRule fromValue(String value) {
    for (ArtistSortRule b : ArtistSortRule.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

