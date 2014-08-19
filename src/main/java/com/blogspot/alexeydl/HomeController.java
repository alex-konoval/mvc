package com.blogspot.alexeydl;

import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	@RequestMapping(value = "/getCharNum", method = RequestMethod.GET)
	public @ResponseBody Response getCharNum(@RequestParam String text) { 
	
		Response result = new Response();

		if (text != null) {
			result.setText(text);
			result.setCount(text.length());
		}
		
		return result;
	}
}