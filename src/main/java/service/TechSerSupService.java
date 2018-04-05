package service;

import java.util.List;

import pojo.TechSerSup;

public interface TechSerSupService {

	TechSerSup add(TechSerSup sup);

	boolean delete(int id);

	List<TechSerSup> searchByAdmin(TechSerSup sup);

	/*搜索
	 * 行业id
	 * 标题*/
	List<TechSerSup> searchByUser(TechSerSup sup);

	// 企业用户搜寻自己所有发布
	List<TechSerSup> listByEnt(TechSerSup sup);

	TechSerSup show(int id);

	boolean changeState(TechSerSup sup);

	boolean changeInfo(TechSerSup sup);
}
