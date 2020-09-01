package com.mas.ds.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mas.ds.model.db1.UsersModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UsersMapper extends BaseMapper<UsersModel> {
    //自定义方法
    int listCount();
}