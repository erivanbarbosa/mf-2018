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
    	
    	String urlString = "https://drive.google.com/uc?authuser=0&id=16Z7qDp38pwtRpmPcDrszeEelZnVskuuk&export=download";
    			
    			
    	URL url = new URL(urlString);
    	URLConnection conectorURL = url.openConnection();
    	InputStream inputStream = conectorURL.getInputStream();
    	

        logger.info("iniciado");
        //System.out.println(Calendario.diaDaSemanaParaHoje());;
    }

}
