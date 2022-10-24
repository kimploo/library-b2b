package com.kimploo.bmsb2b.user;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
  
  private static Map<Long, User> users = new HashMap<>();

  public void postUser(User user) {
    users.put(user.getUserId(), user);
  }

  public User patchUser(Long userId, String username) {
    User user = users.get(userId);
    user.setUsername(username);

    return users.put(userId, user);
  }

  public User getUser(Long userId) {
    return users.get(userId);
  }

  public void deleteUser(Long userId) {
    users.remove(userId);
  }

}
