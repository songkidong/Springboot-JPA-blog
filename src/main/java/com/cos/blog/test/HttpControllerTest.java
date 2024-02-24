package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(HTML 파일)
// @Controller

// 사용자가 요청 -> 응답(Data)
@RestController
@RequestMapping("/http")
public class HttpControllerTest {

	private static final String TAG = "HttpControllerTest : ";

	@GetMapping("/lombok")
	public String lombokTest() {
		Member m = Member.builder().username("ssar").password("12s34").email("ssar@nate.com").build();
		System.out.println(TAG + "getter : " + m.getUsername());
		m.setUsername("cos");
		System.out.println(TAG + "setter : " + m.getUsername());
		return "lombok test 완료";
	}

	// localhost:8080/http/get (select)
	// 인터넷 브라우저 요청은 무조건 get 요청밖에 할 수 없다.
	// get 방식으로 data를 요청할 때 쿼리스트링 방법 뿐
	@GetMapping("/get")
	public String getTest(Member m) {

		return "get 요청 :" + m.getId() + m.getUsername() + m.getPassword() + m.getEmail();
	}

	// localhost:8080/http/post (insert)
	@PostMapping("/post") // text/plain, application/json
	public String postTest(@RequestBody Member m) { // MessageConverter
		return "post 요청" + m.getId() + m.getUsername() + m.getPassword() + m.getEmail();
	}

	// localhost:8080/http/put (update)
	@PutMapping("/put")
	public String putTest(@RequestBody Member m) {
		return "put 요청" + m.getId() + m.getUsername() + m.getPassword() + m.getEmail();
	}

	// localhost:8080/http/delete (delete)
	@DeleteMapping("/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
