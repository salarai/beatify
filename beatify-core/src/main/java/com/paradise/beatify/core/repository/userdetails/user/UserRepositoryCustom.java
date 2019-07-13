package com.paradise.beatify.core.repository.userdetails.user;

import com.paradise.beatify.core.domain.userdetails.BeatifyUser;

import java.util.Optional;

public interface UserRepositoryCustom {

    Optional<BeatifyUser> findByEmailAddress(String emailAddress);
}
