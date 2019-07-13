package com.paradise.beatify.core.service.audiocontent.album;

import com.paradise.beatify.core.dto.audiocontent.AlbumDTO;
import com.paradise.beatify.core.exceptions.ServiceException;
import com.paradise.beatify.core.service.BeatifyService;
import com.paradise.beatify.core.domain.audiocontent.album.Album;

import java.util.List;

public interface AlbumService extends BeatifyService<Album, AlbumDTO> {

    AlbumDTO increasePopularity(Long albumId) throws ServiceException;

    long getOverallPopularity() throws ServiceException;

    List<AlbumDTO> getRecentlyAddedAlbums(int first, int max);

    List<AlbumDTO> getFeaturedAlbums(int first, int max);
}
