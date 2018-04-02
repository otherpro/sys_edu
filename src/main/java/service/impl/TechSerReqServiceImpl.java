package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TechSerReqMapper;
import pojo.TechSerReq;
import service.TechSerReqService;

@Service
public class TechSerReqServiceImpl implements TechSerReqService{
	@Autowired
	TechSerReqMapper reqMapper;

	@Override
	public TechSerReq add(int ent_id, String title, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TechSerReq> searchByAdmin(int state, int ind_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TechSerReq> searchByUser(int ind_id, String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TechSerReq> listByEntId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TechSerReq show(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeState(int id, int state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeInfo(int id, TechSerReq req) {
		// TODO Auto-generated method stub
		return false;
	}
}
