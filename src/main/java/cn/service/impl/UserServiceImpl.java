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

    @Override
    public List<User> getUser2(User user) {
        return userMapper.getUser2(user);
    }

    @Override
    public boolean delid(Integer id) {
        return userMapper.delid(id);
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User getid(Integer id) {
        User user = userMapper.getid(id);
        return user;
    }


    @Override
    public boolean updUser(User user) {
        return userMapper.updUser(user);
    }

}
