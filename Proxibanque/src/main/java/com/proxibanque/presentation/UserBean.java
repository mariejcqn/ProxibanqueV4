package com.proxibanque.presentation;


import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.proxibanque.domaine.User;
import com.proxibanque.service.UserBo;

@Named
@Scope("session")
public class UserBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UserBo userBo;
	@Inject
	private User user;
	
	
	public void setUser(User user) {
		this.user = user;
	}

	public UserBo getUserBo() {
		return userBo;
	}

	public User getUser() {
		return user;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String printMsgFromSpring() {
		return userBo.getMessage();
	}
	
	public String save() {
		userBo.save(user);
		user.setId(0L);
		return "/default.xhtml?faces-redirect=true";
	}
	
}
