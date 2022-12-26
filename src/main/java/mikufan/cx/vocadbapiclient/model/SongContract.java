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
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import mikufan.cx.vocadbapiclient.model.PVServices;
import mikufan.cx.vocadbapiclient.model.SongType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SongContract
 */
@JsonPropertyOrder({
  SongContract.JSON_PROPERTY_ADDITIONAL_NAMES,
  SongContract.JSON_PROPERTY_ARTIST_STRING,
  SongContract.JSON_PROPERTY_CREATE_DATE,
  SongContract.JSON_PROPERTY_DELETED,
  SongContract.JSON_PROPERTY_FAVORITED_TIMES,
  SongContract.JSON_PROPERTY_ID,
  SongContract.JSON_PROPERTY_LENGTH_SECONDS,
  SongContract.JSON_PROPERTY_NAME,
  SongContract.JSON_PROPERTY_NICO_ID,
  SongContract.JSON_PROPERTY_PUBLISH_DATE,
  SongContract.JSON_PROPERTY_PV_SERVICES,
  SongContract.JSON_PROPERTY_RATING_SCORE,
  SongContract.JSON_PROPERTY_SONG_TYPE,
  SongContract.JSON_PROPERTY_STATUS,
  SongContract.JSON_PROPERTY_THUMB_URL,
  SongContract.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-26T19:00:44.138376Z[Etc/UTC]")
public class SongContract {
  public static final String JSON_PROPERTY_ADDITIONAL_NAMES = "additionalNames";
  private String additionalNames;

  public static final String JSON_PROPERTY_ARTIST_STRING = "artistString";
  private String artistString;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  private LocalDateTime createDate;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_FAVORITED_TIMES = "favoritedTimes";
  private Integer favoritedTimes;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_LENGTH_SECONDS = "lengthSeconds";
  private Integer lengthSeconds;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NICO_ID = "nicoId";
  private String nicoId;

  public static final String JSON_PROPERTY_PUBLISH_DATE = "publishDate";
  private LocalDateTime publishDate;

  public static final String JSON_PROPERTY_PV_SERVICES = "pvServices";
  private PVServices pvServices;

  public static final String JSON_PROPERTY_RATING_SCORE = "ratingScore";
  private Integer ratingScore;

  public static final String JSON_PROPERTY_SONG_TYPE = "songType";
  private SongType songType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EntryStatus status;

  public static final String JSON_PROPERTY_THUMB_URL = "thumbUrl";
  private String thumbUrl;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SongContract() {
  }

  public SongContract additionalNames(String additionalNames) {
    
    this.additionalNames = additionalNames;
    return this;
  }

   /**
   * Get additionalNames
   * @return additionalNames
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalNames() {
    return additionalNames;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalNames(String additionalNames) {
    this.additionalNames = additionalNames;
  }


  public SongContract artistString(String artistString) {
    
    this.artistString = artistString;
    return this;
  }

   /**
   * Get artistString
   * @return artistString
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARTIST_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArtistString() {
    return artistString;
  }


  @JsonProperty(JSON_PROPERTY_ARTIST_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtistString(String artistString) {
    this.artistString = artistString;
  }


  public SongContract createDate(LocalDateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getCreateDate() {
    return createDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateDate(LocalDateTime createDate) {
    this.createDate = createDate;
  }


  public SongContract deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public SongContract favoritedTimes(Integer favoritedTimes) {
    
    this.favoritedTimes = favoritedTimes;
    return this;
  }

   /**
   * Get favoritedTimes
   * @return favoritedTimes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAVORITED_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFavoritedTimes() {
    return favoritedTimes;
  }


  @JsonProperty(JSON_PROPERTY_FAVORITED_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFavoritedTimes(Integer favoritedTimes) {
    this.favoritedTimes = favoritedTimes;
  }


  public SongContract id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public SongContract lengthSeconds(Integer lengthSeconds) {
    
    this.lengthSeconds = lengthSeconds;
    return this;
  }

   /**
   * Get lengthSeconds
   * @return lengthSeconds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLengthSeconds() {
    return lengthSeconds;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLengthSeconds(Integer lengthSeconds) {
    this.lengthSeconds = lengthSeconds;
  }


  public SongContract name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
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


  public SongContract nicoId(String nicoId) {
    
    this.nicoId = nicoId;
    return this;
  }

   /**
   * Get nicoId
   * @return nicoId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NICO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNicoId() {
    return nicoId;
  }


  @JsonProperty(JSON_PROPERTY_NICO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNicoId(String nicoId) {
    this.nicoId = nicoId;
  }


  public SongContract publishDate(LocalDateTime publishDate) {
    
    this.publishDate = publishDate;
    return this;
  }

   /**
   * Get publishDate
   * @return publishDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLISH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getPublishDate() {
    return publishDate;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublishDate(LocalDateTime publishDate) {
    this.publishDate = publishDate;
  }


  public SongContract pvServices(PVServices pvServices) {
    
    this.pvServices = pvServices;
    return this;
  }

   /**
   * Get pvServices
   * @return pvServices
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PV_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PVServices getPvServices() {
    return pvServices;
  }


  @JsonProperty(JSON_PROPERTY_PV_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPvServices(PVServices pvServices) {
    this.pvServices = pvServices;
  }


  public SongContract ratingScore(Integer ratingScore) {
    
    this.ratingScore = ratingScore;
    return this;
  }

   /**
   * Get ratingScore
   * @return ratingScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATING_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRatingScore() {
    return ratingScore;
  }


  @JsonProperty(JSON_PROPERTY_RATING_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatingScore(Integer ratingScore) {
    this.ratingScore = ratingScore;
  }


  public SongContract songType(SongType songType) {
    
    this.songType = songType;
    return this;
  }

   /**
   * Get songType
   * @return songType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SONG_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SongType getSongType() {
    return songType;
  }


  @JsonProperty(JSON_PROPERTY_SONG_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSongType(SongType songType) {
    this.songType = songType;
  }


  public SongContract status(EntryStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntryStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(EntryStatus status) {
    this.status = status;
  }


  public SongContract thumbUrl(String thumbUrl) {
    
    this.thumbUrl = thumbUrl;
    return this;
  }

   /**
   * Get thumbUrl
   * @return thumbUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THUMB_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThumbUrl() {
    return thumbUrl;
  }


  @JsonProperty(JSON_PROPERTY_THUMB_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
  }


  public SongContract version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SongContract songContract = (SongContract) o;
    return Objects.equals(this.additionalNames, songContract.additionalNames) &&
        Objects.equals(this.artistString, songContract.artistString) &&
        Objects.equals(this.createDate, songContract.createDate) &&
        Objects.equals(this.deleted, songContract.deleted) &&
        Objects.equals(this.favoritedTimes, songContract.favoritedTimes) &&
        Objects.equals(this.id, songContract.id) &&
        Objects.equals(this.lengthSeconds, songContract.lengthSeconds) &&
        Objects.equals(this.name, songContract.name) &&
        Objects.equals(this.nicoId, songContract.nicoId) &&
        Objects.equals(this.publishDate, songContract.publishDate) &&
        Objects.equals(this.pvServices, songContract.pvServices) &&
        Objects.equals(this.ratingScore, songContract.ratingScore) &&
        Objects.equals(this.songType, songContract.songType) &&
        Objects.equals(this.status, songContract.status) &&
        Objects.equals(this.thumbUrl, songContract.thumbUrl) &&
        Objects.equals(this.version, songContract.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalNames, artistString, createDate, deleted, favoritedTimes, id, lengthSeconds, name, nicoId, publishDate, pvServices, ratingScore, songType, status, thumbUrl, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SongContract {\n");
    sb.append("    additionalNames: ").append(toIndentedString(additionalNames)).append("\n");
    sb.append("    artistString: ").append(toIndentedString(artistString)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    favoritedTimes: ").append(toIndentedString(favoritedTimes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lengthSeconds: ").append(toIndentedString(lengthSeconds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nicoId: ").append(toIndentedString(nicoId)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    pvServices: ").append(toIndentedString(pvServices)).append("\n");
    sb.append("    ratingScore: ").append(toIndentedString(ratingScore)).append("\n");
    sb.append("    songType: ").append(toIndentedString(songType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thumbUrl: ").append(toIndentedString(thumbUrl)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

