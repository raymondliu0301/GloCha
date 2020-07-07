package com.example.glocha.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Photo implements Parcelable {

    private String challenge_name;
    private String caption;
    private String date_created;
    private String image_path;
    private String photo_id;
    private String user_id;
    private String tags;
    private List<Like> likes;
    private List<Comment> comments;

    public Photo() {

    }

    public Photo(String challenge_name, String caption, String date_created, String image_path,
                 String photo_id, String user_id, String tags, List<Like> likes, List<Comment> comments) {
        this.challenge_name = challenge_name;
        this.caption = caption;
        this.date_created = date_created;
        this.image_path = image_path;
        this.photo_id = photo_id;
        this.user_id = user_id;
        this.tags = tags;
        this.likes = likes;
        this.comments = comments;
    }

    protected Photo(Parcel in) {
        challenge_name = in.readString();
        caption = in.readString();
        date_created = in.readString();
        image_path = in.readString();
        photo_id = in.readString();
        user_id = in.readString();
        tags = in.readString();
    }

    public static final Creator<Photo> CREATOR = new Creator<Photo>() {
        @Override
        public Photo createFromParcel(Parcel in) {
            return new Photo(in);
        }

        @Override
        public Photo[] newArray(int size) {
            return new Photo[size];
        }
    };

    public String getChallenge_name() {
        return challenge_name;
    }

    public void setChallenge_name(String challenge_name) {
        this.challenge_name = challenge_name;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(String photo_id) {
        this.photo_id = photo_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "challenge_name='" + challenge_name + '\'' +
                ", caption='" + caption + '\'' +
                ", date_created='" + date_created + '\'' +
                ", image_path='" + image_path + '\'' +
                ", photo_id='" + photo_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", tags='" + tags + '\'' +
                ", likes=" + likes +
                ", comments=" + comments +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(challenge_name);
        dest.writeString(caption);
        dest.writeString(date_created);
        dest.writeString(image_path);
        dest.writeString(photo_id);
        dest.writeString(user_id);
        dest.writeString(tags);
    }
}
