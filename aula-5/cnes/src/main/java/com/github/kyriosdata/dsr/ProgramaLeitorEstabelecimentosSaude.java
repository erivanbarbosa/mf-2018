package com.github.kyriosdata.dsr;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public final class ProgramaLeitorEstabelecimentosSaude {
	// Usei o arquivo local porque o site para de funcionar frequentemente
	private static final String urlString = "src/main/resources/datasus.zip";
	
    private static final Logger logger = LogManager.getLogger(ProgramaLeitorEstabelecimentosSaude.class);

    public static void main(final String[] args) throws Exception {
    	logger.info("iniciado");    	
    	DatasusFileReader datasusReader = new DatasusFileReader();
    	datasusReader.generateEstablishmentResume(urlString);
    }
}
