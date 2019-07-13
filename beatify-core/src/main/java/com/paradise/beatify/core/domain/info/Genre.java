package com.paradise.beatify.core.domain.info;

public enum Genre {

    Rock("Rock"), Folk("Folk"), Jazz("Jazz"), Blues("Blues"), MusicalTheatre("Musical Theatre"),
    Country("Country"), Pop("Pop"), HipHop("Hip Hop"), RythmsAndBlues("Rythm and Blues"), Reggae("Reggage"),
    Classical("Classical"), Popular("Popular"), PunkRock("Punk Rock"), HeavyMetal("Heavy Metal"), Funk("Funk"),
    Soul("Soul"), Techno("Techno"), House("House"), Singing("Singing"), AlternativeRock("Alternative Rock"),
    Dance("Dance"), ElectronicDance("Electronic Dance"), Electro("Electro"), Disco("Disco"), Trance("Trance"),
    Ambient("Ambient"), Psychedelic("Psychedelic"), Instrumental("Instrumental"), Dubstep("Dubstep"), Gospel("Gospel"),
    ProgressiveRock("Progressive Rock"), PopRock("Pop Rock"), Industrial("Industrial"), Breakbeat("Breakbeat"),
    Orchestra("Orchestra"), Dub("Dub"), Experimental("Experimental"), Baroque("Baroque"), Grunge("Grunge"),
    IndieRock("Indie Rock"), Progressive("Progressive"), Ska("Ska"), DrumAndBass("Drum and Bass"), Swing("Swing"),
    HardRock("Hard Rock"), SynthPop("Synth-Pop"), UKGarage("UK Garage"), Opera("Opera"), Electronica("Electronica"),
    Bass("Bass"), Soundtrack("Sountrack");


    private final String title;

    Genre(final String title) {

        this.title = title;
    }

    @Override
    public String toString() {

        return title;
    }
}
