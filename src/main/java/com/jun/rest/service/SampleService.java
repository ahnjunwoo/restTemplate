package com.jun.rest.service;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jun.rest.dao.SampleDAO;

@Service
public class SampleService {

	@Inject
	SampleDAO samplemapper;

	public HashMap<String, Object> getAge(String name) {
		return samplemapper.getAge(name);
	}

}
