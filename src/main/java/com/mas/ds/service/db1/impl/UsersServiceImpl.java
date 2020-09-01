package com.mas.ds.service.db1.impl;

import com.mas.ds.config.DBTypeEnum;
import com.mas.ds.config.DbContextHolder;
import com.mas.ds.mapper.FootprintsMapper;
import com.mas.ds.mapper.TbPosMapper;
import com.mas.ds.mapper.UsersMapper;
import com.mas.ds.service.db1.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersMapper usersMapper;

    @Autowired
    FootprintsMapper footprintsMapper;

    @Autowired
    TbPosMapper tbPosMapper;

    public List<Map<String, Integer>> getAllCount() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, Integer> map3 = new HashMap<>();
        List<Map<String, Integer>> lst = new ArrayList<>();
        //使用db1
        DbContextHolder.setDbType(DBTypeEnum.db1);
        int userCount = usersMapper.listCount();
        map1.put("userCount", userCount);
        lst.add(map1);

        //使用db2
        DbContextHolder.setDbType(DBTypeEnum.db2);
        int footCount = footprintsMapper.listCount();
        map2.put("footCount", footCount);
        lst.add(map2);

        //使用db3
        DbContextHolder.setDbType(DBTypeEnum.db3);
        int posCount = tbPosMapper.listCount();
        map3.put("posCount", posCount);
        lst.add(map3);

        return lst;
    }
}
