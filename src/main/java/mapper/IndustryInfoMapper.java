package mapper;

import java.util.List;

import pojo.IndustryInfo;

public interface IndustryInfoMapper {

	public IndustryInfo get(int id);

	public List<IndustryInfo> list();

	public List<IndustryInfo> search(String indId, String title);

	// public List<IndustryInfo> searchBydate(String dateBeg, String dateEnd);
}
