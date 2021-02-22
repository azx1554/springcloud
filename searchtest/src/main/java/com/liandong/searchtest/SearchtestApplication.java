package com.liandong.searchtest;

import com.liandong.dao.ICompanyMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("searchTest")
@MapperScan("com.liandong.dao")
public class SearchtestApplication {

    @Autowired
    private ICompanyMapper companyMapper;

    public static void main(String[] args) {
        SpringApplication.run(SearchtestApplication.class, args);
    }

    @RequestMapping("search")
    @ResponseBody
    public Object search(@RequestBody Map<String, Object> condition) {
        List<Map<String, Object>> test = companyMapper.test(condition);
        return test;
    }

}
