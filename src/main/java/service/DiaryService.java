package service;

import java.util.List;

import pojo.Diary;

public interface DiaryService {

	boolean add(Diary dia);

	List<Diary> list();

	Diary getById(int id);

	// 更改备注
	boolean update(String dia_text);

	void test();

}
