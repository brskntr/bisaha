package com.bisaha.cbd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GenericResponse {
    private Object data;
    private String message;
}
