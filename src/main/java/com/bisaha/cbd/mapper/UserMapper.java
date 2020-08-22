package com.bisaha.cbd.mapper;

import com.bisaha.cbd.dto.UserDto;
import com.bisaha.cbd.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    @Autowired
    private ModelMapper modelMapper;

    public UserDto convertToDto(User post) {
        return modelMapper.map(post, UserDto.class);
    }

    public User convertToEntity(UserDto userDto){
        return modelMapper.map(userDto, User.class);
    }
}
