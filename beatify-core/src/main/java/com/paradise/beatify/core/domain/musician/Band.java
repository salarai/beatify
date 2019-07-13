package com.paradise.beatify.core.domain.musician;

import com.paradise.beatify.core.domain.info.Genre;
import com.paradise.beatify.core.domain.info.Instrument;
import com.paradise.beatify.core.domain.audiocontent.album.Album;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "BANDS")
public class Band extends Musician {

    @OneToMany(mappedBy = "band")
    private Set<Artist> artists;

    @ElementCollection(targetClass = Genre.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "ARTIST_GENRE")
    @Column(name = "GENRE")
    private Set<Genre> genres;

    @OneToMany(mappedBy = "band")
    private Set<Album> albums;

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }
}
