package com.hfuu.graduate.mapper;

import com.hfuu.graduate.entity.ComponentByType;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface ComponentByTypeMapper {
    @Delete({
        "delete from by_component_type",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cid);

    @Insert({
        "insert into by_component_type (cid, cname, ",
        "create_time)",
        "values (#{cid,jdbcType=INTEGER}, #{cname,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=DATE})"
    })
    int insert(ComponentByType record);

    @Select({
        "select",
        "cid, cname, create_time",
        "from by_component_type",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cname", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.DATE)
    })
    ComponentByType selectByPrimaryKey(Integer cid);

    @Select({
        "select",
        "cid, cname, create_time",
        "from by_component_type",
        "order by create_time desc"
    })
    @Results({
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cname", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.DATE)
    })
    List<ComponentByType> selectAll();

    @Update({
        "update by_component_type",
        "set cname = #{cname,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=DATE}",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ComponentByType record);
}