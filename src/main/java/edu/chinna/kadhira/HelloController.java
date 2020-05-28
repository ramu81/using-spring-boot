package edu.chinna.kadhira;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import edu.chinna.kadhira.beans.TextEditor;

@RestController
public class HelloController {
	
	@Autowired
	@Qualifier("FancyEditor")
	TextEditor fancyEditor;
	
	@RequestMapping("/")
	public String index() {
		return fancyEditor.writeText("Welcome to Spring world");
	}
	
}