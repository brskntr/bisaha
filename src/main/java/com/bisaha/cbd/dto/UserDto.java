package com.bisaha.cbd.dto;

import lombok.Data;

import java.io.Serializable;


@Data
public class UserDto implements Serializable {
    private String fullName;

    private String password;

    private String email;

    private String phoneNumber;
}
