package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mapper.DiaryMapper;
import pojo.Diary;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private DiaryMapper diaMapper;

	@Test
	public void testList() {
		System.out.println("diaMapper");
		Diary d = new Diary();
		d.setAdmin_id(1);
		d.setDia_object("1");
		d.setDia_text("2");
		d.setDia_time("2");
		d.setDia_type("3");
		diaMapper.add(d);
	}

}
