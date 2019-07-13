package com.paradise.beatify.core.service.userdetails.user;

import com.paradise.beatify.core.dto.userdetails.UserDTO;
import com.paradise.beatify.core.exceptions.ServiceException;
import com.paradise.beatify.core.service.BeatifyService;
import com.paradise.beatify.core.domain.userdetails.BeatifyUser;

public interface UserService extends BeatifyService<BeatifyUser, UserDTO> {

    boolean existsById(UserDTO userDTO);

    boolean existsByUsername(UserDTO userDTO);

    UserDTO signup(UserDTO userDTO) throws ServiceException;

    UserDTO getByEmailAddress(String emailAddress) throws ServiceException;
}
