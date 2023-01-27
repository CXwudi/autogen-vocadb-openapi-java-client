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
import mikufan.cx.vocadbapiclient.model.EventCategory;
import mikufan.cx.vocadbapiclient.model.ReleaseEventSeriesContract;
import mikufan.cx.vocadbapiclient.model.SongListBaseContract;
import mikufan.cx.vocadbapiclient.model.VenueContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ReleaseEventContract
 */
@JsonPropertyOrder({
  ReleaseEventContract.JSON_PROPERTY_ADDITIONAL_NAMES,
  ReleaseEventContract.JSON_PROPERTY_CATEGORY,
  ReleaseEventContract.JSON_PROPERTY_CUSTOM_NAME,
  ReleaseEventContract.JSON_PROPERTY_DATE,
  ReleaseEventContract.JSON_PROPERTY_DELETED,
  ReleaseEventContract.JSON_PROPERTY_DESCRIPTION,
  ReleaseEventContract.JSON_PROPERTY_END_DATE,
  ReleaseEventContract.JSON_PROPERTY_HAS_VENUE_OR_VENUE_NAME,
  ReleaseEventContract.JSON_PROPERTY_ID,
  ReleaseEventContract.JSON_PROPERTY_INHERITED_CATEGORY,
  ReleaseEventContract.JSON_PROPERTY_NAME,
  ReleaseEventContract.JSON_PROPERTY_PICTURE_MIME,
  ReleaseEventContract.JSON_PROPERTY_SERIES,
  ReleaseEventContract.JSON_PROPERTY_SONG_LIST,
  ReleaseEventContract.JSON_PROPERTY_STATUS,
  ReleaseEventContract.JSON_PROPERTY_URL_SLUG,
  ReleaseEventContract.JSON_PROPERTY_VENUE,
  ReleaseEventContract.JSON_PROPERTY_VENUE_NAME,
  ReleaseEventContract.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-27T01:04:32.642512Z[Etc/UTC]")
public class ReleaseEventContract {
  public static final String JSON_PROPERTY_ADDITIONAL_NAMES = "additionalNames";
  private String additionalNames;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private EventCategory category;

  public static final String JSON_PROPERTY_CUSTOM_NAME = "customName";
  private Boolean customName;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDateTime date;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private LocalDateTime endDate;

  public static final String JSON_PROPERTY_HAS_VENUE_OR_VENUE_NAME = "hasVenueOrVenueName";
  private Boolean hasVenueOrVenueName;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_INHERITED_CATEGORY = "inheritedCategory";
  private EventCategory inheritedCategory;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PICTURE_MIME = "pictureMime";
  private String pictureMime;

  public static final String JSON_PROPERTY_SERIES = "series";
  private ReleaseEventSeriesContract series;

  public static final String JSON_PROPERTY_SONG_LIST = "songList";
  private SongListBaseContract songList;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EntryStatus status;

  public static final String JSON_PROPERTY_URL_SLUG = "urlSlug";
  private String urlSlug;

  public static final String JSON_PROPERTY_VENUE = "venue";
  private VenueContract venue;

  public static final String JSON_PROPERTY_VENUE_NAME = "venueName";
  private String venueName;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public ReleaseEventContract() {
  }

  @JsonCreator
  public ReleaseEventContract(
    @JsonProperty(JSON_PROPERTY_HAS_VENUE_OR_VENUE_NAME) Boolean hasVenueOrVenueName
  ) {
    this();
    this.hasVenueOrVenueName = hasVenueOrVenueName;
  }

  public ReleaseEventContract additionalNames(String additionalNames) {
    
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


  public ReleaseEventContract category(EventCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventCategory getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(EventCategory category) {
    this.category = category;
  }


  public ReleaseEventContract customName(Boolean customName) {
    
    this.customName = customName;
    return this;
  }

   /**
   * Get customName
   * @return customName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCustomName() {
    return customName;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomName(Boolean customName) {
    this.customName = customName;
  }


  public ReleaseEventContract date(LocalDateTime date) {
    
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


  public ReleaseEventContract deleted(Boolean deleted) {
    
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


  public ReleaseEventContract description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ReleaseEventContract endDate(LocalDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }


   /**
   * Get hasVenueOrVenueName
   * @return hasVenueOrVenueName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_VENUE_OR_VENUE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasVenueOrVenueName() {
    return hasVenueOrVenueName;
  }




  public ReleaseEventContract id(Integer id) {
    
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


  public ReleaseEventContract inheritedCategory(EventCategory inheritedCategory) {
    
    this.inheritedCategory = inheritedCategory;
    return this;
  }

   /**
   * Get inheritedCategory
   * @return inheritedCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INHERITED_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventCategory getInheritedCategory() {
    return inheritedCategory;
  }


  @JsonProperty(JSON_PROPERTY_INHERITED_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInheritedCategory(EventCategory inheritedCategory) {
    this.inheritedCategory = inheritedCategory;
  }


  public ReleaseEventContract name(String name) {
    
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


  public ReleaseEventContract pictureMime(String pictureMime) {
    
    this.pictureMime = pictureMime;
    return this;
  }

   /**
   * Get pictureMime
   * @return pictureMime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICTURE_MIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPictureMime() {
    return pictureMime;
  }


  @JsonProperty(JSON_PROPERTY_PICTURE_MIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPictureMime(String pictureMime) {
    this.pictureMime = pictureMime;
  }


  public ReleaseEventContract series(ReleaseEventSeriesContract series) {
    
    this.series = series;
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReleaseEventSeriesContract getSeries() {
    return series;
  }


  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeries(ReleaseEventSeriesContract series) {
    this.series = series;
  }


  public ReleaseEventContract songList(SongListBaseContract songList) {
    
    this.songList = songList;
    return this;
  }

   /**
   * Get songList
   * @return songList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SONG_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SongListBaseContract getSongList() {
    return songList;
  }


  @JsonProperty(JSON_PROPERTY_SONG_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSongList(SongListBaseContract songList) {
    this.songList = songList;
  }


  public ReleaseEventContract status(EntryStatus status) {
    
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


  public ReleaseEventContract urlSlug(String urlSlug) {
    
    this.urlSlug = urlSlug;
    return this;
  }

   /**
   * Get urlSlug
   * @return urlSlug
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlSlug() {
    return urlSlug;
  }


  @JsonProperty(JSON_PROPERTY_URL_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlSlug(String urlSlug) {
    this.urlSlug = urlSlug;
  }


  public ReleaseEventContract venue(VenueContract venue) {
    
    this.venue = venue;
    return this;
  }

   /**
   * Get venue
   * @return venue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VenueContract getVenue() {
    return venue;
  }


  @JsonProperty(JSON_PROPERTY_VENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVenue(VenueContract venue) {
    this.venue = venue;
  }


  public ReleaseEventContract venueName(String venueName) {
    
    this.venueName = venueName;
    return this;
  }

   /**
   * Get venueName
   * @return venueName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VENUE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVenueName() {
    return venueName;
  }


  @JsonProperty(JSON_PROPERTY_VENUE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVenueName(String venueName) {
    this.venueName = venueName;
  }


  public ReleaseEventContract version(Integer version) {
    
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
    ReleaseEventContract releaseEventContract = (ReleaseEventContract) o;
    return Objects.equals(this.additionalNames, releaseEventContract.additionalNames) &&
        Objects.equals(this.category, releaseEventContract.category) &&
        Objects.equals(this.customName, releaseEventContract.customName) &&
        Objects.equals(this.date, releaseEventContract.date) &&
        Objects.equals(this.deleted, releaseEventContract.deleted) &&
        Objects.equals(this.description, releaseEventContract.description) &&
        Objects.equals(this.endDate, releaseEventContract.endDate) &&
        Objects.equals(this.hasVenueOrVenueName, releaseEventContract.hasVenueOrVenueName) &&
        Objects.equals(this.id, releaseEventContract.id) &&
        Objects.equals(this.inheritedCategory, releaseEventContract.inheritedCategory) &&
        Objects.equals(this.name, releaseEventContract.name) &&
        Objects.equals(this.pictureMime, releaseEventContract.pictureMime) &&
        Objects.equals(this.series, releaseEventContract.series) &&
        Objects.equals(this.songList, releaseEventContract.songList) &&
        Objects.equals(this.status, releaseEventContract.status) &&
        Objects.equals(this.urlSlug, releaseEventContract.urlSlug) &&
        Objects.equals(this.venue, releaseEventContract.venue) &&
        Objects.equals(this.venueName, releaseEventContract.venueName) &&
        Objects.equals(this.version, releaseEventContract.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalNames, category, customName, date, deleted, description, endDate, hasVenueOrVenueName, id, inheritedCategory, name, pictureMime, series, songList, status, urlSlug, venue, venueName, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseEventContract {\n");
    sb.append("    additionalNames: ").append(toIndentedString(additionalNames)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    hasVenueOrVenueName: ").append(toIndentedString(hasVenueOrVenueName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inheritedCategory: ").append(toIndentedString(inheritedCategory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pictureMime: ").append(toIndentedString(pictureMime)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    songList: ").append(toIndentedString(songList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    urlSlug: ").append(toIndentedString(urlSlug)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("    venueName: ").append(toIndentedString(venueName)).append("\n");
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

