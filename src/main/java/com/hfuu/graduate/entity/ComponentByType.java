package com.hfuu.graduate.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.util.Date;
@Data
@ApiOperation(value = "表单实体属性")
public class ComponentByType {
    private Integer cid;

    private String cname;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date createTime;
}