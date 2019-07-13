package com.paradise.beatify.core.service;

import com.paradise.beatify.core.dto.BaseEntityDTO;
import com.paradise.beatify.core.domain.BaseEntity;
import com.paradise.beatify.core.exceptions.ServiceException;

public interface BeatifyService<T extends BaseEntity, D extends BaseEntityDTO> {

    D getById(Long id) throws ServiceException;
}
