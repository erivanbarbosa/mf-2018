package com.redesprou.datasus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ProgramaLeitorEstabelecimentosSaude {
    private static final Logger logger = LogManager.getLogger(ProgramaLeitorEstabelecimentosSaude.class);

    public static void main(final String[] args) throws Exception {
    	logger.info("iniciado");    	
    	DatasusFileReader datasusReader = new DatasusFileReader();
    	datasusReader.generateEstablishmentResume(args[0], args[1]);
    }
}
