package com.stc.tracnghiembe;

import com.stc.tracnghiembe.entities.User;
import com.stc.tracnghiembe.repositories.UserRepository;
import com.stc.tracnghiembe.utils.EnumRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TracNghiemBeApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(TracNghiemBeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0) {
            User user = new User("thangpx", "thangpx@hcmute.edu.vn", "123456",
                    Arrays.asList(EnumRole.ROLE_ADMIN.name()));
            userRepository.save(user);
        }
    }
}
