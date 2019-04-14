package com.qishun.qishunstudy.model;

import lombok.Data;

@Data
public class SysUsers {
    private Integer userId;

    private String userName;

    private String password;

    private String phone;
}
