package com.paradise.beatify.core.domain.audiocontent;

import com.paradise.beatify.core.domain.BaseEntity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AudioContent extends BaseEntity implements Playable {
}
