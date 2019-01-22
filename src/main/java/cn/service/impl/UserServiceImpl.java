package cn.service.impl;

import cn.dao.UserMapper;
import cn.pojo.User;
import cn.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(User user) {
        List<User> users = userMapper.getUser(user);
        if (users.size() == 0) {
            return null;
        }
        return users.get(0);
    }


}
