package service;

import java.util.List;

import pojo.Admin;

public interface AdminService {
	// 成功返回对象设置session;失败返回null
	Admin login(String username, String password);

	List<Admin> list();

	boolean add(Admin admin);

	boolean resetPasswork(Admin admin);

}
