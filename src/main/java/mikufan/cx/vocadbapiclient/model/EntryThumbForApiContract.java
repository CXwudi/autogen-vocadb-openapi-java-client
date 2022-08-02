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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EntryThumbForApiContract
 */
@JsonPropertyOrder({
  EntryThumbForApiContract.JSON_PROPERTY_MIME,
  EntryThumbForApiContract.JSON_PROPERTY_NAME,
  EntryThumbForApiContract.JSON_PROPERTY_URL_ORIGINAL,
  EntryThumbForApiContract.JSON_PROPERTY_URL_SMALL_THUMB,
  EntryThumbForApiContract.JSON_PROPERTY_URL_THUMB,
  EntryThumbForApiContract.JSON_PROPERTY_URL_TINY_THUMB
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-02T20:16:06.008977Z[Etc/UTC]")
public class EntryThumbForApiContract {
  public static final String JSON_PROPERTY_MIME = "mime";
  private String mime;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_URL_ORIGINAL = "urlOriginal";
  private String urlOriginal;

  public static final String JSON_PROPERTY_URL_SMALL_THUMB = "urlSmallThumb";
  private String urlSmallThumb;

  public static final String JSON_PROPERTY_URL_THUMB = "urlThumb";
  private String urlThumb;

  public static final String JSON_PROPERTY_URL_TINY_THUMB = "urlTinyThumb";
  private String urlTinyThumb;

  public EntryThumbForApiContract() {
  }

  public EntryThumbForApiContract mime(String mime) {
    
    this.mime = mime;
    return this;
  }

   /**
   * Get mime
   * @return mime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMime() {
    return mime;
  }


  @JsonProperty(JSON_PROPERTY_MIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMime(String mime) {
    this.mime = mime;
  }


  public EntryThumbForApiContract name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public EntryThumbForApiContract urlOriginal(String urlOriginal) {
    
    this.urlOriginal = urlOriginal;
    return this;
  }

   /**
   * Get urlOriginal
   * @return urlOriginal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlOriginal() {
    return urlOriginal;
  }


  @JsonProperty(JSON_PROPERTY_URL_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlOriginal(String urlOriginal) {
    this.urlOriginal = urlOriginal;
  }


  public EntryThumbForApiContract urlSmallThumb(String urlSmallThumb) {
    
    this.urlSmallThumb = urlSmallThumb;
    return this;
  }

   /**
   * Get urlSmallThumb
   * @return urlSmallThumb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_SMALL_THUMB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlSmallThumb() {
    return urlSmallThumb;
  }


  @JsonProperty(JSON_PROPERTY_URL_SMALL_THUMB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlSmallThumb(String urlSmallThumb) {
    this.urlSmallThumb = urlSmallThumb;
  }


  public EntryThumbForApiContract urlThumb(String urlThumb) {
    
    this.urlThumb = urlThumb;
    return this;
  }

   /**
   * Get urlThumb
   * @return urlThumb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_THUMB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlThumb() {
    return urlThumb;
  }


  @JsonProperty(JSON_PROPERTY_URL_THUMB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlThumb(String urlThumb) {
    this.urlThumb = urlThumb;
  }


  public EntryThumbForApiContract urlTinyThumb(String urlTinyThumb) {
    
    this.urlTinyThumb = urlTinyThumb;
    return this;
  }

   /**
   * Get urlTinyThumb
   * @return urlTinyThumb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_TINY_THUMB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlTinyThumb() {
    return urlTinyThumb;
  }


  @JsonProperty(JSON_PROPERTY_URL_TINY_THUMB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlTinyThumb(String urlTinyThumb) {
    this.urlTinyThumb = urlTinyThumb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryThumbForApiContract entryThumbForApiContract = (EntryThumbForApiContract) o;
    return Objects.equals(this.mime, entryThumbForApiContract.mime) &&
        Objects.equals(this.name, entryThumbForApiContract.name) &&
        Objects.equals(this.urlOriginal, entryThumbForApiContract.urlOriginal) &&
        Objects.equals(this.urlSmallThumb, entryThumbForApiContract.urlSmallThumb) &&
        Objects.equals(this.urlThumb, entryThumbForApiContract.urlThumb) &&
        Objects.equals(this.urlTinyThumb, entryThumbForApiContract.urlTinyThumb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mime, name, urlOriginal, urlSmallThumb, urlThumb, urlTinyThumb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryThumbForApiContract {\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urlOriginal: ").append(toIndentedString(urlOriginal)).append("\n");
    sb.append("    urlSmallThumb: ").append(toIndentedString(urlSmallThumb)).append("\n");
    sb.append("    urlThumb: ").append(toIndentedString(urlThumb)).append("\n");
    sb.append("    urlTinyThumb: ").append(toIndentedString(urlTinyThumb)).append("\n");
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

