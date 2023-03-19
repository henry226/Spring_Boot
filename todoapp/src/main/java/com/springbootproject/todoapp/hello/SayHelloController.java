package com.springbootproject.todoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("hello-world")
	@ResponseBody
	public String printHelloWorld() {
		return "Hello World!";
	}
	
	@RequestMapping("hello-world-html")
	@ResponseBody
	public String printHelloWorldHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<!DOCTYPE html>");
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<h1>Hello World Heading</h1>");
		sb.append("<p>Hello World paragraph.</p>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
}
