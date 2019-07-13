package com.paradise.beatify.core.repository.audiocontent.album;

import com.paradise.beatify.core.domain.audiocontent.album.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long>, AlbumRepositoryCustom {

}
