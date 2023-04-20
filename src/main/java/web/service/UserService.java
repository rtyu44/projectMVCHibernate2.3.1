package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> listUser();
    void save(User user);
    void delete(User id);
    User getById(Long id);
    void updateUser(User user);

}
