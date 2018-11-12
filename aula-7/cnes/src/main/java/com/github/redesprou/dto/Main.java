package com.github.redesprou.dto;

public class Main {
	
	public static void main(String[] args) {
		IdentificadorDTO identificadorDTO = new IdentificadorDTO();
		identificadorDTO.setIndividuoNome("Joao");
		identificadorDTO.setCartorio("antonio do pedro");
		
		//identificadorDTO.toXML("identificadorX");
		
		String json = identificadorDTO.toJson();
		
		System.out.println(json);
	}
	
	
}
