package com.stc.tracnghiembe.services.user;

import com.stc.tracnghiembe.dtos.user.UserDto;
import com.stc.tracnghiembe.entities.User;
import org.springframework.data.domain.Page;

import java.security.Principal;
import java.util.List;

/**
 * Created by: IntelliJ IDEA
 * User      : thangpx
 * Date      : 3/15/23
 * Time      : 9:01 AM
 * Filename  : UserService
 */
public interface UserService {

    Page<User> filter(String search,
                      int page, int size, String sort, String column);

    List<User> getAllUsers(String search);

    User getUser(String id);

    User getUserByEmail(String email);

    User create(UserDto dto, Principal principal);

    User update(String id, UserDto dto, Principal principal);

    User changeStatus(String id, Principal principal);
}
