package service;

import java.util.List;
import pojo.IndustryData;

public interface IndustryDataService {
	// 显示详情
	IndustryData show(int id);

	// 显示所有
	List<IndustryData> list();

	List<IndustryData> search(String indId, String title);

	/*按照日期显示
	 * 先不管了
	List<IndustryData> searchByData(String dateBeg, String dateEnd);*/
}
