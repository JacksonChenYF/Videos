package com.jacky.mapper;

import java.util.List;

import com.jacky.pojo.SearchRecords;
import com.jacky.utils.MyMapper;

public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
	
	public List<String> getHotwords();
}