package service;

import java.util.List;

import pojo.TechSerReq;

public interface TechSerReqService {

	TechSerReq add(int ent_id, String title, String text);

	boolean delete(int id);

	List<TechSerReq> searchByAdmin(int state, int ind_id);

	/*搜索
	 * 行业id
	 * 标题*/
	List<TechSerReq> searchByUser(int ind_id, String title);

	// 企业用户搜寻自己所有发布
	List<TechSerReq> listByEntId(int id);

	TechSerReq show(int id);

	boolean changeState(int id, int state);

	boolean changeInfo(int id, TechSerReq req);

}
