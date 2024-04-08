package com.fai.demoappclient.rets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
@RestController("/")
public class StudentController {
    @Autowired
    public RestTemplate restTemplate;
    @GetMapping("/student")
    public String index(){
        return restTemplate.getForObject("http://student-service:8200/student", String.class);
    }
}
