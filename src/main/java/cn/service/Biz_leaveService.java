package cn.service;

import cn.pojo.Biz_leave;

import java.util.List;

public interface Biz_leaveService {

    public List<Biz_leave> getBiz(Biz_leave biz_leave);

    public boolean delbiz(Integer id);

}
