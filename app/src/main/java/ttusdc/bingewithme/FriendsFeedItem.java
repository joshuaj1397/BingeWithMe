package ttusdc.bingewithme;

public class FriendsFeedItem {

  private String profileName;
  private String mediaName;
  private String mediaProgress;

  public FriendsFeedItem(String profileName, String mediaName, String mediaProgress) {
    this.profileName = profileName;
    this.mediaName = mediaName;
    this.mediaProgress = mediaProgress;
  }

  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  public String getMediaName() {
    return mediaName;
  }

  public void setMediaName(String mediaName) {
    this.mediaName = mediaName;
  }

  public String getmediaProgress() {
    return mediaProgress;
  }

  public void setmediaProgress(String mediaProgress) {
    this.mediaProgress = mediaProgress;
  }
}
