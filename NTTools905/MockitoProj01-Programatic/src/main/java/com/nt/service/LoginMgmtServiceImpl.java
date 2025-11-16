package com.nt.service;

import com.nt.dao.ILoginDAO;

public class LoginMgmtServiceImpl implements ILoginMgmtService {
	private ILoginDAO loginDAO;
	
	public LoginMgmtServiceImpl(ILoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Override
	public String login(String username, String pwd) {
		//validation
		if(username.equals("") || username.length() == 0 || pwd.equals("") || pwd.length()==0)
			throw new IllegalArgumentException("Invalid Inputs");
		//use DAO
		boolean Flag = loginDAO.authenticate(username, pwd);
		if(Flag) {
			return "Valid Credentials";
		}
		else {
			return "Invalid Credentials";
		}
	}

	@Override
	public String registerUser(String user, String pwd) {
		//validation
		if(user.equals("") || user.length()==0 || pwd.length() == 0 || pwd.equals(""))
			throw new IllegalArgumentException("Invalid Inputs");
		//use DAO
		int count = loginDAO.addUser(user, pwd);
		return count == 0 ? "User Not Added" : "User Added";
	}
}
