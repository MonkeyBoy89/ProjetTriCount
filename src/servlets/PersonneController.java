package servlets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonneController {

	@RequestMapping(value="/user/{number}", method = RequestMethod.GET)
	@ResponseBody
	public int getCount(@PathVariable("number") int number){
	int result = number*2;
		return result;
	}

	
}
