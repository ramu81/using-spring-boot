package edu.chinna.kadhira.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;
@Component
@Qualifier("FancyEditor")
public class FancyEditor implements TextEditor {
	
	public String writeText(String text) {
		return text.toLowerCase();
	}
}