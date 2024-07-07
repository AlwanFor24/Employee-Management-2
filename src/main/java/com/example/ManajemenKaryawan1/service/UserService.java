package com.example.ManajemenKaryawan1.service;


import com.example.ManajemenKaryawan1.dto.UserDto;
import com.example.ManajemenKaryawan1.model.Employee;
import com.example.ManajemenKaryawan1.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

    void deleteUserById(long id);



}
