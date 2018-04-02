package mapper;

import java.util.List;

import pojo.Industry;

public interface IndustryMapper {

	public Industry get(int id);

	public List<Industry> list();
}
