package com.github.redesprou.loinc;

import java.sql.SQLException;
import java.util.ArrayList;



public class LoincApplication {
	
	public static void main(String[] args) throws SQLException {
		
		
		Searcher application = new Searcher();
		
		ArrayList<LoincInformation> informations = application.pesquisar("blood");
	
		informations.forEach(information -> {
			System.out.println(information.toString());
			System.out.println();
		});
	}
}
