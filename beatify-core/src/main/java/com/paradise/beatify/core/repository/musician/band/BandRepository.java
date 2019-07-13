package com.paradise.beatify.core.repository.musician.band;

import com.paradise.beatify.core.domain.musician.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository extends JpaRepository<Band, Long>, BandRepositoryCustom {

}
