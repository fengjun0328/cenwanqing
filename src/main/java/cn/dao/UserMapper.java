package cn.dao;

import cn.pojo.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public List<User> getUser(@Param("user")User user);

    public List<User> getUser2(@Param("user")User user);

    public boolean delid(Integer id);

    public boolean addUser(User user);

}
