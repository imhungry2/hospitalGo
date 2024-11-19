package com.reservation.user.repository.port;

import com.reservation.user.domain.UserDto;
import com.reservation.user.repository.request.UpdateSocialUser;

public interface UpdateUserPort {

    UserDto updateSocialUser(UpdateSocialUser update);
}
