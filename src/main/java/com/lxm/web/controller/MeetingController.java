package com.lxm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxm.bean.Meeting;
import com.lxm.service.MeetingService1;
@RestController
public class MeetingController {
	@Autowired
	MeetingService1 meetingService;
	
	@RequestMapping("select")
	public Meeting selectById() {
		Meeting meeting = meetingService.selectById("123456");
		return meeting;
	}
}
