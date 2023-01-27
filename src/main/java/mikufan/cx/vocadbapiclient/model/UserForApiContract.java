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
import mikufan.cx.vocadbapiclient.model.EntryThumbForApiContract;
import mikufan.cx.vocadbapiclient.model.OldUsernameContract;
import mikufan.cx.vocadbapiclient.model.UserGroupId;
import mikufan.cx.vocadbapiclient.model.UserKnownLanguageContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UserForApiContract
 */
@JsonPropertyOrder({
  UserForApiContract.JSON_PROPERTY_ACTIVE,
  UserForApiContract.JSON_PROPERTY_GROUP_ID,
  UserForApiContract.JSON_PROPERTY_KNOWN_LANGUAGES,
  UserForApiContract.JSON_PROPERTY_MAIN_PICTURE,
  UserForApiContract.JSON_PROPERTY_MEMBER_SINCE,
  UserForApiContract.JSON_PROPERTY_OLD_USERNAMES,
  UserForApiContract.JSON_PROPERTY_VERIFIED_ARTIST,
  UserForApiContract.JSON_PROPERTY_ID,
  UserForApiContract.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-27T01:04:32.642512Z[Etc/UTC]")
public class UserForApiContract {
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private UserGroupId groupId;

  public static final String JSON_PROPERTY_KNOWN_LANGUAGES = "knownLanguages";
  private List<UserKnownLanguageContract> knownLanguages = null;

  public static final String JSON_PROPERTY_MAIN_PICTURE = "mainPicture";
  private EntryThumbForApiContract mainPicture;

  public static final String JSON_PROPERTY_MEMBER_SINCE = "memberSince";
  private LocalDateTime memberSince;

  public static final String JSON_PROPERTY_OLD_USERNAMES = "oldUsernames";
  private List<OldUsernameContract> oldUsernames = null;

  public static final String JSON_PROPERTY_VERIFIED_ARTIST = "verifiedArtist";
  private Boolean verifiedArtist;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public UserForApiContract() {
  }

  public UserForApiContract active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public UserForApiContract groupId(UserGroupId groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserGroupId getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(UserGroupId groupId) {
    this.groupId = groupId;
  }


  public UserForApiContract knownLanguages(List<UserKnownLanguageContract> knownLanguages) {
    
    this.knownLanguages = knownLanguages;
    return this;
  }

  public UserForApiContract addKnownLanguagesItem(UserKnownLanguageContract knownLanguagesItem) {
    if (this.knownLanguages == null) {
      this.knownLanguages = new ArrayList<>();
    }
    this.knownLanguages.add(knownLanguagesItem);
    return this;
  }

   /**
   * Get knownLanguages
   * @return knownLanguages
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KNOWN_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UserKnownLanguageContract> getKnownLanguages() {
    return knownLanguages;
  }


  @JsonProperty(JSON_PROPERTY_KNOWN_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKnownLanguages(List<UserKnownLanguageContract> knownLanguages) {
    this.knownLanguages = knownLanguages;
  }


  public UserForApiContract mainPicture(EntryThumbForApiContract mainPicture) {
    
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


  public UserForApiContract memberSince(LocalDateTime memberSince) {
    
    this.memberSince = memberSince;
    return this;
  }

   /**
   * Get memberSince
   * @return memberSince
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBER_SINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getMemberSince() {
    return memberSince;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_SINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberSince(LocalDateTime memberSince) {
    this.memberSince = memberSince;
  }


  public UserForApiContract oldUsernames(List<OldUsernameContract> oldUsernames) {
    
    this.oldUsernames = oldUsernames;
    return this;
  }

  public UserForApiContract addOldUsernamesItem(OldUsernameContract oldUsernamesItem) {
    if (this.oldUsernames == null) {
      this.oldUsernames = new ArrayList<>();
    }
    this.oldUsernames.add(oldUsernamesItem);
    return this;
  }

   /**
   * Get oldUsernames
   * @return oldUsernames
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OLD_USERNAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OldUsernameContract> getOldUsernames() {
    return oldUsernames;
  }


  @JsonProperty(JSON_PROPERTY_OLD_USERNAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldUsernames(List<OldUsernameContract> oldUsernames) {
    this.oldUsernames = oldUsernames;
  }


  public UserForApiContract verifiedArtist(Boolean verifiedArtist) {
    
    this.verifiedArtist = verifiedArtist;
    return this;
  }

   /**
   * Get verifiedArtist
   * @return verifiedArtist
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFIED_ARTIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerifiedArtist() {
    return verifiedArtist;
  }


  @JsonProperty(JSON_PROPERTY_VERIFIED_ARTIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifiedArtist(Boolean verifiedArtist) {
    this.verifiedArtist = verifiedArtist;
  }


  public UserForApiContract id(Integer id) {
    
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


  public UserForApiContract name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserForApiContract userForApiContract = (UserForApiContract) o;
    return Objects.equals(this.active, userForApiContract.active) &&
        Objects.equals(this.groupId, userForApiContract.groupId) &&
        Objects.equals(this.knownLanguages, userForApiContract.knownLanguages) &&
        Objects.equals(this.mainPicture, userForApiContract.mainPicture) &&
        Objects.equals(this.memberSince, userForApiContract.memberSince) &&
        Objects.equals(this.oldUsernames, userForApiContract.oldUsernames) &&
        Objects.equals(this.verifiedArtist, userForApiContract.verifiedArtist) &&
        Objects.equals(this.id, userForApiContract.id) &&
        Objects.equals(this.name, userForApiContract.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, groupId, knownLanguages, mainPicture, memberSince, oldUsernames, verifiedArtist, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserForApiContract {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    knownLanguages: ").append(toIndentedString(knownLanguages)).append("\n");
    sb.append("    mainPicture: ").append(toIndentedString(mainPicture)).append("\n");
    sb.append("    memberSince: ").append(toIndentedString(memberSince)).append("\n");
    sb.append("    oldUsernames: ").append(toIndentedString(oldUsernames)).append("\n");
    sb.append("    verifiedArtist: ").append(toIndentedString(verifiedArtist)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

