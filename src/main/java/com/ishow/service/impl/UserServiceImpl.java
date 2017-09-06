package com.ishow.service.impl;

import com.ishow.entity.User;
import com.ishow.mapper.UserMapper;
import com.ishow.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cike
 * @since 2017-09-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
