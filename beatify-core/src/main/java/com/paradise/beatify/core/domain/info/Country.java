package com.paradise.beatify.core.domain.info;

public enum Country {

    Iran("Iran"),
    UK("United Kingdom"),
    US("United States");

    private final String title;

    Country(final String title) {

        this.title = title;
    }

    @Override
    public String toString() {

        return title;
    }
}
