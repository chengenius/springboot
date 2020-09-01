package com.mas.ds.service.db1;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface UsersService {
    List<Map<String, Integer>> getAllCount();
}
