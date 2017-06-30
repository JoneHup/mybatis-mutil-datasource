package com.run.dao;

import org.springframework.stereotype.Repository;

import com.run.domain.City;

@Repository
public interface CityDao {
	
	/**
	 * @param id
	 * @return
	 */
	City findCityById(int id);
}
