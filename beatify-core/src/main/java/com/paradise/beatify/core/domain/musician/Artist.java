package com.paradise.beatify.core.domain.musician;

import com.paradise.beatify.core.domain.info.Genre;
import com.paradise.beatify.core.domain.info.Instrument;
import com.paradise.beatify.core.domain.info.Occupation;
import com.paradise.beatify.core.domain.audiocontent.album.Album;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ARTISTS")
public class Artist extends Musician {

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private boolean bandArtist;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "BAND_ID")
    private Band band;

    @ElementCollection(targetClass = Occupation.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "ARTIST_OCCUPATION")
    @Column(name = "OCCUPATION")
    private Set<Occupation> occupations;

    @ElementCollection(targetClass = Instrument.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "ARTIST_INSTRUMENT")
    @Column(name = "INSTRUMENT")
    private Set<Instrument> instruments;

    @OneToMany(mappedBy = "artist")
    private Set<Album> albums;

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

    public Set<Occupation> getOccupations() {
        return occupations;
    }

    public void setOccupations(Set<Occupation> occupations) {
        this.occupations = occupations;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }

    public boolean isBandArtist() {
        return bandArtist;
    }

    public void setBandArtist(boolean bandArtist) {
        this.bandArtist = bandArtist;
    }

    public Set<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Set<Instrument> instruments) {
        this.instruments = instruments;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
}
