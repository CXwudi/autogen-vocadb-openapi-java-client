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
import java.util.ArrayList;
import java.util.List;
import mikufan.cx.vocadbapiclient.model.ArchivedWebLinkContract;
import mikufan.cx.vocadbapiclient.model.ArtistType;
import mikufan.cx.vocadbapiclient.model.ContentLanguageSelection;
import mikufan.cx.vocadbapiclient.model.DiscType;
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import mikufan.cx.vocadbapiclient.model.EntryThumbForApiContract;
import mikufan.cx.vocadbapiclient.model.EntryType;
import mikufan.cx.vocadbapiclient.model.EventCategory;
import mikufan.cx.vocadbapiclient.model.LocalizedStringContract;
import mikufan.cx.vocadbapiclient.model.PVContract;
import mikufan.cx.vocadbapiclient.model.SongListFeaturedCategory;
import mikufan.cx.vocadbapiclient.model.SongType;
import mikufan.cx.vocadbapiclient.model.TagUsageForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EntryForApiContract
 */
@JsonPropertyOrder({
  EntryForApiContract.JSON_PROPERTY_ACTIVITY_DATE,
  EntryForApiContract.JSON_PROPERTY_ADDITIONAL_NAMES,
  EntryForApiContract.JSON_PROPERTY_ARTIST_STRING,
  EntryForApiContract.JSON_PROPERTY_ARTIST_TYPE,
  EntryForApiContract.JSON_PROPERTY_CREATE_DATE,
  EntryForApiContract.JSON_PROPERTY_DEFAULT_NAME,
  EntryForApiContract.JSON_PROPERTY_DEFAULT_NAME_LANGUAGE,
  EntryForApiContract.JSON_PROPERTY_DESCRIPTION,
  EntryForApiContract.JSON_PROPERTY_DISC_TYPE,
  EntryForApiContract.JSON_PROPERTY_ENTRY_TYPE,
  EntryForApiContract.JSON_PROPERTY_EVENT_CATEGORY,
  EntryForApiContract.JSON_PROPERTY_ID,
  EntryForApiContract.JSON_PROPERTY_MAIN_PICTURE,
  EntryForApiContract.JSON_PROPERTY_NAME,
  EntryForApiContract.JSON_PROPERTY_NAMES,
  EntryForApiContract.JSON_PROPERTY_PVS,
  EntryForApiContract.JSON_PROPERTY_SONG_LIST_FEATURED_CATEGORY,
  EntryForApiContract.JSON_PROPERTY_SONG_TYPE,
  EntryForApiContract.JSON_PROPERTY_STATUS,
  EntryForApiContract.JSON_PROPERTY_RELEASE_EVENT_SERIES_NAME,
  EntryForApiContract.JSON_PROPERTY_TAG_CATEGORY_NAME,
  EntryForApiContract.JSON_PROPERTY_TAGS,
  EntryForApiContract.JSON_PROPERTY_URL_SLUG,
  EntryForApiContract.JSON_PROPERTY_VERSION,
  EntryForApiContract.JSON_PROPERTY_WEB_LINKS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-26T19:00:44.138376Z[Etc/UTC]")
public class EntryForApiContract {
  public static final String JSON_PROPERTY_ACTIVITY_DATE = "activityDate";
  private LocalDateTime activityDate;

  public static final String JSON_PROPERTY_ADDITIONAL_NAMES = "additionalNames";
  private String additionalNames;

  public static final String JSON_PROPERTY_ARTIST_STRING = "artistString";
  private String artistString;

  public static final String JSON_PROPERTY_ARTIST_TYPE = "artistType";
  private ArtistType artistType;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  private LocalDateTime createDate;

  public static final String JSON_PROPERTY_DEFAULT_NAME = "defaultName";
  private String defaultName;

  public static final String JSON_PROPERTY_DEFAULT_NAME_LANGUAGE = "defaultNameLanguage";
  private ContentLanguageSelection defaultNameLanguage;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISC_TYPE = "discType";
  private DiscType discType;

  public static final String JSON_PROPERTY_ENTRY_TYPE = "entryType";
  private EntryType entryType;

  public static final String JSON_PROPERTY_EVENT_CATEGORY = "eventCategory";
  private EventCategory eventCategory;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_MAIN_PICTURE = "mainPicture";
  private EntryThumbForApiContract mainPicture;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAMES = "names";
  private List<LocalizedStringContract> names = null;

  public static final String JSON_PROPERTY_PVS = "pvs";
  private List<PVContract> pvs = null;

  public static final String JSON_PROPERTY_SONG_LIST_FEATURED_CATEGORY = "songListFeaturedCategory";
  private SongListFeaturedCategory songListFeaturedCategory;

  public static final String JSON_PROPERTY_SONG_TYPE = "songType";
  private SongType songType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EntryStatus status;

  public static final String JSON_PROPERTY_RELEASE_EVENT_SERIES_NAME = "releaseEventSeriesName";
  private String releaseEventSeriesName;

  public static final String JSON_PROPERTY_TAG_CATEGORY_NAME = "tagCategoryName";
  private String tagCategoryName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<TagUsageForApiContract> tags = null;

  public static final String JSON_PROPERTY_URL_SLUG = "urlSlug";
  private String urlSlug;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_WEB_LINKS = "webLinks";
  private List<ArchivedWebLinkContract> webLinks = null;

  public EntryForApiContract() {
  }

  public EntryForApiContract activityDate(LocalDateTime activityDate) {
    
    this.activityDate = activityDate;
    return this;
  }

   /**
   * Get activityDate
   * @return activityDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getActivityDate() {
    return activityDate;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivityDate(LocalDateTime activityDate) {
    this.activityDate = activityDate;
  }


  public EntryForApiContract additionalNames(String additionalNames) {
    
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


  public EntryForApiContract artistString(String artistString) {
    
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


  public EntryForApiContract artistType(ArtistType artistType) {
    
    this.artistType = artistType;
    return this;
  }

   /**
   * Get artistType
   * @return artistType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARTIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtistType getArtistType() {
    return artistType;
  }


  @JsonProperty(JSON_PROPERTY_ARTIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtistType(ArtistType artistType) {
    this.artistType = artistType;
  }


  public EntryForApiContract createDate(LocalDateTime createDate) {
    
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


  public EntryForApiContract defaultName(String defaultName) {
    
    this.defaultName = defaultName;
    return this;
  }

   /**
   * Get defaultName
   * @return defaultName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultName() {
    return defaultName;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }


  public EntryForApiContract defaultNameLanguage(ContentLanguageSelection defaultNameLanguage) {
    
    this.defaultNameLanguage = defaultNameLanguage;
    return this;
  }

   /**
   * Get defaultNameLanguage
   * @return defaultNameLanguage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentLanguageSelection getDefaultNameLanguage() {
    return defaultNameLanguage;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultNameLanguage(ContentLanguageSelection defaultNameLanguage) {
    this.defaultNameLanguage = defaultNameLanguage;
  }


  public EntryForApiContract description(String description) {
    
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


  public EntryForApiContract discType(DiscType discType) {
    
    this.discType = discType;
    return this;
  }

   /**
   * Get discType
   * @return discType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DiscType getDiscType() {
    return discType;
  }


  @JsonProperty(JSON_PROPERTY_DISC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscType(DiscType discType) {
    this.discType = discType;
  }


  public EntryForApiContract entryType(EntryType entryType) {
    
    this.entryType = entryType;
    return this;
  }

   /**
   * Get entryType
   * @return entryType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntryType getEntryType() {
    return entryType;
  }


  @JsonProperty(JSON_PROPERTY_ENTRY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntryType(EntryType entryType) {
    this.entryType = entryType;
  }


  public EntryForApiContract eventCategory(EventCategory eventCategory) {
    
    this.eventCategory = eventCategory;
    return this;
  }

   /**
   * Get eventCategory
   * @return eventCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventCategory getEventCategory() {
    return eventCategory;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventCategory(EventCategory eventCategory) {
    this.eventCategory = eventCategory;
  }


  public EntryForApiContract id(Integer id) {
    
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


  public EntryForApiContract mainPicture(EntryThumbForApiContract mainPicture) {
    
    this.mainPicture = mainPicture;
    return this;
  }

   /**
   * Get mainPicture
   * @return mainPicture
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIN_PICTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntryThumbForApiContract getMainPicture() {
    return mainPicture;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_PICTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainPicture(EntryThumbForApiContract mainPicture) {
    this.mainPicture = mainPicture;
  }


  public EntryForApiContract name(String name) {
    
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


  public EntryForApiContract names(List<LocalizedStringContract> names) {
    
    this.names = names;
    return this;
  }

  public EntryForApiContract addNamesItem(LocalizedStringContract namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LocalizedStringContract> getNames() {
    return names;
  }


  @JsonProperty(JSON_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNames(List<LocalizedStringContract> names) {
    this.names = names;
  }


  public EntryForApiContract pvs(List<PVContract> pvs) {
    
    this.pvs = pvs;
    return this;
  }

  public EntryForApiContract addPvsItem(PVContract pvsItem) {
    if (this.pvs == null) {
      this.pvs = new ArrayList<>();
    }
    this.pvs.add(pvsItem);
    return this;
  }

   /**
   * Get pvs
   * @return pvs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PVS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PVContract> getPvs() {
    return pvs;
  }


  @JsonProperty(JSON_PROPERTY_PVS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPvs(List<PVContract> pvs) {
    this.pvs = pvs;
  }


  public EntryForApiContract songListFeaturedCategory(SongListFeaturedCategory songListFeaturedCategory) {
    
    this.songListFeaturedCategory = songListFeaturedCategory;
    return this;
  }

   /**
   * Get songListFeaturedCategory
   * @return songListFeaturedCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SONG_LIST_FEATURED_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SongListFeaturedCategory getSongListFeaturedCategory() {
    return songListFeaturedCategory;
  }


  @JsonProperty(JSON_PROPERTY_SONG_LIST_FEATURED_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSongListFeaturedCategory(SongListFeaturedCategory songListFeaturedCategory) {
    this.songListFeaturedCategory = songListFeaturedCategory;
  }


  public EntryForApiContract songType(SongType songType) {
    
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


  public EntryForApiContract status(EntryStatus status) {
    
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


  public EntryForApiContract releaseEventSeriesName(String releaseEventSeriesName) {
    
    this.releaseEventSeriesName = releaseEventSeriesName;
    return this;
  }

   /**
   * Get releaseEventSeriesName
   * @return releaseEventSeriesName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_EVENT_SERIES_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReleaseEventSeriesName() {
    return releaseEventSeriesName;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_EVENT_SERIES_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseEventSeriesName(String releaseEventSeriesName) {
    this.releaseEventSeriesName = releaseEventSeriesName;
  }


  public EntryForApiContract tagCategoryName(String tagCategoryName) {
    
    this.tagCategoryName = tagCategoryName;
    return this;
  }

   /**
   * Get tagCategoryName
   * @return tagCategoryName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTagCategoryName() {
    return tagCategoryName;
  }


  @JsonProperty(JSON_PROPERTY_TAG_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagCategoryName(String tagCategoryName) {
    this.tagCategoryName = tagCategoryName;
  }


  public EntryForApiContract tags(List<TagUsageForApiContract> tags) {
    
    this.tags = tags;
    return this;
  }

  public EntryForApiContract addTagsItem(TagUsageForApiContract tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TagUsageForApiContract> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<TagUsageForApiContract> tags) {
    this.tags = tags;
  }


  public EntryForApiContract urlSlug(String urlSlug) {
    
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


  public EntryForApiContract version(Integer version) {
    
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


  public EntryForApiContract webLinks(List<ArchivedWebLinkContract> webLinks) {
    
    this.webLinks = webLinks;
    return this;
  }

  public EntryForApiContract addWebLinksItem(ArchivedWebLinkContract webLinksItem) {
    if (this.webLinks == null) {
      this.webLinks = new ArrayList<>();
    }
    this.webLinks.add(webLinksItem);
    return this;
  }

   /**
   * Get webLinks
   * @return webLinks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ArchivedWebLinkContract> getWebLinks() {
    return webLinks;
  }


  @JsonProperty(JSON_PROPERTY_WEB_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebLinks(List<ArchivedWebLinkContract> webLinks) {
    this.webLinks = webLinks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryForApiContract entryForApiContract = (EntryForApiContract) o;
    return Objects.equals(this.activityDate, entryForApiContract.activityDate) &&
        Objects.equals(this.additionalNames, entryForApiContract.additionalNames) &&
        Objects.equals(this.artistString, entryForApiContract.artistString) &&
        Objects.equals(this.artistType, entryForApiContract.artistType) &&
        Objects.equals(this.createDate, entryForApiContract.createDate) &&
        Objects.equals(this.defaultName, entryForApiContract.defaultName) &&
        Objects.equals(this.defaultNameLanguage, entryForApiContract.defaultNameLanguage) &&
        Objects.equals(this.description, entryForApiContract.description) &&
        Objects.equals(this.discType, entryForApiContract.discType) &&
        Objects.equals(this.entryType, entryForApiContract.entryType) &&
        Objects.equals(this.eventCategory, entryForApiContract.eventCategory) &&
        Objects.equals(this.id, entryForApiContract.id) &&
        Objects.equals(this.mainPicture, entryForApiContract.mainPicture) &&
        Objects.equals(this.name, entryForApiContract.name) &&
        Objects.equals(this.names, entryForApiContract.names) &&
        Objects.equals(this.pvs, entryForApiContract.pvs) &&
        Objects.equals(this.songListFeaturedCategory, entryForApiContract.songListFeaturedCategory) &&
        Objects.equals(this.songType, entryForApiContract.songType) &&
        Objects.equals(this.status, entryForApiContract.status) &&
        Objects.equals(this.releaseEventSeriesName, entryForApiContract.releaseEventSeriesName) &&
        Objects.equals(this.tagCategoryName, entryForApiContract.tagCategoryName) &&
        Objects.equals(this.tags, entryForApiContract.tags) &&
        Objects.equals(this.urlSlug, entryForApiContract.urlSlug) &&
        Objects.equals(this.version, entryForApiContract.version) &&
        Objects.equals(this.webLinks, entryForApiContract.webLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDate, additionalNames, artistString, artistType, createDate, defaultName, defaultNameLanguage, description, discType, entryType, eventCategory, id, mainPicture, name, names, pvs, songListFeaturedCategory, songType, status, releaseEventSeriesName, tagCategoryName, tags, urlSlug, version, webLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryForApiContract {\n");
    sb.append("    activityDate: ").append(toIndentedString(activityDate)).append("\n");
    sb.append("    additionalNames: ").append(toIndentedString(additionalNames)).append("\n");
    sb.append("    artistString: ").append(toIndentedString(artistString)).append("\n");
    sb.append("    artistType: ").append(toIndentedString(artistType)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    defaultName: ").append(toIndentedString(defaultName)).append("\n");
    sb.append("    defaultNameLanguage: ").append(toIndentedString(defaultNameLanguage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discType: ").append(toIndentedString(discType)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    eventCategory: ").append(toIndentedString(eventCategory)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mainPicture: ").append(toIndentedString(mainPicture)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pvs: ").append(toIndentedString(pvs)).append("\n");
    sb.append("    songListFeaturedCategory: ").append(toIndentedString(songListFeaturedCategory)).append("\n");
    sb.append("    songType: ").append(toIndentedString(songType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    releaseEventSeriesName: ").append(toIndentedString(releaseEventSeriesName)).append("\n");
    sb.append("    tagCategoryName: ").append(toIndentedString(tagCategoryName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    urlSlug: ").append(toIndentedString(urlSlug)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    webLinks: ").append(toIndentedString(webLinks)).append("\n");
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

