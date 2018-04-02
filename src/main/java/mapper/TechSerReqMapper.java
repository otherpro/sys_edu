package mapper;

import java.util.List;
import pojo.TechSerReq;

public interface TechSerReqMapper {

	public int add(TechSerReq req);

	public void delete(int id);

	public TechSerReq getById(int id);

	public int update(TechSerReq req);

	/*
	 * 0审核未通过 1正常 2已匹配 3待审核
	 */
	public List<TechSerReq> search(TechSerReq req);
}
