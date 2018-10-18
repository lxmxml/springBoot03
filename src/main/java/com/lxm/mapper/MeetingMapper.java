package com.lxm.mapper;

import org.springframework.stereotype.Repository;

import com.lxm.bean.Meeting;

@Repository
public class MeetingMapper {
	public Meeting selectById(String uid) {
		Meeting m = new Meeting();
		m.setId(uid);
		m.setTitle("SpringBoot整合Dubbo");
		return m;
	}
}
