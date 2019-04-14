package com.qishun.qishunstudy.controller;


import com.github.pagehelper.PageHelper;
import com.qishun.qishunstudy.model.SysUsers;
import com.qishun.qishunstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by qs.yu on 2019/4/12.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController<SysUsers,Integer>{

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/adduser")
    public int addUser(SysUsers user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/listusers")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        //开始分页
        PageHelper.startPage(pageNum,pageSize);
        return userService.findAllUser(pageNum,pageSize);
    }

    @Override
    protected SysUsers findById(Integer s) {
        return null;
    }
}