package com.github.redesprou.dto;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;

public class EnderecoDTO {
	private String individuoNome;
	private String bairro;
	private String distrito;
	private String municipio;
	private String estado;
	private String pais;
	private String linhaEndereco;
	private Long ordemEndereco;
	private String cep;
	private String caixaPostal;
	private String tipoEndereco;
	private Date dataInicial;
	private String dataInicialAcuracia;
	private Date dataFinal;
	private String dataFinalAcuracia;
	
	
	public void toXML(String filename) {
		try {
			JAXBContext context;
			context = JAXBContext.newInstance(EnderecoDTO.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			File file = new File("src/main/resources/" + filename + ".xml");
			m.marshal(this, file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public EnderecoDTO fromXML(String filename) {
		EnderecoDTO endereco = null;
		try {
			File arquivo = new File("src/main/resources/" + filename + ".xml");
			arquivo.createNewFile();
			JAXBContext context = JAXBContext.newInstance(EnderecoDTO.class);
			Unmarshaller un = context.createUnmarshaller();
			endereco = (EnderecoDTO) un.unmarshal(new FileReader(arquivo));
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		}

		return endereco;
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

	public String getIndividuoNome() {
		return individuoNome;
	}

	public void setIndividuoNome(String individuoNome) {
		this.individuoNome = individuoNome;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getLinhaEndereco() {
		return linhaEndereco;
	}

	public void setLinhaEndereco(String linhaEndereco) {
		this.linhaEndereco = linhaEndereco;
	}

	public Long getOrdemEndereco() {
		return ordemEndereco;
	}

	public void setOrdemEndereco(Long ordemEndereco) {
		this.ordemEndereco = ordemEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCaixaPostal() {
		return caixaPostal;
	}

	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}

	public String getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getDataInicialAcuracia() {
		return dataInicialAcuracia;
	}

	public void setDataInicialAcuracia(String dataInicialAcuracia) {
		this.dataInicialAcuracia = dataInicialAcuracia;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getDataFinalAcuracia() {
		return dataFinalAcuracia;
	}

	public void setDataFinalAcuracia(String dataFinalAcuracia) {
		this.dataFinalAcuracia = dataFinalAcuracia;
	}

}
