package com.run.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.run.dao.CityDao;
import com.run.domain.City;
import com.run.service.CityService;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityDao cityDao;
	
	@Override
	public City findCityById(int id) {
		return cityDao.findCityById(id);
	}
	
}
