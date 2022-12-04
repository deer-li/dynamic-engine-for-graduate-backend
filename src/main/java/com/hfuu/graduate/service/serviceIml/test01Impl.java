package com.hfuu.graduate.service.serviceIml;

import com.hfuu.graduate.entity.ComponentByType;
import com.hfuu.graduate.mapper.ComponentByTypeMapper;
import com.hfuu.graduate.service.test01;
import com.hfuu.graduate.utils.G;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author deer-li
 * @date 2022-11-27 09:05
 */
@Service
public class test01Impl implements test01 {

    @Resource
    private ComponentByTypeMapper componentByTypeMapper;

    @Override
    public G<List<ComponentByType>> toStr() {
        List<ComponentByType> componentByTypes = componentByTypeMapper.selectAll();
        return G.ok(componentByTypes);
    }
}
