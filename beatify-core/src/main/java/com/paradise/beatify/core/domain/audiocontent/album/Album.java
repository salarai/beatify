package com.paradise.beatify.core.domain.audiocontent.album;

import com.paradise.beatify.core.domain.info.Genre;
import com.paradise.beatify.core.domain.info.Instrument;
import com.paradise.beatify.core.domain.musician.Artist;
import com.paradise.beatify.core.domain.musician.Band;
import com.paradise.beatify.core.domain.audiocontent.AudioContent;
import com.paradise.beatify.core.domain.audiocontent.song.Song;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ALBUMS")
public class Album extends AudioContent {

    @Column
    private int year;

    @Column
    private long popularity;

    @Column
    private boolean bandAlbum;

    @Column
    private String albumArtURL;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "BAND_ID")
    @OrderColumn(name = "BAND_ORDER")
    private Band band;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ARTIST_ID")
    @OrderColumn(name = "ARTIST_ORDER")
    private Artist artist;

    @OneToMany(mappedBy = "album")
    private Set<Song> songs;

    @ElementCollection(targetClass = Genre.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "ALBUM_GENRE")
    @Column(name = "GENRE")
    private Set<Genre> genres;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getPopularity() {
        return popularity;
    }

    public void setPopularity(long popularity) {
        this.popularity = popularity;
    }

    public boolean isBandAlbum() {
        return bandAlbum;
    }

    public void setBandAlbum(boolean bandAlbum) {
        this.bandAlbum = bandAlbum;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public String getAlbumArtURL() {
        return albumArtURL;
    }

    public void setAlbumArtURL(String albumArtURL) {
        this.albumArtURL = albumArtURL;
    }
}
