package com.restconsume.consumedf55.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
	
	@RequestMapping(value = "/byteRequest", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.POST)
	@ResponseBody
	public String byteRequest(@RequestBody byte[] requestButes) {
		System.out.println(new String(requestButes));
		return new String(requestButes);
	}

}
