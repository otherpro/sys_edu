package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.AdminMapper;
import pojo.Admin;
import service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminMapper adminMapper;

	@Override
	public Admin login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resetPasswork(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

}
