package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//这里只能使用@RestController，不能使用@Controller，
//单独的@Controller（没有@ResponseBody）用于返回html页面，而我们没有文件名为"Hello Spring Boot"的html文件(jsp或ftl格式)
//@RestController注解等价于@Controller+@ResponseBody的结合
@RestController
@SpringBootApplication
public class QuickdemoApplication {

	@RequestMapping("/")
	public String index(){
		return "Hello Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(QuickdemoApplication.class, args);
	}
}
