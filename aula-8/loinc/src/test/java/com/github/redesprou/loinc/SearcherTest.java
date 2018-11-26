package com.github.redesprou.loinc;


import java.util.ArrayList;

import org.junit.jupiter.api.Test;


class SearcherTest {
	
	@Test
	void showSearchResultsTest() {
		Searcher application = new Searcher();

		ArrayList<LoincInformation> informations = application.pesquisar("blood");

		informations.forEach(information -> {
			System.out.println(information.toString());
			System.out.println();
		});
	}
}
