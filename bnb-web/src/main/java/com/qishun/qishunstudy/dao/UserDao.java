package com.qishun.qishunstudy.dao;

import com.qishun.qishunstudy.model.SysUsers;

import java.util.List;

public interface UserDao {


    int insert(SysUsers record);


    List<SysUsers> selectUsers();
}
