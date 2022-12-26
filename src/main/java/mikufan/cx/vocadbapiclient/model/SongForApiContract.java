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
import mikufan.cx.vocadbapiclient.model.AlbumContract;
import mikufan.cx.vocadbapiclient.model.ArtistForSongContract;
import mikufan.cx.vocadbapiclient.model.ContentLanguageSelection;
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import mikufan.cx.vocadbapiclient.model.EntryThumbForApiContract;
import mikufan.cx.vocadbapiclient.model.LocalizedStringContract;
import mikufan.cx.vocadbapiclient.model.LyricsForSongContract;
import mikufan.cx.vocadbapiclient.model.PVContract;
import mikufan.cx.vocadbapiclient.model.PVServices;
import mikufan.cx.vocadbapiclient.model.ReleaseEventForApiContract;
import mikufan.cx.vocadbapiclient.model.SongType;
import mikufan.cx.vocadbapiclient.model.TagUsageForApiContract;
import mikufan.cx.vocadbapiclient.model.WebLinkForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SongForApiContract
 */
@JsonPropertyOrder({
  SongForApiContract.JSON_PROPERTY_ADDITIONAL_NAMES,
  SongForApiContract.JSON_PROPERTY_ALBUMS,
  SongForApiContract.JSON_PROPERTY_ARTISTS,
  SongForApiContract.JSON_PROPERTY_ARTIST_STRING,
  SongForApiContract.JSON_PROPERTY_CREATE_DATE,
  SongForApiContract.JSON_PROPERTY_DEFAULT_NAME,
  SongForApiContract.JSON_PROPERTY_DEFAULT_NAME_LANGUAGE,
  SongForApiContract.JSON_PROPERTY_DELETED,
  SongForApiContract.JSON_PROPERTY_FAVORITED_TIMES,
  SongForApiContract.JSON_PROPERTY_ID,
  SongForApiContract.JSON_PROPERTY_LENGTH_SECONDS,
  SongForApiContract.JSON_PROPERTY_LYRICS,
  SongForApiContract.JSON_PROPERTY_MAIN_PICTURE,
  SongForApiContract.JSON_PROPERTY_MERGED_TO,
  SongForApiContract.JSON_PROPERTY_NAME,
  SongForApiContract.JSON_PROPERTY_NAMES,
  SongForApiContract.JSON_PROPERTY_ORIGINAL_VERSION_ID,
  SongForApiContract.JSON_PROPERTY_PUBLISH_DATE,
  SongForApiContract.JSON_PROPERTY_PVS,
  SongForApiContract.JSON_PROPERTY_PV_SERVICES,
  SongForApiContract.JSON_PROPERTY_RATING_SCORE,
  SongForApiContract.JSON_PROPERTY_RELEASE_EVENT,
  SongForApiContract.JSON_PROPERTY_SONG_TYPE,
  SongForApiContract.JSON_PROPERTY_STATUS,
  SongForApiContract.JSON_PROPERTY_TAGS,
  SongForApiContract.JSON_PROPERTY_THUMB_URL,
  SongForApiContract.JSON_PROPERTY_VERSION,
  SongForApiContract.JSON_PROPERTY_WEB_LINKS,
  SongForApiContract.JSON_PROPERTY_MIN_MILLI_BPM,
  SongForApiContract.JSON_PROPERTY_MAX_MILLI_BPM
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-26T19:00:44.138376Z[Etc/UTC]")
public class SongForApiContract {
  public static final String JSON_PROPERTY_ADDITIONAL_NAMES = "additionalNames";
  private String additionalNames;

  public static final String JSON_PROPERTY_ALBUMS = "albums";
  private List<AlbumContract> albums = null;

  public static final String JSON_PROPERTY_ARTISTS = "artists";
  private List<ArtistForSongContract> artists = null;

  public static final String JSON_PROPERTY_ARTIST_STRING = "artistString";
  private String artistString;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  private LocalDateTime createDate;

  public static final String JSON_PROPERTY_DEFAULT_NAME = "defaultName";
  private String defaultName;

  public static final String JSON_PROPERTY_DEFAULT_NAME_LANGUAGE = "defaultNameLanguage";
  private ContentLanguageSelection defaultNameLanguage;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_FAVORITED_TIMES = "favoritedTimes";
  private Integer favoritedTimes;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_LENGTH_SECONDS = "lengthSeconds";
  private Integer lengthSeconds;

  public static final String JSON_PROPERTY_LYRICS = "lyrics";
  private List<LyricsForSongContract> lyrics = null;

  public static final String JSON_PROPERTY_MAIN_PICTURE = "mainPicture";
  private EntryThumbForApiContract mainPicture;

  public static final String JSON_PROPERTY_MERGED_TO = "mergedTo";
  private Integer mergedTo;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAMES = "names";
  private List<LocalizedStringContract> names = null;

  public static final String JSON_PROPERTY_ORIGINAL_VERSION_ID = "originalVersionId";
  private Integer originalVersionId;

  public static final String JSON_PROPERTY_PUBLISH_DATE = "publishDate";
  private LocalDateTime publishDate;

  public static final String JSON_PROPERTY_PVS = "pvs";
  private List<PVContract> pvs = null;

  public static final String JSON_PROPERTY_PV_SERVICES = "pvServices";
  private PVServices pvServices;

  public static final String JSON_PROPERTY_RATING_SCORE = "ratingScore";
  private Integer ratingScore;

  public static final String JSON_PROPERTY_RELEASE_EVENT = "releaseEvent";
  private ReleaseEventForApiContract releaseEvent;

  public static final String JSON_PROPERTY_SONG_TYPE = "songType";
  private SongType songType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EntryStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<TagUsageForApiContract> tags = null;

  public static final String JSON_PROPERTY_THUMB_URL = "thumbUrl";
  private String thumbUrl;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_WEB_LINKS = "webLinks";
  private List<WebLinkForApiContract> webLinks = null;

  public static final String JSON_PROPERTY_MIN_MILLI_BPM = "minMilliBpm";
  private Integer minMilliBpm;

  public static final String JSON_PROPERTY_MAX_MILLI_BPM = "maxMilliBpm";
  private Integer maxMilliBpm;

  public SongForApiContract() {
  }

  public SongForApiContract additionalNames(String additionalNames) {
    
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


  public SongForApiContract albums(List<AlbumContract> albums) {
    
    this.albums = albums;
    return this;
  }

  public SongForApiContract addAlbumsItem(AlbumContract albumsItem) {
    if (this.albums == null) {
      this.albums = new ArrayList<>();
    }
    this.albums.add(albumsItem);
    return this;
  }

   /**
   * Get albums
   * @return albums
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALBUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlbumContract> getAlbums() {
    return albums;
  }


  @JsonProperty(JSON_PROPERTY_ALBUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlbums(List<AlbumContract> albums) {
    this.albums = albums;
  }


  public SongForApiContract artists(List<ArtistForSongContract> artists) {
    
    this.artists = artists;
    return this;
  }

  public SongForApiContract addArtistsItem(ArtistForSongContract artistsItem) {
    if (this.artists == null) {
      this.artists = new ArrayList<>();
    }
    this.artists.add(artistsItem);
    return this;
  }

   /**
   * Get artists
   * @return artists
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARTISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ArtistForSongContract> getArtists() {
    return artists;
  }


  @JsonProperty(JSON_PROPERTY_ARTISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtists(List<ArtistForSongContract> artists) {
    this.artists = artists;
  }


  public SongForApiContract artistString(String artistString) {
    
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


  public SongForApiContract createDate(LocalDateTime createDate) {
    
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


  public SongForApiContract defaultName(String defaultName) {
    
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


  public SongForApiContract defaultNameLanguage(ContentLanguageSelection defaultNameLanguage) {
    
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


  public SongForApiContract deleted(Boolean deleted) {
    
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


  public SongForApiContract favoritedTimes(Integer favoritedTimes) {
    
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


  public SongForApiContract id(Integer id) {
    
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


  public SongForApiContract lengthSeconds(Integer lengthSeconds) {
    
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


  public SongForApiContract lyrics(List<LyricsForSongContract> lyrics) {
    
    this.lyrics = lyrics;
    return this;
  }

  public SongForApiContract addLyricsItem(LyricsForSongContract lyricsItem) {
    if (this.lyrics == null) {
      this.lyrics = new ArrayList<>();
    }
    this.lyrics.add(lyricsItem);
    return this;
  }

   /**
   * Get lyrics
   * @return lyrics
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LYRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LyricsForSongContract> getLyrics() {
    return lyrics;
  }


  @JsonProperty(JSON_PROPERTY_LYRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLyrics(List<LyricsForSongContract> lyrics) {
    this.lyrics = lyrics;
  }


  public SongForApiContract mainPicture(EntryThumbForApiContract mainPicture) {
    
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


  public SongForApiContract mergedTo(Integer mergedTo) {
    
    this.mergedTo = mergedTo;
    return this;
  }

   /**
   * Get mergedTo
   * @return mergedTo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERGED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMergedTo() {
    return mergedTo;
  }


  @JsonProperty(JSON_PROPERTY_MERGED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMergedTo(Integer mergedTo) {
    this.mergedTo = mergedTo;
  }


  public SongForApiContract name(String name) {
    
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


  public SongForApiContract names(List<LocalizedStringContract> names) {
    
    this.names = names;
    return this;
  }

  public SongForApiContract addNamesItem(LocalizedStringContract namesItem) {
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


  public SongForApiContract originalVersionId(Integer originalVersionId) {
    
    this.originalVersionId = originalVersionId;
    return this;
  }

   /**
   * Get originalVersionId
   * @return originalVersionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOriginalVersionId() {
    return originalVersionId;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalVersionId(Integer originalVersionId) {
    this.originalVersionId = originalVersionId;
  }


  public SongForApiContract publishDate(LocalDateTime publishDate) {
    
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


  public SongForApiContract pvs(List<PVContract> pvs) {
    
    this.pvs = pvs;
    return this;
  }

  public SongForApiContract addPvsItem(PVContract pvsItem) {
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


  public SongForApiContract pvServices(PVServices pvServices) {
    
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


  public SongForApiContract ratingScore(Integer ratingScore) {
    
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


  public SongForApiContract releaseEvent(ReleaseEventForApiContract releaseEvent) {
    
    this.releaseEvent = releaseEvent;
    return this;
  }

   /**
   * Get releaseEvent
   * @return releaseEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReleaseEventForApiContract getReleaseEvent() {
    return releaseEvent;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseEvent(ReleaseEventForApiContract releaseEvent) {
    this.releaseEvent = releaseEvent;
  }


  public SongForApiContract songType(SongType songType) {
    
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


  public SongForApiContract status(EntryStatus status) {
    
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


  public SongForApiContract tags(List<TagUsageForApiContract> tags) {
    
    this.tags = tags;
    return this;
  }

  public SongForApiContract addTagsItem(TagUsageForApiContract tagsItem) {
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


  public SongForApiContract thumbUrl(String thumbUrl) {
    
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


  public SongForApiContract version(Integer version) {
    
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


  public SongForApiContract webLinks(List<WebLinkForApiContract> webLinks) {
    
    this.webLinks = webLinks;
    return this;
  }

  public SongForApiContract addWebLinksItem(WebLinkForApiContract webLinksItem) {
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

  public List<WebLinkForApiContract> getWebLinks() {
    return webLinks;
  }


  @JsonProperty(JSON_PROPERTY_WEB_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebLinks(List<WebLinkForApiContract> webLinks) {
    this.webLinks = webLinks;
  }


  public SongForApiContract minMilliBpm(Integer minMilliBpm) {
    
    this.minMilliBpm = minMilliBpm;
    return this;
  }

   /**
   * Get minMilliBpm
   * @return minMilliBpm
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_MILLI_BPM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinMilliBpm() {
    return minMilliBpm;
  }


  @JsonProperty(JSON_PROPERTY_MIN_MILLI_BPM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinMilliBpm(Integer minMilliBpm) {
    this.minMilliBpm = minMilliBpm;
  }


  public SongForApiContract maxMilliBpm(Integer maxMilliBpm) {
    
    this.maxMilliBpm = maxMilliBpm;
    return this;
  }

   /**
   * Get maxMilliBpm
   * @return maxMilliBpm
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_MILLI_BPM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxMilliBpm() {
    return maxMilliBpm;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MILLI_BPM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxMilliBpm(Integer maxMilliBpm) {
    this.maxMilliBpm = maxMilliBpm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SongForApiContract songForApiContract = (SongForApiContract) o;
    return Objects.equals(this.additionalNames, songForApiContract.additionalNames) &&
        Objects.equals(this.albums, songForApiContract.albums) &&
        Objects.equals(this.artists, songForApiContract.artists) &&
        Objects.equals(this.artistString, songForApiContract.artistString) &&
        Objects.equals(this.createDate, songForApiContract.createDate) &&
        Objects.equals(this.defaultName, songForApiContract.defaultName) &&
        Objects.equals(this.defaultNameLanguage, songForApiContract.defaultNameLanguage) &&
        Objects.equals(this.deleted, songForApiContract.deleted) &&
        Objects.equals(this.favoritedTimes, songForApiContract.favoritedTimes) &&
        Objects.equals(this.id, songForApiContract.id) &&
        Objects.equals(this.lengthSeconds, songForApiContract.lengthSeconds) &&
        Objects.equals(this.lyrics, songForApiContract.lyrics) &&
        Objects.equals(this.mainPicture, songForApiContract.mainPicture) &&
        Objects.equals(this.mergedTo, songForApiContract.mergedTo) &&
        Objects.equals(this.name, songForApiContract.name) &&
        Objects.equals(this.names, songForApiContract.names) &&
        Objects.equals(this.originalVersionId, songForApiContract.originalVersionId) &&
        Objects.equals(this.publishDate, songForApiContract.publishDate) &&
        Objects.equals(this.pvs, songForApiContract.pvs) &&
        Objects.equals(this.pvServices, songForApiContract.pvServices) &&
        Objects.equals(this.ratingScore, songForApiContract.ratingScore) &&
        Objects.equals(this.releaseEvent, songForApiContract.releaseEvent) &&
        Objects.equals(this.songType, songForApiContract.songType) &&
        Objects.equals(this.status, songForApiContract.status) &&
        Objects.equals(this.tags, songForApiContract.tags) &&
        Objects.equals(this.thumbUrl, songForApiContract.thumbUrl) &&
        Objects.equals(this.version, songForApiContract.version) &&
        Objects.equals(this.webLinks, songForApiContract.webLinks) &&
        Objects.equals(this.minMilliBpm, songForApiContract.minMilliBpm) &&
        Objects.equals(this.maxMilliBpm, songForApiContract.maxMilliBpm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalNames, albums, artists, artistString, createDate, defaultName, defaultNameLanguage, deleted, favoritedTimes, id, lengthSeconds, lyrics, mainPicture, mergedTo, name, names, originalVersionId, publishDate, pvs, pvServices, ratingScore, releaseEvent, songType, status, tags, thumbUrl, version, webLinks, minMilliBpm, maxMilliBpm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SongForApiContract {\n");
    sb.append("    additionalNames: ").append(toIndentedString(additionalNames)).append("\n");
    sb.append("    albums: ").append(toIndentedString(albums)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    artistString: ").append(toIndentedString(artistString)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    defaultName: ").append(toIndentedString(defaultName)).append("\n");
    sb.append("    defaultNameLanguage: ").append(toIndentedString(defaultNameLanguage)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    favoritedTimes: ").append(toIndentedString(favoritedTimes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lengthSeconds: ").append(toIndentedString(lengthSeconds)).append("\n");
    sb.append("    lyrics: ").append(toIndentedString(lyrics)).append("\n");
    sb.append("    mainPicture: ").append(toIndentedString(mainPicture)).append("\n");
    sb.append("    mergedTo: ").append(toIndentedString(mergedTo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    originalVersionId: ").append(toIndentedString(originalVersionId)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    pvs: ").append(toIndentedString(pvs)).append("\n");
    sb.append("    pvServices: ").append(toIndentedString(pvServices)).append("\n");
    sb.append("    ratingScore: ").append(toIndentedString(ratingScore)).append("\n");
    sb.append("    releaseEvent: ").append(toIndentedString(releaseEvent)).append("\n");
    sb.append("    songType: ").append(toIndentedString(songType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thumbUrl: ").append(toIndentedString(thumbUrl)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    webLinks: ").append(toIndentedString(webLinks)).append("\n");
    sb.append("    minMilliBpm: ").append(toIndentedString(minMilliBpm)).append("\n");
    sb.append("    maxMilliBpm: ").append(toIndentedString(maxMilliBpm)).append("\n");
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

