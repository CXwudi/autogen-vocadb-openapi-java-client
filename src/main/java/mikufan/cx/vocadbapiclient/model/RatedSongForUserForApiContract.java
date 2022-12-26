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
import java.time.LocalDateTime;
import mikufan.cx.vocadbapiclient.model.SongForApiContract;
import mikufan.cx.vocadbapiclient.model.SongVoteRating;
import mikufan.cx.vocadbapiclient.model.UserForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RatedSongForUserForApiContract
 */
@JsonPropertyOrder({
  RatedSongForUserForApiContract.JSON_PROPERTY_DATE,
  RatedSongForUserForApiContract.JSON_PROPERTY_SONG,
  RatedSongForUserForApiContract.JSON_PROPERTY_USER,
  RatedSongForUserForApiContract.JSON_PROPERTY_RATING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-26T19:00:44.138376Z[Etc/UTC]")
public class RatedSongForUserForApiContract {
  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDateTime date;

  public static final String JSON_PROPERTY_SONG = "song";
  private SongForApiContract song;

  public static final String JSON_PROPERTY_USER = "user";
  private UserForApiContract user;

  public static final String JSON_PROPERTY_RATING = "rating";
  private SongVoteRating rating;

  public RatedSongForUserForApiContract() {
  }

  public RatedSongForUserForApiContract date(LocalDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDateTime date) {
    this.date = date;
  }


  public RatedSongForUserForApiContract song(SongForApiContract song) {
    
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


  public RatedSongForUserForApiContract user(UserForApiContract user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserForApiContract getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(UserForApiContract user) {
    this.user = user;
  }


  public RatedSongForUserForApiContract rating(SongVoteRating rating) {
    
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SongVoteRating getRating() {
    return rating;
  }


  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRating(SongVoteRating rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatedSongForUserForApiContract ratedSongForUserForApiContract = (RatedSongForUserForApiContract) o;
    return Objects.equals(this.date, ratedSongForUserForApiContract.date) &&
        Objects.equals(this.song, ratedSongForUserForApiContract.song) &&
        Objects.equals(this.user, ratedSongForUserForApiContract.user) &&
        Objects.equals(this.rating, ratedSongForUserForApiContract.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, song, user, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatedSongForUserForApiContract {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    song: ").append(toIndentedString(song)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

