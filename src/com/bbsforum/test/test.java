package com.bbsforum.test;


import java.util.List;
import java.util.Set;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.ws.rs.GET;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.bbsforum.biz.BoardBiz;
import com.bbsforum.biz.UserBiz;
import com.bbsforum.bizimpl.BoardBizImpl;
import com.bbsforum.bizimpl.UserBizImpl;
import com.bbsforum.dao.BoardDAO;
import com.bbsforum.daoimpl.BoardDaoImpl;
import com.bbsforum.entity.Board;
import com.bbsforum.entity.Childboard;

public class test {

	public static void main(String[] args) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		BoardDAO boardDAO=(BoardDAO) context.getBean("boardDao");
//		Set<Childboard> childBoard=boardDAO.getChildBoardList(1);
//		for (Childboard temp : childBoard) {
//			System.out.println(temp.getName());
//		}
		boardDAO.deleteChildBoard(3);
	}

	
}
