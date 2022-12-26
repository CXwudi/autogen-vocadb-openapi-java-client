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


package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.model.AdvancedSearchFilterParams;
import mikufan.cx.vocadbapiclient.model.CommentForApiContract;
import mikufan.cx.vocadbapiclient.model.CommentForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;
import mikufan.cx.vocadbapiclient.model.PVServices;
import mikufan.cx.vocadbapiclient.model.SongInListForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.SongListFeaturedCategory;
import mikufan.cx.vocadbapiclient.model.SongListForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.SongListForEditForApiContract;
import mikufan.cx.vocadbapiclient.model.SongListOptionalFields;
import mikufan.cx.vocadbapiclient.model.SongListSortRule;
import mikufan.cx.vocadbapiclient.model.SongOptionalFields;
import mikufan.cx.vocadbapiclient.model.SongSortRule;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SongListApi
 */
@Ignore
public class SongListApiTest {

  private final SongListApi api;

  {
    var apiClient = new ApiClient();
    apiClient.setBasePath("https://vocadb.net");
    api = new SongListApi(apiClient);
  }


  /**
   * @throws ApiException if the Api call fails
   */
  @Test
  public void apiSongListsCommentsCommentIdDeleteTest() {
    Integer commentId = null;
    api.apiSongListsCommentsCommentIdDelete(commentId);

    // TODO: test validations
  }

  /**
   * @throws ApiException if the Api call fails
   */
  @Test
  public void apiSongListsCommentsCommentIdPostTest() {
    Integer commentId = null;
    CommentForApiContract commentForApiContract = null;
    api.apiSongListsCommentsCommentIdPost(commentId, commentForApiContract);

    // TODO: test validations
  }

  /**
   * @throws ApiException if the Api call fails
   */
  @Test
  public void apiSongListsFeaturedGetTest() {
    String query = null;
    List<Integer> tagId = null;
    Boolean childTags = null;
    NameMatchMode nameMatchMode = null;
    SongListFeaturedCategory featuredCategory = null;
    Integer start = null;
    Integer maxResults = null;
    Boolean getTotalCount = null;
    SongListSortRule sort = null;
    SongListOptionalFields fields = null;
    ContentLanguagePreference lang = null;
    SongListForApiContractPartialFindResult response = api.apiSongListsFeaturedGet(query, tagId, childTags, nameMatchMode, featuredCategory, start, maxResults, getTotalCount, sort, fields, lang);

    // TODO: test validations
  }

  /**
   * @throws ApiException if the Api call fails
   */
  @Test
  public void apiSongListsFeaturedNamesGetTest() {
    String query = null;
    NameMatchMode nameMatchMode = null;
    SongListFeaturedCategory featuredCategory = null;
    Integer maxResults = null;
    List<String> response = api.apiSongListsFeaturedNamesGet(query, nameMatchMode, featuredCategory, maxResults);

    // TODO: test validations
  }

  /**
   * @throws ApiException if the Api call fails
   */
  @Test
  public void apiSongListsIdDeleteTest() {
    Integer id = null;
    String notes = null;
    Boolean hardDelete = null;
    api.apiSongListsIdDelete(id, notes, hardDelete);

    // TODO: test validations
  }

  /**
   * @throws ApiException if the Api call fails
   */
  @Test
  public void apiSongListsListIdCommentsGetTest() {
    Integer listId = null;
    CommentForApiContractPartialFindResult response = api.apiSongListsListIdCommentsGet(listId);

    // TODO: test validations
  }

  /**
   * @throws ApiException if the Api call fails
   */
  @Test
  public void apiSongListsListIdCommentsPostTest() {
    Integer listId = null;
    CommentForApiContract commentForApiContract = null;
    CommentForApiContract response = api.apiSongListsListIdCommentsPost(listId, commentForApiContract);

    // TODO: test validations
  }

  /**
   * @throws ApiException if the Api call fails
   */
  @Test
  public void apiSongListsListIdSongsGetTest() throws IOException {
    Integer listId = 11046;
    String query = null;
    String songTypes = null;
    PVServices pvServices = null;
    List<Integer> tagId = null;
    List<Integer> artistId = null;
    Boolean childVoicebanks = null;
    List<AdvancedSearchFilterParams> advancedFilters = null;
    Integer start = null;
    Integer maxResults = 30;
    Boolean getTotalCount = true;
    SongSortRule sort = null;
    NameMatchMode nameMatchMode = null;
    SongOptionalFields fields = SongOptionalFields.fromValue("Artists,Albums,PVs");
    ContentLanguagePreference lang = null;
    SongInListForApiContractPartialFindResult response = api.apiSongListsListIdSongsGet(listId, query, songTypes, pvServices, tagId, artistId, childVoicebanks, advancedFilters, start, maxResults, getTotalCount, sort, nameMatchMode, fields, lang);
    System.out.println("response = " + response);
    Files.writeString(Path.of("test.txt"), response.toString());
    // TODO: test validations
  }

  /**
   * @throws ApiException if the Api call fails
   */
  @Test
  public void apiSongListsPostTest() {
    SongListForEditForApiContract songListForEditForApiContract = null;
    Integer response = api.apiSongListsPost(songListForEditForApiContract);

    // TODO: test validations
  }

}