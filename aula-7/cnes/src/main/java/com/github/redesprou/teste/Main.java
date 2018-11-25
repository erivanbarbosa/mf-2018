package com.github.redesprou.teste;

import com.github.redesprou.dto.ComunicacaoDTO;
import com.github.redesprou.dto.IdentificadorDTO;

import validator.XMLValidator;

public class Main {
	
	public static void main(String[] args) {
		/*IdentificadorDTO identificadorDTO = new IdentificadorDTO();
		identificadorDTO.setIndividuoNome("Joao");
		identificadorDTO.setCartorio("antonio do pedro");
		
		//identificadorDTO.toXML("identificadorX");
		
		String json = identificadorDTO.toJson();
		
		System.out.println(json);*/
		
/*		ComunicacaoDTO dto = new ComunicacaoDTO();
		dto.setAlternativoMeio("alternativoMeio");
		dto.setAlternativoUso("alternativoUso");
		dto.setDescricaoMeio("descricao Meio");
		dto.setDescricaoPreferencia("descricao Preferencia");
		dto.setNomeIndividuo("Joao");
		
		dto.toXML("comunicacao");*/
		
		XMLValidator validadorXML = new XMLValidator();
		validadorXML.validate();
	}
	
	
}
