package com.paradise.beatify.core.dto.musician.artist;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.paradise.beatify.core.domain.info.Genre;
import com.paradise.beatify.core.domain.info.Instrument;
import com.paradise.beatify.core.domain.info.Occupation;
import com.paradise.beatify.core.dto.musician.MusicianDTO;
import com.paradise.beatify.core.dto.audiocontent.AlbumDTO;
import com.paradise.beatify.core.dto.musician.band.BandDTO;


import java.util.Set;

public class ArtistDTO extends MusicianDTO {

    private String firstName;
    private String lastName;
    private boolean bandArtist;
    private Set<Occupation> occupations;
    private Set<Instrument> instruments;
    private String info;

    @JsonIgnore
    private Set<Genre> genres;
    @JsonIgnore
    private Set<AlbumDTO> albums;
    @JsonIgnore
    private BandDTO band;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isBandArtist() {
        return bandArtist;
    }

    public void setBandArtist(boolean bandArtist) {
        this.bandArtist = bandArtist;
    }

    public BandDTO getBand() {
        return band;
    }

    public void setBand(BandDTO band) {
        this.band = band;
    }

    public Set<Occupation> getOccupations() {
        return occupations;
    }

    public void setOccupations(Set<Occupation> occupations) {
        this.occupations = occupations;
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
