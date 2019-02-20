package cn.dao;

import cn.pojo.Biz_leave;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Biz_leaveMapper {

    public List<Biz_leave> getBiz(@Param("biz_leave") Biz_leave biz_leave);

    public boolean delbiz(Integer id);

    public boolean bizadd(Biz_leave biz_leave);

}
