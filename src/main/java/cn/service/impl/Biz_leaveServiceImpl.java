package cn.service.impl;

import cn.dao.Biz_leaveMapper;
import cn.pojo.Biz_leave;
import cn.service.Biz_leaveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Biz_leaveServiceImpl implements Biz_leaveService {

    @Resource
    private Biz_leaveMapper biz_leaveMapper;

    @Override
    public List<Biz_leave> getBiz(Biz_leave biz_leave) {
        return biz_leaveMapper.getBiz(biz_leave);
    }

    @Override
    public boolean delbiz(Integer id) {
        return biz_leaveMapper.delbiz(id);
    }

}
