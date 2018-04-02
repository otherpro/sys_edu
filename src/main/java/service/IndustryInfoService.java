package service;

import java.util.List;
import pojo.IndustryInfo;

public interface IndustryInfoService {
	public IndustryInfo show(int id);

	public List<IndustryInfo> list();

	public List<IndustryInfo> search(String indId, String title);

	// public List<IndustryInfo> searchBydate(String dateBeg, String dateEnd);
}
