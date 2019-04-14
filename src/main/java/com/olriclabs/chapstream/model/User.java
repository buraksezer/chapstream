package com.olriclabs.chapstream.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.TimeZone;

@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"email", "username"}))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String email;

    private String firstName;
    private String lastName;
    private String about;
    private String profilePhotoKey;
    private TimeZone timeZone;
    private Date birthDate;
    private Boolean active;

    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;

    public User() {}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                "username=" + username +
                "email=" + email +
                "}";
    }
}
