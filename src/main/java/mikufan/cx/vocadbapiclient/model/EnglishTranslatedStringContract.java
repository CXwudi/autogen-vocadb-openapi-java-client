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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EnglishTranslatedStringContract
 */
@JsonPropertyOrder({
  EnglishTranslatedStringContract.JSON_PROPERTY_ENGLISH,
  EnglishTranslatedStringContract.JSON_PROPERTY_ORIGINAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T07:29:58.607748373Z[Etc/UTC]")
public class EnglishTranslatedStringContract {
  public static final String JSON_PROPERTY_ENGLISH = "english";
  private String english;

  public static final String JSON_PROPERTY_ORIGINAL = "original";
  private String original;

  public EnglishTranslatedStringContract() {
  }

  public EnglishTranslatedStringContract english(String english) {
    
    this.english = english;
    return this;
  }

   /**
   * Get english
   * @return english
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENGLISH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnglish() {
    return english;
  }


  @JsonProperty(JSON_PROPERTY_ENGLISH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnglish(String english) {
    this.english = english;
  }


  public EnglishTranslatedStringContract original(String original) {
    
    this.original = original;
    return this;
  }

   /**
   * Get original
   * @return original
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginal() {
    return original;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginal(String original) {
    this.original = original;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnglishTranslatedStringContract englishTranslatedStringContract = (EnglishTranslatedStringContract) o;
    return Objects.equals(this.english, englishTranslatedStringContract.english) &&
        Objects.equals(this.original, englishTranslatedStringContract.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(english, original);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnglishTranslatedStringContract {\n");
    sb.append("    english: ").append(toIndentedString(english)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
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

