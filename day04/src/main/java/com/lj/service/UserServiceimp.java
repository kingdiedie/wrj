package com.lj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lj.bean.User;
import com.lj.mapper.UserMapper;
@Service
@Transactional
public class UserServiceimp implements UserService{
@Autowired
private UserMapper mapper;
	@Override
	public List<User> getlist() {
		// TODO Auto-generated method stub
		return mapper.getlist();
	}

}
