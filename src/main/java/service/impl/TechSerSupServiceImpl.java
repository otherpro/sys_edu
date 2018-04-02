package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mapper.TechSerSupMapper;
import pojo.TechSerSup;
import service.TechSerSupService;

@Service
public class TechSerSupServiceImpl implements TechSerSupService {
	@Autowired
	TechSerSupMapper supMapper;

	@Override
	public TechSerSup add(int ent_id, String title, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TechSerSup> searchByAdmin(int state, int ind_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TechSerSup> searchByUser(int ind_id, String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TechSerSup> listByEntId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TechSerSup show(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeState(int id, int state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeInfo(int id, TechSerSup req) {
		// TODO Auto-generated method stub
		return false;
	}
}
