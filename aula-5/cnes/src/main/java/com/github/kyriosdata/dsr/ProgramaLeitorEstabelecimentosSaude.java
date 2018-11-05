/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.dsr;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public final class ProgramaLeitorEstabelecimentosSaude {

	private static final String urlString = "https://drive.google.com/file/d/16Z7qDp38pwtRpmPcDrszeEelZnVskuuk/view?usp=sharing";
	
    private static final Logger logger =
            LogManager.getLogger(ProgramaLeitorEstabelecimentosSaude.class);


    private ProgramaLeitorEstabelecimentosSaude() {
        // Apenas evita criação de instância.
    }

    /**
     * Ponto de entrada da aplicação. Apenas para ilustra chamada de método.
     *
     * @param args Ignorados.
     * @throws MalformedURLException 
     */
    public static void main(final String[] args) throws Exception {
    	logger.info("iniciado");    	
    	
    	DatasusFileReader datasusReader = new DatasusFileReader();
    	datasusReader.generateEstablishmentResume(urlString);

        
    }

}
