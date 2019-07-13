package com.paradise.beatify.core.repository.audiocontent.album;

import com.paradise.beatify.core.domain.audiocontent.album.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumRepositoryCustom {

    Optional<Long> getOverallPopularity();

    List<Album> findRecentAlbums(int first, int max);

    List<Album> findFeaturedAlbums(int first, int max);
}
