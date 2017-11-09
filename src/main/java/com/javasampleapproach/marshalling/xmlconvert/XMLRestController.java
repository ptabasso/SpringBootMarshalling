package com.javasampleapproach.marshalling.xmlconvert;

import com.javasampleapproach.marshalling.SpringBootMarshallingApplication;
import com.javasampleapproach.marshalling.model.Customer;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;


@RestController
public class XMLRestController {

    private static final Logger log = LoggerFactory.getLogger(SpringBootMarshallingApplication.class);


    @GetMapping("/customer")
    public Customer getCustomer() {
        return new Customer("Peter", "Smith", 30);
    }

    @PostMapping("/customer")
    public String postCustomer(@RequestBody Customer customer, HttpServletRequest request) {


        int age;
        age = customer.getAge();

        System.out.println(customer);
        System.out.println(age);


        log.info("Any value in log");


        Enumeration headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()){
            String key = (String)headerNames.nextElement();
            String val = request.getHeader(key);
            System.out.println(key+":"+val);
        }
        return "Done\n";
    }







}


