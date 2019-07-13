package com.paradise.beatify.core.dto.userdetails;

import com.paradise.beatify.core.domain.info.Country;
import com.paradise.beatify.core.dto.BaseEntityDTO;
import com.paradise.beatify.core.dto.audiocontent.PlaylistDTO;

import javax.validation.constraints.NotEmpty;
import java.util.Set;

public class UserDTO extends BaseEntityDTO {

    private String phoneNumber;
    private Country nationality;
    private Set<PlaylistDTO> playlists;

    @NotEmpty(message = "{NotEmpty.userDTO.firstName}")
    private String firstName;
    @NotEmpty(message = "{NotEmpty.userDTO.lastName}")
    private String lastName;
    @NotEmpty(message = "{NotEmpty.userDTO.emailAddress}")
    private String username;
    @NotEmpty(message = "{NotEmpty.userDTO.password}")
    private String password;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<PlaylistDTO> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Set<PlaylistDTO> playlists) {
        this.playlists = playlists;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }
}
