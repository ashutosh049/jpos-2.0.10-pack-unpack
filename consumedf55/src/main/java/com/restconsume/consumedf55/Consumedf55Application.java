package com.restconsume.consumedf55;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Consumedf55Application {

	private static RestTemplate restTemplate = new RestTemplate();
	private static final String baseURL = "http://localhost:8080/student-services-0.0.1-SNAPSHOT/";
//	private static final String baseURL = "http://localhost:8080/student-services-0.0.1-SNAPSHOT/students/Student1/courses/Course1";
	
	public static void main(String[] args) throws JSONException {
		SpringApplication.run(Consumedf55Application.class, args);
		
		RequestPreparer preparer = new RequestPreparer();
		byte[] requestBytes = new byte[1];
		
        try {
            requestBytes = preparer.getRequestBytes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);

        JSONObject json = new JSONObject();
        json.put("requestBytes", requestBytes);
        
        HttpEntity<String> entity = new HttpEntity<String>(json.toString() ,headers);
		  String responseBytes = restTemplate.postForObject(baseURL+"byteRequest", entity, String.class);
		  
		  /*JSONObject jsonObj = new JSONObject(response);
		  String balance = jsonObj.get("data").toString();*/
		  
		  System.out.println(">>>>>>>>>>>>\n" +responseBytes+"\n<<<<<<<<<<<<<<<");
		
	}
}
