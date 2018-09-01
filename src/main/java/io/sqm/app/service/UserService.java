package io.sqm.app.service;

import io.sqm.app.entity.User;

public interface UserService {

    User getUserByLogin(String login);
}
