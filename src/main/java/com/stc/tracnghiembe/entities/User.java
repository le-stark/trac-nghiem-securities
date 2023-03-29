package com.stc.tracnghiembe.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: IntelliJ IDEA
 * User      : thangpx
 * Date      : 3/15/23
 * Time      : 8:46 AM
 * Filename  : User
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class User extends BaseEntity {
    @Id
    private String id;

    private String name;

    private String email;

    @JsonIgnore
    private String password;


    private List<String> roles = new ArrayList<>();

    private boolean trangThai = true;

    public User(String name, String email, String password, List<String> roles) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
}
