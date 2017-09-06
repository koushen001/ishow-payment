package com.ishow.service.impl;

import com.alibaba.fastjson.JSON;
import com.ishow.entity.User;
import com.ishow.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author CIKE
 * @desc ${DESCRIPTION}
 * @create 2017-09-06 9:18
 **/
@RunWith(SpringJUnit4ClassRunner.class)//使用junit4进行测试
@ContextConfiguration({"/spring/spring.xml"})//加载配置文件
public class UserServiceImplTest {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImplTest.class);

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll() {
        List<User> users = userService.selectList(null);
        log.info(JSON.toJSONString(users));
    }
    @Test
    public void testAdd(){
        User user = new User();
        user.setPassword("123456");
        user.setUsername("admin");
        userService.insert(user);
    }
}