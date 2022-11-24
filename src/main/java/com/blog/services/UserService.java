package com.blog.services;

import com.blog.dto.RegisterDto;
import com.blog.entities.User;

public interface UserService {

    void saveUser(RegisterDto registerDto);

    User findByEmail(String email);

}
