package edu.chinna.kadhira.beans;

import org.springframework.stereotype.Component;

@Component
public interface TextEditor {
	String writeText(String text);
}