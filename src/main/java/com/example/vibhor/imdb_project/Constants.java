package com.example.vibhor.imdb_project;

/**
 * Created by Nischay on 10-01-2018.
 */

//Constants class for showing movie details in MainActivity class recyclerview
public class Constants
{
    //constant values
    String id;
    String imageUrl;
    String name;
    String releaseDate;
    Float polpularity;
    String votesAverage;
    String votesCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getPolpularity() {
        return polpularity;
    }

    public void setPolpularity(float polpularity) {
        this.polpularity = polpularity;
    }

    public String getVotesAverage() {
        return votesAverage;
    }

    public void setVotesAverage(String votesAverage) {
        this.votesAverage = votesAverage;
    }

    public String getVotesCount() {
        return votesCount;
    }

    public void setVotesCount(String votesCount) {
        this.votesCount = votesCount;
    }
}
