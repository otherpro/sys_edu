package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.IndustryDataMapper;
import pojo.IndustryData;
import service.IndustryDataService;

@Service
public class IndustryDataServiceImpl implements IndustryDataService {
	@Autowired
	IndustryDataMapper dataMapper;

	@Override
	public IndustryData show(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IndustryData> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IndustryData> search(String indId, String title) {
		// TODO Auto-generated method stub
		return null;
	}
}
