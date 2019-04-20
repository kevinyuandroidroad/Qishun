package com.qishun.qishunstudy.controller;


import com.github.pagehelper.PageHelper;
import com.qishun.qishunstudy.model.SysUsers;
import com.qishun.qishunstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by qs.yu on 2019/4/12.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController<SysUsers,Integer>{

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;
    @Autowired
    private KafkaTemplate kafkaTemplate;

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

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String sendKafka() {
        try {
            String message = "messagesss";
            logger.info("kafka的消息={}",message);
            kafkaTemplate.send("test", "key", message);
            logger.info("发送kafka成功.");
        } catch (Exception e) {
            logger.error("发送kafka失败", e);
        }
        return "";
    }

    @Override
    protected SysUsers findById(Integer s) {
        return null;
    }
}