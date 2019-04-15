package com.voterapi.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CastVoteRequestModel {

    boolean vote;
    String address;
    String privatekey;
}
