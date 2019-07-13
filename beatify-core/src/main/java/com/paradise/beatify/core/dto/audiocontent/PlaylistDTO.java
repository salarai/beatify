package com.paradise.beatify.core.dto.audiocontent;

import com.paradise.beatify.core.dto.userdetails.UserDTO;

import java.util.List;
import java.util.Set;

public class PlaylistDTO extends AudioContentDTO {

    private boolean repeat;
    private boolean shuffle;
    private Set<SongDTO> songs;
    private UserDTO beatifyUser;
    private List<Long> tracks;

    public Set<SongDTO> getSongs() {
        return songs;
    }

    public void setSongs(Set<SongDTO> songs) {
        this.songs = songs;
    }

    public UserDTO getBeatifyUser() {
        return beatifyUser;
    }

    public void setBeatifyUser(UserDTO beatifyUser) {
        this.beatifyUser = beatifyUser;
    }

    public List<Long> getTracks() {
        return tracks;
    }

    public void setTracks(List<Long> tracks) {
        this.tracks = tracks;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public boolean isShuffle() {
        return shuffle;
    }

    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }
}
