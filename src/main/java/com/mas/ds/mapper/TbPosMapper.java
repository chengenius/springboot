package com.mas.ds.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mas.ds.model.db3.TbPosModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface TbPosMapper extends BaseMapper<TbPosModel> {
    //自定义方法
    int listCount();
}