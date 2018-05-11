package com.qishun.qishunstudy;

import com.qishun.qishunstudy.model.UserDomain;
import com.qishun.qishunstudy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QishunstudyApplicationTests {
	@Autowired
	private UserService service;

	@Test
	public void contextLoads() {
          List<UserDomain> userDomains= service.findAllUser(1,3);
		for (UserDomain user:userDomains) {
			System.out.println(user.toString());
		}

	}

}
