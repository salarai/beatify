package com.paradise.beatify.core.domain.info;

public enum Instrument {

    Accordion("Accordion"), Bagpipes("Bagpipes"), Banjo("Banjo"), BassGuitar("Bass Guitar"), Bassoon("Bassoon"),
    Berimbau("Berimbau"), Bongo("Bongo"), Cello("Cello"), Clarinet("Clarinet"), CorAnglais("CorAnglais"),
    Cornet("Cornet"), Cymbal("Cymbal"), Didgeridoo("Didgeridoo"), DoubleBass("Double Bass"), DrumKit("Drum Kit"),
    Euphonium("Euphonium"), Flute("Flute"), FrenchHorn("French Horn"), GlassHarmonica("Glass Harmonica"),
    Glockenspiel("Glockenspiel"), Gong("Gong"), Guitar("Guitar"), Harmonica("Harmonica"), Harp("Harp"),
    Harpsichord("Harpsichord"), HammeredDulcimet("HammeredDulcimer"), HurdyGurdy("HurdyGurdy"), JewsHarp("Jew's Harp"),
    Kalimba("Kalimba"), Lute("Lute"), Lyre("Lyre"), Mandolin("Mandolin"), Marimba("Marimba"), Melodica("Melodica"),
    Oboe("Oboe"), Ocarina("Ocarina"), Octobass("Octobass"), Organ("Organ"), PasPipes("Pan Pipes"),
    Pennywhistle("Pennywhistle"), Piano("Piano"), Piccolo("Piccolo"), Recorder("Recorder"), Saxophone("Saxophone"),
    Sitar("Sitar"), Synthesizer("Synthesizer"), Tambourine("Tambourine"), Timpani("Timpani"), Triangle("Triangle"),
    Trombone("Trombone"), Trumpet("Trumpet"), Theremin("Theremin"), Tuba("Tuba"), Ukulele("Ukulele"), Viola("Viola"),
    Violin("Violin"), Whamola("Whamola"), Xylophone("Xylophone"), Zither("Zither"), Vocals("Vocals");

    private final String title;

    Instrument(final String title) {

        this.title = title;
    }


    @Override
    public String toString() {

        return title;
    }
}
