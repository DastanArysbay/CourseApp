
package com.example.courseapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Exercise {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("totalSession")
    @Expose
    private String totalSession;
    @SerializedName("content")
    @Expose
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTotalSession() {
        return totalSession;
    }

    public void setTotalSession(String totalSession) {
        this.totalSession = totalSession;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
