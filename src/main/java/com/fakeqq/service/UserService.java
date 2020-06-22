package com.fakeqq.service;

import com.fakeqq.model.User;

public interface UserService {
    User getUserByAccount(String account);
    int addUser(User user);
}
