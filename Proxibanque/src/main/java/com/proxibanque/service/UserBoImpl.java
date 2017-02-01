package com.proxibanque.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.proxibanque.dao.UserDao;
import com.proxibanque.domaine.User;

@Named
public class UserBoImpl implements UserBo {
	
	@Autowired
	private UserDao userDao;
//	private ClassPathXmlApplicationContext appContext;

	@Override
	public String getMessage() {
		
		return "Hello!";
		
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserBoImpl() {
		super();
	}

	@Override
	public void save(User user) {
		
		//chargement du contexte
//		appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//récupération d'un bean (dao)
//		userDao = (UserDao) appContext.getBean("userDao");
		
		//utilisation du bean (insertion en base)
		userDao.save(user);
	}
	
}
