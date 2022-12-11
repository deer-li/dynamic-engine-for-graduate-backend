package com.hfuu.graduate.service.serviceIml;

import com.hfuu.graduate.entity.ComponentByType;
import com.hfuu.graduate.mapper.ComponentByTypeMapper;
import com.hfuu.graduate.service.ComponentDealService;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author deer-li
 * @date 2022-12-04 22:09
 */
@Service
public class ComponentDealServiceImpl implements ComponentDealService {

    @Resource
    private ComponentByTypeMapper componentByTypeMapper;
    @Override
    public Integer addComponentType(ComponentByType componentByType) {
        int insert = componentByTypeMapper.insert(componentByType);
        return insert;
    }

    @Override
    public Integer deleteComponentTypeById(Integer cid) {
        int delete = componentByTypeMapper.deleteByPrimaryKey(cid);
        return delete;
    }

    @Override
    public Integer updateComponentTypeById(ComponentByType componentByType) {
        int update = componentByTypeMapper.updateByPrimaryKey(componentByType);
        return update;
    }
}
