package com.paradise.beatify.core.dto.userdetails;

import com.paradise.beatify.core.dto.BaseEntityDTO;

public class AuthorityDTO extends BaseEntityDTO {

    private String role;
    private String username;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
