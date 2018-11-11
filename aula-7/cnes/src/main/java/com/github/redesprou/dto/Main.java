package com.github.redesprou.dto;

public class Main {
	
	public static void main(String[] args) {
		IdentificadorDTO identificadorDTO = new IdentificadorDTO();
		identificadorDTO.setId(1l);
		identificadorDTO.setArea(20l);
		
		//identificadorDTO.toXML("identificadorX");
		
		String json = identificadorDTO.toJson();
		
		System.out.println(json);
	}
	
	
}
