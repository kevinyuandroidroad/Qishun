package com.qishun.qishunstudy.dao;

import com.qishun.qishunstudy.model.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}
