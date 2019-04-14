package com.qishun.qishunstudy;

import com.qishun.qishunstudy.model.SysUsers;
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
          List<SysUsers> SysUserss= service.findAllUser(1,3);
		for (SysUsers user:SysUserss) {
			System.out.println(user.toString());
		}

	}

}
