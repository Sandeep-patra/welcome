package in.sandeep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Client {
	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcome() {
		
		return "Welcome to Maharaju Health Care";
		
	}
}
