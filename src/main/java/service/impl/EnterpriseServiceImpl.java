package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.EnterpriseMapper;
import pojo.Enterprise;
import service.EnterpriseService;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
	@Autowired
	EnterpriseMapper enterpriseMapper;

	@Override
	public Enterprise login(String account, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean signupSave(String account, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean signupCheck(String account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changePassword(int id, String pw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeState(int id, int state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Enterprise> search(int state, String name, String add) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enterprise searchByAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}
}
