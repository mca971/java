package com.synchrony.album.service;

import com.synchrony.album.model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public User saveUser(User user);

	public User getUser(Long userId);
}
