package com.paradise.beatify.core.domain.musician;

import com.paradise.beatify.core.domain.BaseEntity;
import com.paradise.beatify.core.domain.info.Country;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Musician extends BaseEntity {

    @Column
    protected String yearsActive;

    @Column
    @Enumerated
    protected Country nationality;

    public String getYearsActive() {
        return yearsActive;
    }

    public void setYearsActive(String yearsActive) {
        this.yearsActive = yearsActive;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }
}
