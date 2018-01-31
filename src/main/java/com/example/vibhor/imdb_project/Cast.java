package com.example.vibhor.imdb_project;

/**
 * Created by Nischay on 15-01-2018.
 */

//class to store movie cast details
public class Cast
{
    String picURL;
    String castMovieName;
    String castOriginalName;

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }

    public String getCastMovieName() {
        return castMovieName;
    }

    public void setCastMovieName(String castMovieName) {
        this.castMovieName = castMovieName;
    }

    public String getCastOriginalName() {
        return castOriginalName;
    }

    public void setCastOriginalName(String castOriginalName) {
        this.castOriginalName = castOriginalName;
    }
}
