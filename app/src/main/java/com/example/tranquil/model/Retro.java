package com.example.tranquil.model;

import com.google.gson.annotations.SerializedName;

public class Retro {
    @SerializedName("createdAt")
    private Integer createdAt;
    @SerializedName("entry_id")
    private Integer entry_id;
    @SerializedName("field1")
    private int field1;
    @SerializedName("field2")
    private Boolean field2;


    public Retro(Integer albumId, Integer id, Integer title, boolean url) {
        this.createdAt = albumId;
        this.entry_id = id;
        this.field1 = title;
        this.field2 = url;

    }

    public Integer getAlbumId() {
        return createdAt;
    }

    public void setAlbumId(Integer albumId) {
        this.createdAt = albumId;
    }

    public Integer getId() {
        return entry_id;
    }

    public void setId(Integer id) {
        this.entry_id = id;
    }

    public int getTitle() {
        return field1;
    }

    public void setTitle(int title) {
        this.field1 = title;
    }

    public Boolean getUrl() {
        return field2;
    }

    public void setUrl(Boolean url) {
        this.field2 = url;
    }


}
