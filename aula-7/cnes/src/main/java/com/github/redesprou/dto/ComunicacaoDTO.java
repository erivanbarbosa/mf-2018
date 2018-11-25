package com.github.redesprou.dto;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;

@XmlRootElement()
public class ComunicacaoDTO {
	private String nomeIndividuo;
	private String descricaoMeio;
	private String alternativoMeio;
	private String descricaoPreferencia;
	private String descricaoUso;
	private String alternativoUso;

	
	public void toXML(String filename) {
		try {
			JAXBContext context;
			context = JAXBContext.newInstance(ComunicacaoDTO.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			File file = new File("src/main/resources/" + filename + ".xml");
			m.marshal(this, file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public ComunicacaoDTO fromXML(String filename) {
		ComunicacaoDTO comunicacao = null;
		try {
			File arquivo = new File("src/main/resources/" + filename + ".xml");
			arquivo.createNewFile();
			JAXBContext context = JAXBContext.newInstance(ComunicacaoDTO.class);
			Unmarshaller un = context.createUnmarshaller();
			comunicacao = (ComunicacaoDTO) un.unmarshal(new FileReader(arquivo));
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		}

		return comunicacao;
	}

	public String toJson() {
		Gson gson = new Gson();
		String json = gson.toJson(this);

		return json;
	}

	public ComunicacaoDTO fromJson(String json) {
		Gson gson = new Gson();
		ComunicacaoDTO comunicacao = gson.fromJson(json, ComunicacaoDTO.class);

		return comunicacao;
	}
	
	public String getNomeIndividuo() {
		return nomeIndividuo;
	}

	public void setNomeIndividuo(String nomeIndividuo) {
		this.nomeIndividuo = nomeIndividuo;
	}

	public String getDescricaoMeio() {
		return descricaoMeio;
	}

	public void setDescricaoMeio(String descricaoMeio) {
		this.descricaoMeio = descricaoMeio;
	}

	public String getAlternativoMeio() {
		return alternativoMeio;
	}

	public void setAlternativoMeio(String alternativoMeio) {
		this.alternativoMeio = alternativoMeio;
	}

	public String getDescricaoPreferencia() {
		return descricaoPreferencia;
	}

	public void setDescricaoPreferencia(String descricaoPreferencia) {
		this.descricaoPreferencia = descricaoPreferencia;
	}

	public String getDescricaoUso() {
		return descricaoUso;
	}

	public void setDescricaoUso(String descricaoUso) {
		this.descricaoUso = descricaoUso;
	}

	public String getAlternativoUso() {
		return alternativoUso;
	}

	public void setAlternativoUso(String alternativoUso) {
		this.alternativoUso = alternativoUso;
	}

}
