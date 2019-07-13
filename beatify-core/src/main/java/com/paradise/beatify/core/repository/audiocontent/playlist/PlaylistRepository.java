package com.paradise.beatify.core.repository.audiocontent.playlist;

import com.paradise.beatify.core.domain.audiocontent.playlist.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long>, PlaylistRepositoryCustom {

}
