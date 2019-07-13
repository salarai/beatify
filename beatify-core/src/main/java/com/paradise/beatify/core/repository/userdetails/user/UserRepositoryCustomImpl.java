package com.paradise.beatify.core.repository.userdetails.user;

import com.paradise.beatify.core.domain.userdetails.BeatifyUser;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Optional;

@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<BeatifyUser> findByEmailAddress(String emailAddress) {

        try {

            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<BeatifyUser> query = criteriaBuilder.createQuery(BeatifyUser.class);
            Root<BeatifyUser> root = query.from(BeatifyUser.class);
            query.where(criteriaBuilder.equal(root.get("username"), emailAddress));

            return Optional.of(entityManager.createQuery(query).getSingleResult());
        } catch (Exception e) {

            return Optional.empty();
        }
    }
}
