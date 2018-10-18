package com.lxm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lxm.bean.Meeting;
import com.lxm.bean.Users;
import com.lxm.mapper.MeetingMapper;
import com.lxm.service.MeetingService1;
import com.lxm.service.UsersService;

@Service
public class MeetingServiceImpl implements MeetingService1{
	
	@Autowired
	MeetingMapper meetingMapper;
	@Reference
	UsersService UsersService;

	@Override
	public Meeting selectById(String uid) {
		Users users = UsersService.selectById(uid);
		
		Meeting meeting = meetingMapper.selectById(uid);
		
		meeting.setUsers(users);
		return meeting;
	}
}
