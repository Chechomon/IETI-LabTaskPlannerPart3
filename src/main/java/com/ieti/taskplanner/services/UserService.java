package com.ieti.taskplanner.services;

import com.ieti.taskplanner.model.User;
import java.util.List;

/**
 *
 * @author Sergio
 */
public interface UserService {
    public List<User> getUsersList();

    public User getUserById(String userId);

    public User createUser(String userId, String name, String email, String password);

    public User updateUser(String userId, String name, String email, String password);

    public void removeUser(String userId);
}
