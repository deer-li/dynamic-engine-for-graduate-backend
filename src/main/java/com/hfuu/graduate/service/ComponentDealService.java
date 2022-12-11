package com.hfuu.graduate.service;

import com.hfuu.graduate.entity.ComponentByType;

public interface ComponentDealService {

    Integer addComponentType(ComponentByType componentByType);

    Integer deleteComponentTypeById(Integer cid);

    Integer updateComponentTypeById(ComponentByType componentByType);


}
