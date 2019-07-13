package com.paradise.beatify.core.repository.musician.artist;

import com.paradise.beatify.core.domain.musician.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long>, ArtistRepositoryCustom {

}
