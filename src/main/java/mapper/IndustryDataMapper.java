package mapper;

import java.util.List;

import pojo.IndustryData;

public interface IndustryDataMapper {

	public IndustryData get(int id);

	public List<IndustryData> list();

	public List<IndustryData> search(String indId, String title);

	// public List<IndustryData> searchBydate(String dateBeg, String dateEnd);
}
