package com.api.project.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginInfo {
    private String token;
    private String username;
    private String userAvatar;
}
