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
import java.util.ArrayList;
import java.util.List;
import mikufan.cx.vocadbapiclient.model.AlbumForApiContract;
import mikufan.cx.vocadbapiclient.model.ReleaseEventForApiContract;
import mikufan.cx.vocadbapiclient.model.SongForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ArtistRelationsForApi
 */
@JsonPropertyOrder({
  ArtistRelationsForApi.JSON_PROPERTY_LATEST_ALBUMS,
  ArtistRelationsForApi.JSON_PROPERTY_LATEST_EVENTS,
  ArtistRelationsForApi.JSON_PROPERTY_LATEST_SONGS,
  ArtistRelationsForApi.JSON_PROPERTY_POPULAR_ALBUMS,
  ArtistRelationsForApi.JSON_PROPERTY_POPULAR_SONGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-27T01:04:32.642512Z[Etc/UTC]")
public class ArtistRelationsForApi {
  public static final String JSON_PROPERTY_LATEST_ALBUMS = "latestAlbums";
  private List<AlbumForApiContract> latestAlbums = null;

  public static final String JSON_PROPERTY_LATEST_EVENTS = "latestEvents";
  private List<ReleaseEventForApiContract> latestEvents = null;

  public static final String JSON_PROPERTY_LATEST_SONGS = "latestSongs";
  private List<SongForApiContract> latestSongs = null;

  public static final String JSON_PROPERTY_POPULAR_ALBUMS = "popularAlbums";
  private List<AlbumForApiContract> popularAlbums = null;

  public static final String JSON_PROPERTY_POPULAR_SONGS = "popularSongs";
  private List<SongForApiContract> popularSongs = null;

  public ArtistRelationsForApi() {
  }

  public ArtistRelationsForApi latestAlbums(List<AlbumForApiContract> latestAlbums) {
    
    this.latestAlbums = latestAlbums;
    return this;
  }

  public ArtistRelationsForApi addLatestAlbumsItem(AlbumForApiContract latestAlbumsItem) {
    if (this.latestAlbums == null) {
      this.latestAlbums = new ArrayList<>();
    }
    this.latestAlbums.add(latestAlbumsItem);
    return this;
  }

   /**
   * Get latestAlbums
   * @return latestAlbums
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATEST_ALBUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlbumForApiContract> getLatestAlbums() {
    return latestAlbums;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_ALBUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestAlbums(List<AlbumForApiContract> latestAlbums) {
    this.latestAlbums = latestAlbums;
  }


  public ArtistRelationsForApi latestEvents(List<ReleaseEventForApiContract> latestEvents) {
    
    this.latestEvents = latestEvents;
    return this;
  }

  public ArtistRelationsForApi addLatestEventsItem(ReleaseEventForApiContract latestEventsItem) {
    if (this.latestEvents == null) {
      this.latestEvents = new ArrayList<>();
    }
    this.latestEvents.add(latestEventsItem);
    return this;
  }

   /**
   * Get latestEvents
   * @return latestEvents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATEST_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReleaseEventForApiContract> getLatestEvents() {
    return latestEvents;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestEvents(List<ReleaseEventForApiContract> latestEvents) {
    this.latestEvents = latestEvents;
  }


  public ArtistRelationsForApi latestSongs(List<SongForApiContract> latestSongs) {
    
    this.latestSongs = latestSongs;
    return this;
  }

  public ArtistRelationsForApi addLatestSongsItem(SongForApiContract latestSongsItem) {
    if (this.latestSongs == null) {
      this.latestSongs = new ArrayList<>();
    }
    this.latestSongs.add(latestSongsItem);
    return this;
  }

   /**
   * Get latestSongs
   * @return latestSongs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATEST_SONGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SongForApiContract> getLatestSongs() {
    return latestSongs;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_SONGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestSongs(List<SongForApiContract> latestSongs) {
    this.latestSongs = latestSongs;
  }


  public ArtistRelationsForApi popularAlbums(List<AlbumForApiContract> popularAlbums) {
    
    this.popularAlbums = popularAlbums;
    return this;
  }

  public ArtistRelationsForApi addPopularAlbumsItem(AlbumForApiContract popularAlbumsItem) {
    if (this.popularAlbums == null) {
      this.popularAlbums = new ArrayList<>();
    }
    this.popularAlbums.add(popularAlbumsItem);
    return this;
  }

   /**
   * Get popularAlbums
   * @return popularAlbums
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POPULAR_ALBUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlbumForApiContract> getPopularAlbums() {
    return popularAlbums;
  }


  @JsonProperty(JSON_PROPERTY_POPULAR_ALBUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPopularAlbums(List<AlbumForApiContract> popularAlbums) {
    this.popularAlbums = popularAlbums;
  }


  public ArtistRelationsForApi popularSongs(List<SongForApiContract> popularSongs) {
    
    this.popularSongs = popularSongs;
    return this;
  }

  public ArtistRelationsForApi addPopularSongsItem(SongForApiContract popularSongsItem) {
    if (this.popularSongs == null) {
      this.popularSongs = new ArrayList<>();
    }
    this.popularSongs.add(popularSongsItem);
    return this;
  }

   /**
   * Get popularSongs
   * @return popularSongs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POPULAR_SONGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SongForApiContract> getPopularSongs() {
    return popularSongs;
  }


  @JsonProperty(JSON_PROPERTY_POPULAR_SONGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPopularSongs(List<SongForApiContract> popularSongs) {
    this.popularSongs = popularSongs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtistRelationsForApi artistRelationsForApi = (ArtistRelationsForApi) o;
    return Objects.equals(this.latestAlbums, artistRelationsForApi.latestAlbums) &&
        Objects.equals(this.latestEvents, artistRelationsForApi.latestEvents) &&
        Objects.equals(this.latestSongs, artistRelationsForApi.latestSongs) &&
        Objects.equals(this.popularAlbums, artistRelationsForApi.popularAlbums) &&
        Objects.equals(this.popularSongs, artistRelationsForApi.popularSongs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestAlbums, latestEvents, latestSongs, popularAlbums, popularSongs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistRelationsForApi {\n");
    sb.append("    latestAlbums: ").append(toIndentedString(latestAlbums)).append("\n");
    sb.append("    latestEvents: ").append(toIndentedString(latestEvents)).append("\n");
    sb.append("    latestSongs: ").append(toIndentedString(latestSongs)).append("\n");
    sb.append("    popularAlbums: ").append(toIndentedString(popularAlbums)).append("\n");
    sb.append("    popularSongs: ").append(toIndentedString(popularSongs)).append("\n");
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

