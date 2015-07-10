package com.xiaoy.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * 基础DAO，用于存放公用方法和注入SessionFactory
 *
 * @author XiaoY
 * @date: 
 * 2015年7月7日 下午3:11:01
 */
public class Basic
{
	@Resource
	private SessionFactory sessionFactory;
	
	public Session getSession()
	{
		return this.sessionFactory.getCurrentSession();
	}
}
