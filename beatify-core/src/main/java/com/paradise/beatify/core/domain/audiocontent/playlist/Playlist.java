package com.paradise.beatify.core.domain.audiocontent.playlist;

import com.paradise.beatify.core.domain.userdetails.BeatifyUser;
import com.paradise.beatify.core.domain.audiocontent.AudioContent;
import com.paradise.beatify.core.domain.audiocontent.song.Song;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PLAYLISTS")
public class Playlist extends AudioContent {

    @ManyToMany
    @JoinTable(name = "PLAYLIST_SONG",
            joinColumns = @JoinColumn(name = "PLAYLIST_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "SONG_ID", referencedColumnName = "ID"))
    private Set<Song> songs;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    private BeatifyUser beatifyUser;

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public BeatifyUser getBeatifyUser() {
        return beatifyUser;
    }

    public void setBeatifyUser(BeatifyUser beatifyUser) {
        this.beatifyUser = beatifyUser;
    }
}
