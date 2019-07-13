package com.paradise.beatify.core.domain.info;

public enum Gender {

    Male("Male"),
    Female("Female");

    private final String title;

    Gender(final String title) {

        this.title = title;
    }

    @Override
    public String toString() {

        return title;
    }
}
