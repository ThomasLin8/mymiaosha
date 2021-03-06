package com.example.mymiaosha3.dao;

import com.example.mymiaosha3.domain.MiaoshaUser;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MiaoshaUserDao {

    @Select("select * from miaosha_user where id = #{id}")
    public MiaoshaUser getById(@Param("id") long id);    //入参为long类型
}
