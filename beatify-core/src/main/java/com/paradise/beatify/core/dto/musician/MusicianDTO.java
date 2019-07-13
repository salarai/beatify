package com.paradise.beatify.core.dto.musician;

import com.paradise.beatify.core.domain.info.Country;
import com.paradise.beatify.core.dto.BaseEntityDTO;

public class MusicianDTO extends BaseEntityDTO {

    private String yearsActive;
    private Country nationality;

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
