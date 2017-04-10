package com.jun.rest.controller;
import java.util.HashMap;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jun.rest.service.SampleService;


@RestController
@RequestMapping(value = "/sample")
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

	@Inject
	SampleService sampleService;

	@RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
	public ResponseEntity<HashMap<String, Object>> getAge(@PathVariable("name") String name){
		logger.debug("샘플");
		ResponseEntity<HashMap<String, Object>> entity = null;
		try{
			HashMap<String, Object> age = sampleService.getAge(name);
			entity = new ResponseEntity<HashMap<String, Object>>(age,HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			entity = new ResponseEntity<HashMap<String, Object>>(HttpStatus.BAD_REQUEST);
		}
		return entity;
   }

}
