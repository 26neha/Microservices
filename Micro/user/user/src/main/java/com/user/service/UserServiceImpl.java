package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //fake user list
    List<User> list = List.of(
            new User(7890L, "Neha Singh", "9087543210"),
            new User(1234L, "Ankit Dubey", "8799789979"),
            new User(7899L, "Ravi Jha", "8954329054"),
            new User(4578L,"ABC", "8954328906")
    );

    @Override
    public User getUser(Long id) {
        //calling stream in list, then filter user & then get user id
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

}
