package com.paradise.beatify.core.repository.userdetails.user;

import com.paradise.beatify.core.domain.userdetails.BeatifyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BeatifyUser, Long>, UserRepositoryCustom {

}
