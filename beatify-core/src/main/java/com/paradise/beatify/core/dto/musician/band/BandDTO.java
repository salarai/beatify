package com.paradise.beatify.core.dto.musician.band;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.paradise.beatify.core.domain.info.Genre;
import com.paradise.beatify.core.domain.info.Instrument;
import com.paradise.beatify.core.dto.audiocontent.AlbumDTO;
import com.paradise.beatify.core.dto.musician.MusicianDTO;
import com.paradise.beatify.core.dto.musician.artist.ArtistDTO;

import java.util.Set;

public class BandDTO extends MusicianDTO {

    private Set<ArtistDTO> artists;
    private Set<Genre> genres;

    @JsonIgnore
    private Set<Instrument> instruments;
    @JsonIgnore
    private Set<AlbumDTO> albums;

    private String info;

    public Set<ArtistDTO> getArtists() {
        return artists;
    }

    public void setArtists(Set<ArtistDTO> artists) {
        this.artists = artists;
    }

    public Set<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Set<Instrument> instruments) {
        this.instruments = instruments;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Set<AlbumDTO> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<AlbumDTO> albums) {
        this.albums = albums;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
