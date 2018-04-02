package service;

import java.util.List;

import pojo.Enterprise;

public interface EnterpriseService {

	Enterprise login(String account, String password);

	boolean signupSave(String account, String password);

	boolean signupCheck(String account);

	boolean delete(int id);

	boolean changePassword(int id, String pw);

	boolean changeState(int id, int state);

	/*管理员搜索
	 * 状态
	 * 企业名
	 * 地址*/
	List<Enterprise> search(int state, String name, String add);

	Enterprise searchByAccount(String account);

}
