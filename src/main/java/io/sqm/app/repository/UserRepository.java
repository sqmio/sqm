package io.sqm.app.repository;

import io.sqm.app.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public User findUserByLogin(String login);
}
