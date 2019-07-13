package com.paradise.beatify.core.domain.audiocontent.song;

import com.paradise.beatify.core.domain.audiocontent.album.Album;
import com.paradise.beatify.core.domain.audiocontent.AudioContent;

import javax.persistence.*;

@Entity
@Table(name = "SONGS")
public class Song extends AudioContent {

    @Column
    private String duration;

    @Column
    private String serverURL;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ALBUM_ID")
    @OrderColumn(name = "ALBUM_ORDER")
    private Album album;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getServerURL() {
        return serverURL;
    }

    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
