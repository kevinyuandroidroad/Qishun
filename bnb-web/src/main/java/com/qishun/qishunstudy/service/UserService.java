package com.qishun.qishunstudy.service;

import com.qishun.qishunstudy.model.SysUsers;

import java.util.List;

/**
 * Created by qs.yu on 2018/4/19.
 */
public interface UserService {

    int addUser(SysUsers user);

    List<SysUsers> findAllUser(int pageNum, int pageSize);
}
