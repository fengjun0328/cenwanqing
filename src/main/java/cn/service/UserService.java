package cn.service;

import cn.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    public User getUser(User user);

}