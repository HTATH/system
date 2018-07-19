package system.service.impl;

import org.springframework.stereotype.Service;

import system.entity.User;
import system.service.UserService;

@Service("userService2")
public class AnotherUserServiceImpl implements UserService{

	public User getById(long userId) {
		User user = new User();
		user.setUserId(userId);
		return user;
	}

}
