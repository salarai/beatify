package com.paradise.beatify.core.repository.userdetails.authority;

import com.paradise.beatify.core.domain.userdetails.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>, AuthorityRepositoryCustom {

}
