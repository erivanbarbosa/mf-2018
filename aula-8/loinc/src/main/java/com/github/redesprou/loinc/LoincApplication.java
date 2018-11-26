package com.github.redesprou.loinc;

import java.util.ArrayList;

public class LoincApplication {
	
	public static void main(String[] args) {
		Searcher application = new Searcher();
		
		ArrayList<LoincInformation> information = application.pesquisar("asdf");
	
		System.out.println(information.toString());
	}
}
