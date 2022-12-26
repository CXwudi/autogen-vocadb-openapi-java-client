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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import mikufan.cx.vocadbapiclient.model.SongForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SongInListForApiContract
 */
@JsonPropertyOrder({
  SongInListForApiContract.JSON_PROPERTY_NOTES,
  SongInListForApiContract.JSON_PROPERTY_ORDER,
  SongInListForApiContract.JSON_PROPERTY_SONG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-26T19:00:44.138376Z[Etc/UTC]")
public class SongInListForApiContract {
  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Integer order;

  public static final String JSON_PROPERTY_SONG = "song";
  private SongForApiContract song;

  public SongInListForApiContract() {
  }

  public SongInListForApiContract notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotes() {
    return notes;
  }


  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotes(String notes) {
    this.notes = notes;
  }


  public SongInListForApiContract order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Integer order) {
    this.order = order;
  }


  public SongInListForApiContract song(SongForApiContract song) {
    
    this.song = song;
    return this;
  }

   /**
   * Get song
   * @return song
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SongForApiContract getSong() {
    return song;
  }


  @JsonProperty(JSON_PROPERTY_SONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSong(SongForApiContract song) {
    this.song = song;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SongInListForApiContract songInListForApiContract = (SongInListForApiContract) o;
    return Objects.equals(this.notes, songInListForApiContract.notes) &&
        Objects.equals(this.order, songInListForApiContract.order) &&
        Objects.equals(this.song, songInListForApiContract.song);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, order, song);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SongInListForApiContract {\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    song: ").append(toIndentedString(song)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

