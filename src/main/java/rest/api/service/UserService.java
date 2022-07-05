package rest.api.service;

import rest.api.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAlll();
    public User findById(long id);
    public User create(User user);
    public User update(User user, long id);
    public void delete (long id);
}
