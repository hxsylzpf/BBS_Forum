package com.bbsforum.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.bbsforum.dao.MessageDao;

public class MessageAction extends BaseAction {

	@Autowired
	MessageDao messageDao;
	public MessageDao getMessageDao() {
		return messageDao;
	}
	
}
