package com.voterapi.demo.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDataDTO {

    @ApiModelProperty(position = 0)
    private String email;
    @ApiModelProperty(position = 1)
    private String username;
    @ApiModelProperty(position = 2)
    String password;
    @ApiModelProperty(position = 3)
    String role;
}
