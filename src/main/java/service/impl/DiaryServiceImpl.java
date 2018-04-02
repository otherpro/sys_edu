package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.DiaryMapper;
import pojo.Diary;
import service.DiaryService;

@Service
public class DiaryServiceImpl implements DiaryService {

	@Resource
	DiaryMapper diaryMapper;

	@Override
	public boolean add(Diary dia) {
		diaryMapper.add(dia);
		System.out.println("service diary here");
		return false;
	}

	@Override
	public List<Diary> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Diary getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(String dia_text) {
		// TODO Auto-generated method stub
		return false;
	}

	public void test() {
		System.out.println("test");
	}

	/*public static void main(String[] args) {
		DiaryService ds = new DiaryServiceImpl();
		Diary d = new Diary();
		d.setAdmin_id(1);
		d.setDia_object("1");
		d.setDia_text("2");
		d.setDia_time("2");
		d.setDia_type("3");
		ds.add(d);
		System.out.println("here");
	}*/
	/*@Test
	public void testAdd() {
		Diary d = new Diary();
		d.setAdmin_id(1);
		d.setDia_object("1");
		d.setDia_text("2");
		d.setDia_time("2");
		d.setDia_type("3");
		System.out.println(diaryMapper);
		// diaryMapper.add(d);
	
	}*/
}
