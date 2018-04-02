package mapper;

import java.util.List;
import pojo.Enterprise;

public interface EnterpriseMapper {

	public int add(Enterprise ent);

	public void delete(int id);

	public Enterprise getByAccount(String account);

	// 更新密码/状态
	public int update(Enterprise ent);

	/*搜索
	 * 状态
	 * 企业名
	 * 地址*/
	public List<Enterprise> list(Enterprise ent);

	/*使用pageHelper工具
	 * public int count();*/
}
