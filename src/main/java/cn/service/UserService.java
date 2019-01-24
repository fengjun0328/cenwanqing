package cn.service;

import cn.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    public User getUser(User user);
    public List<User> getUser2(User user);

    public boolean delid(Integer id);

    public boolean addUser(User user);


}
