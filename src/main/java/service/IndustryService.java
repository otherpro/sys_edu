package service;

import java.util.List;

import pojo.Industry;

public interface IndustryService {

	List<Industry> list();

	Industry getById(int id);
}
