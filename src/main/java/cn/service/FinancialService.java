package cn.service;

import cn.pojo.Financial;

import java.util.List;

public interface FinancialService {

    public List<Financial> getFinancial(Financial financial);

    public boolean delFinancial(Integer id);

    public boolean addFinancial(Financial financial);


}
