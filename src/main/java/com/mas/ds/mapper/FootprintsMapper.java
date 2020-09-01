package com.mas.ds.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mas.ds.model.db2.FootprintsModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface FootprintsMapper extends BaseMapper<FootprintsModel> {
    //自定义方法
    int listCount();
}
