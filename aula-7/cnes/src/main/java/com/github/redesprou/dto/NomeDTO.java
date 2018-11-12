package com.github.redesprou.dto;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;

@XmlRootElement()
public class NomeDTO {
	private String nomes;
	private String sobrenomes;
	private String titulos;
	private String sufixos;
	private String nomePreferido;
	private String usoCondicionalDescricao;
	private String usoNomeDescricao;
	private Boolean isUsoNomeAlternativo;
	private Date dataInicial;
	private Date dataFinal;

	public void toXML(String filename) {
		try {
			JAXBContext context;
			context = JAXBContext.newInstance(NomeDTO.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			File file = new File("src/main/resources/" + filename + ".xml");
			m.marshal(this, file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public NomeDTO fromXML(String filename) {
		NomeDTO nome = null;
		try {
			File arquivo = new File("src/main/resources/" + filename + ".xml");
			arquivo.createNewFile();
			JAXBContext context = JAXBContext.newInstance(NomeDTO.class);
			Unmarshaller un = context.createUnmarshaller();
			nome = (NomeDTO) un.unmarshal(new FileReader(arquivo));
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		}

		return nome;
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

	public String getNomes() {
		return nomes;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}

	public String getSobrenomes() {
		return sobrenomes;
	}

	public void setSobrenomes(String sobrenomes) {
		this.sobrenomes = sobrenomes;
	}

	public String getTitulos() {
		return titulos;
	}

	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}

	public String getSufixos() {
		return sufixos;
	}

	public void setSufixos(String sufixos) {
		this.sufixos = sufixos;
	}

	public String getNomePreferido() {
		return nomePreferido;
	}

	public void setNomePreferido(String nomePreferido) {
		this.nomePreferido = nomePreferido;
	}

	public String getUsoCondicionalDescricao() {
		return usoCondicionalDescricao;
	}

	public void setUsoCondicionalDescricao(String usoCondicionalDescricao) {
		this.usoCondicionalDescricao = usoCondicionalDescricao;
	}

	public String getUsoNomeDescricao() {
		return usoNomeDescricao;
	}

	public void setUsoNomeDescricao(String usoNomeDescricao) {
		this.usoNomeDescricao = usoNomeDescricao;
	}

	public Boolean getIsUsoNomeAlternativo() {
		return isUsoNomeAlternativo;
	}

	public void setIsUsoNomeAlternativo(Boolean isUsoNomeAlternativo) {
		this.isUsoNomeAlternativo = isUsoNomeAlternativo;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

}
