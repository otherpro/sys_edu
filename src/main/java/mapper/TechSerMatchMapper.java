package mapper;

import java.util.List;

import pojo.TechSerMatch;

public interface TechSerMatchMapper {
	public int add(TechSerMatch match);

	public void delete(int id);

	public TechSerMatch get(int id);

	public List<TechSerMatch> list();

	public int count();
}
