package com.ishow.web;


import com.ishow.common.ServerResponse;
import com.ishow.entity.User;
import com.ishow.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author cike
 * @since 2017-09-06
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public ServerResponse list() {
        List<User> users = userService.selectList(null);
        return ServerResponse.createBySuccess(users);
    }

    @RequestMapping("/save")
    @ResponseBody
    public ServerResponse save(User user) {
        userService.insertOrUpdate(user);
        return ServerResponse.createBySuccess(user);
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public ServerResponse delete(@PathVariable Long id) {
        userService.deleteById(id);
        return ServerResponse.createBySuccess();
    }

}
