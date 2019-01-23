package cn.service.impl;

import cn.dao.DepartmentMapper;
import cn.pojo.Department;
import cn.pojo.Position;
import cn.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartment() {
        return departmentMapper.getDepartment();
    }
}
