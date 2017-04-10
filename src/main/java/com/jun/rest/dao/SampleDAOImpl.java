package com.jun.rest.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class SampleDAOImpl implements SampleDAO{

	@Override
	public HashMap<String, Object> getAge(String name) {
		HashMap<String, Object> age = new HashMap<String, Object>();
		age.put("age", "32");
		return age;
	}

}
