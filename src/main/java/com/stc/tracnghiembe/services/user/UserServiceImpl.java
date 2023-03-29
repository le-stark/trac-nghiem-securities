package com.stc.tracnghiembe.services.user;

import com.stc.tracnghiembe.dtos.user.UserDto;
import com.stc.tracnghiembe.entities.User;
import com.stc.tracnghiembe.exceptions.NotFoundException;
import com.stc.tracnghiembe.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

/**
 * Created by: IntelliJ IDEA
 * User      : thangpx
 * Date      : 3/15/23
 * Time      : 9:02 AM
 * Filename  : UserServiceImpl
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Page<User> filter(String search, int page, int size, String sort, String column) {
        return null;
    }

    @Override
    public List<User> getAllUsers(String search) {
        return null;
    }

    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.getUser(email)
                .orElseThrow(() -> new NotFoundException(String.format("User with email %s does not exist", email)));
    }

    @Override
    public User create(UserDto dto, Principal principal) {
        return null;
    }

    @Override
    public User update(String id, UserDto dto, Principal principal) {
        return null;
    }

    @Override
    public User changeStatus(String id, Principal principal) {
        return null;
    }
}
