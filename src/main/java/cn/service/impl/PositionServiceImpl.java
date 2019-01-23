package cn.service.impl;

import cn.dao.PositionMapper;
import cn.pojo.Position;
import cn.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Resource
    private PositionMapper positionMapper;

    @Override
    public List<Position> getPosition() {
        return positionMapper.getPosition();
    }


}
