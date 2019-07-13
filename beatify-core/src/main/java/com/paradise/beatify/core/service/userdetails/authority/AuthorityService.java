package com.paradise.beatify.core.service.userdetails.authority;

import com.paradise.beatify.core.dto.userdetails.AuthorityDTO;
import com.paradise.beatify.core.dto.userdetails.UserDTO;
import com.paradise.beatify.core.exceptions.ServiceException;
import com.paradise.beatify.core.service.BeatifyService;
import com.paradise.beatify.core.domain.userdetails.Authority;

public interface AuthorityService extends BeatifyService<Authority, AuthorityDTO> {

    AuthorityDTO createAuthority(UserDTO userDTO) throws ServiceException;
}
