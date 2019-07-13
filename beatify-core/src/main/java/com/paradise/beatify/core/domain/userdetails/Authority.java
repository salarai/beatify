package com.paradise.beatify.core.domain.userdetails;

import com.paradise.beatify.core.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORITIES")
public class Authority extends BaseEntity {

    @Column
    private String role;

    @Column
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
