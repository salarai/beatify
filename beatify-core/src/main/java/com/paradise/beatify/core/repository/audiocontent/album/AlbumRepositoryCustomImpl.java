package com.paradise.beatify.core.repository.audiocontent.album;

import com.paradise.beatify.core.domain.audiocontent.album.Album;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@Repository
public class AlbumRepositoryCustomImpl implements AlbumRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Long> getOverallPopularity() {

        try {

            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
            Root<Album> root = query.from(Album.class);
            query.select(criteriaBuilder.max(root.get("popularity")));

            return Optional.of(entityManager.createQuery(query).getSingleResult());
        } catch (Exception e) {

            return Optional.empty();
        }
    }

    @Override
    public List<Album> findRecentAlbums(int first, int max) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Album> query = criteriaBuilder.createQuery(Album.class);
        Root<Album> root = query.from(Album.class);
        query.orderBy(criteriaBuilder.desc(root.get("id")));

        return entityManager.createQuery(query)
                .setFirstResult(first)
                .setMaxResults(max)
                .getResultList();
    }

    @Override
    public List<Album> findFeaturedAlbums(int first, int max) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Album> query = criteriaBuilder.createQuery(Album.class);
        Root<Album> root = query.from(Album.class);

        return entityManager.createQuery(query)
                .setFirstResult(first)
                .setMaxResults(max)
                .getResultList();
    }
}
