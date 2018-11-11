package com.github.redesprou.dto;

import java.util.Date;

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
