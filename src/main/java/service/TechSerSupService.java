package service;

import java.util.List;

import pojo.TechSerSup;

public interface TechSerSupService {
	TechSerSup add(int ent_id, String title, String text);

	boolean delete(int id);

	List<TechSerSup> searchByAdmin(int state, int ind_id);

	/*搜索
	 * 行业id
	 * 标题*/
	List<TechSerSup> searchByUser(int ind_id, String title);

	// 企业用户搜寻自己所有发布
	List<TechSerSup> listByEntId(int id);

	TechSerSup show(int id);

	boolean changeState(int id, int state);

	boolean changeInfo(int id, TechSerSup req);
}
