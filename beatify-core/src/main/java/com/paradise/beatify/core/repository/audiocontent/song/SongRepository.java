package com.paradise.beatify.core.repository.audiocontent.song;

import com.paradise.beatify.core.domain.audiocontent.song.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long>, SongRepositoryCustom {

}
