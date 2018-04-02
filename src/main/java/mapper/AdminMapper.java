package mapper;

import java.util.List;

import pojo.Admin;

public interface AdminMapper {
	public int add(Admin admin);

	public Admin getByAccount(String account);

	public int update(Admin admin);

	public List<Admin> list();

}
