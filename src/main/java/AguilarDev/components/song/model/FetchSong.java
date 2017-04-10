package AguilarDev.components.song.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by peteraguilar on 4/10/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FetchSong implements Serializable {
    private String artistName;
    private String trackName;
    private String collectionName;


    public FetchSong() {
    }

    public FetchSong(String artistName, String trackName, String collectionName) {
        this.artistName = artistName;
        this.trackName = trackName;
        this.collectionName = collectionName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    @Override
    public String toString() {
        return "FetchSong{" +
                "artistName='" + artistName + '\'' +
                ", trackName='" + trackName + '\'' +
                ", collectionName='" + collectionName + '\'' +
                '}';
    }
}
