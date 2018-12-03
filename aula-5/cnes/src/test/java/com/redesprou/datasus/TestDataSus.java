package com.redesprou.datasus;

import org.junit.jupiter.api.Test;

class TestDataSus {

	@Test
	void test() throws Exception {
		String[] args = {"src/main/resources/datasusmin.zip", "teste.json"};
		ProgramaLeitorEstabelecimentosSaude.main(args);
	}

}
