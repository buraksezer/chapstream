package com.olriclabs.chapstream.controllers.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.TimeZone;

@Getter
@Setter
public class UserRegistrationDto {
    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    private String email;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    private String about;

    private String profilePhotoKey;

    private TimeZone timeZone;

    @DateTimeFormat
    private Date birthDate;

    @AssertTrue
    private Boolean terms;
}
