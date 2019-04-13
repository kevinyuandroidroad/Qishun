package com.qishun.qishunstudy.service;

import com.qishun.qishunstudy.model.UserDomain;

import java.util.List;

/**
 * Created by qs.yu on 2018/4/19.
 */
public interface UserService {

    int addUser(UserDomain user);

    List<UserDomain> findAllUser(int pageNum, int pageSize);
}
