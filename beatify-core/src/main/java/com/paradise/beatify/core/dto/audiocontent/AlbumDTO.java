package com.paradise.beatify.core.dto.audiocontent;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.paradise.beatify.core.domain.info.Genre;
import com.paradise.beatify.core.dto.musician.artist.ArtistDTO;
import com.paradise.beatify.core.dto.musician.band.BandDTO;

import java.util.Set;

public class AlbumDTO extends AudioContentDTO {

    private int year;
    private long popularity;
    private boolean bandAlbum;
    private BandDTO band;
    private ArtistDTO artist;
    private Set<Genre> genres;
    private String albumArtURL;
    private String info;

    @JsonIgnore
    private Set<SongDTO> songs;

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

    public BandDTO getBand() {
        return band;
    }

    public void setBand(BandDTO band) {
        this.band = band;
    }

    public ArtistDTO getArtist() {
        return artist;
    }

    public void setArtist(ArtistDTO artist) {
        this.artist = artist;
    }

    public Set<SongDTO> getSongs() {
        return songs;
    }

    public void setSongs(Set<SongDTO> songs) {
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
