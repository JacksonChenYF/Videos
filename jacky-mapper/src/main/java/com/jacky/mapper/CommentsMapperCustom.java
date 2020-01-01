package com.jacky.mapper;

import java.util.List;

import com.jacky.pojo.Comments;
import com.jacky.pojo.vo.CommentsVO;
import com.jacky.utils.MyMapper;

public interface CommentsMapperCustom extends MyMapper<Comments> {
	
	public List<CommentsVO> queryComments(String videoId);
}