package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspControllerTest {
	
	@GetMapping("/test/jsp")
	public String jsp() {
		return "test";
	}
}
