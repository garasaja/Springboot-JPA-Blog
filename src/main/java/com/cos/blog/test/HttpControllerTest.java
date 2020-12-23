package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청시 응답을 HTML파일로 하려면
// @Controller씀

//restcontroller이란 사용자가 요청 -> 응답(data)
@RestController
public class HttpControllerTest {
	
	// http://localhost:8080/get
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get 요청 : " + m.getId() ; // 왜안되ㅇㄴ
	}

	// http://localhost:8080/post
	@PostMapping("/http/post")
	public String postTest() {
		return "post 요청";
	}
	
	// http://localhost:8080/put
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}
	
	// http://localhost:8080/delete
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
