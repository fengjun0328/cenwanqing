package cn.dao;

import cn.pojo.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public List<User> getUser(@Param("user")User user);

}
