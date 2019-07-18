package com.wrj.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wrj.cms.dao.CommentMapper;
import com.wrj.cms.domain.Comment;
import com.wrj.cms.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentMapper commentMapper;

	@Override
	public void save(Comment comment) {
		commentMapper.save(comment);
	}
}
