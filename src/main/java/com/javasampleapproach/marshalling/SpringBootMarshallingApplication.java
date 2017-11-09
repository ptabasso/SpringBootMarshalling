package com.javasampleapproach.marshalling;

import com.javasampleapproach.marshalling.xmlconvert.XmlConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringBootMarshallingApplication {
	@Resource
	XmlConverter xmlConverter;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMarshallingApplication.class, args);
	}

}
