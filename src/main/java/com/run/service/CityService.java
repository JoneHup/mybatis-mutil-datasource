package com.run.service;

import com.run.domain.City;

public interface CityService {
	
	/**
	 * @param id
	 * @return
	 */
	City findCityById(int id);
}
