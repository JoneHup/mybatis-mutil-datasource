package com.run.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.run.domain.City;
import com.run.ds.DataSourceConst;
import com.run.ds.DataSourceHandle;
/**
 * @author JoneHup
 * 多数据源 --spring&mybatis
 * 测试类
 * 2017年6月14日
 */
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CityServiceTest {

	@Autowired
	private CityService cityService;
	
	@Test
	public void testFindCityById() {
		//使用第二数据源
		//DataSourceHandle.setDataSourceType(DataSourceConst.SJBDB);
		//默认使用第一数据源
		City city = cityService.findCityById(1);
		System.out.println(city);
	}
}
