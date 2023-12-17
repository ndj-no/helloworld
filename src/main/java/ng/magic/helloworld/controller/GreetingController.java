package ng.magic.helloworld.controller;

import ng.magic.helloworld.dto.CommonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@GetMapping("/hello-world")
	public Object helloworld() {
		return new CommonResponse<>("Hello world");
	}

}
