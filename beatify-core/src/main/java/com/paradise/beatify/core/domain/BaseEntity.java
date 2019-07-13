package com.paradise.beatify.core.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ENTITIES")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column
    protected boolean active;

    @Column
    protected String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
