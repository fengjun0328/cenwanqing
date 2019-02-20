package cn.service.impl;

import cn.dao.FinancialMapper;
import cn.pojo.Biz_leave;
import cn.pojo.Financial;
import cn.service.FinancialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FinancialServiceImpl implements FinancialService {

    @Resource
    private FinancialMapper financialMapper;

    @Override
    public List<Financial> getFinancial(Financial financial) {
        return financialMapper.getFinancial(financial);
    }
    @Override
    public boolean delFinancial(Integer id){
        return financialMapper.delFinancial(id);
    }

    @Override
    public boolean addFinancial(Financial financial){
        return financialMapper.addFinancial(financial);
    }




}
