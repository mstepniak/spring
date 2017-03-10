package hello;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String hello(Locale locale, Model model) {
		model.addAttribute("greeting", new Greeting());

		//Date date = new Date();
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		//String formattedDate = dateFormat.format(date);
		//model.addAttribute("currentTime", formattedDate);

		return "hello";
	}
	/**
	@GetMapping("/")
	public String dataForm(Model model) {
		model.addAttribute("hello", new Greeting());
		return "hello";
	}
*/
	@PostMapping("/hello")
	public String dataSubmit(@ModelAttribute Greeting data) {
		return "result";
	}

}