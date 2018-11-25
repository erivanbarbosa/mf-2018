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
public class DadoDemograficoDTO {
	private String individuoNome;
	private Date dataNascimento;
	private String nascimentoAcuracia;
	private String nascimentoSeguimentoDescricao;
	private String nascimentoPluralidadeDescricao;
	private String nascimentoOrdemDescricao;
	private Date dataObito;
	private String obitoAcuracia;
	private String obitoFonteDescricao;
	private String sexoDescricao;
	private Boolean isSexoAlternativo;
	private String maeNome;
	private String paiNome;
	private String situacaoFamiliarDescricao;
	private String racaDescricao;
	private String comentario;
	private String nacionalidadeDescricao;
	private String municipioNome;
	private String municioEstadoSigla;
	private String estadoNome;
	private String paisNome;
	private Date dataEntradaPais;
	
	
	public void toXML(String filename) {
		try {
			JAXBContext context;
			context = JAXBContext.newInstance(DadoDemograficoDTO.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			File file = new File("src/main/resources/" + filename + ".xml");
			m.marshal(this, file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public DadoDemograficoDTO fromXML(String filename) {
		DadoDemograficoDTO dadoDemografico = null;
		try {
			File arquivo = new File("src/main/resources/" + filename + ".xml");
			arquivo.createNewFile();
			JAXBContext context = JAXBContext.newInstance(DadoDemograficoDTO.class);
			Unmarshaller un = context.createUnmarshaller();
			dadoDemografico = (DadoDemograficoDTO) un.unmarshal(new FileReader(arquivo));
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		}

		return dadoDemografico;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNascimentoAcuracia() {
		return nascimentoAcuracia;
	}

	public void setNascimentoAcuracia(String nascimentoAcuracia) {
		this.nascimentoAcuracia = nascimentoAcuracia;
	}

	public String getNascimentoSeguimentoDescricao() {
		return nascimentoSeguimentoDescricao;
	}

	public void setNascimentoSeguimentoDescricao(String nascimentoSeguimentoDescricao) {
		this.nascimentoSeguimentoDescricao = nascimentoSeguimentoDescricao;
	}

	public String getNascimentoPluralidadeDescricao() {
		return nascimentoPluralidadeDescricao;
	}

	public void setNascimentoPluralidadeDescricao(String nascimentoPluralidadeDescricao) {
		this.nascimentoPluralidadeDescricao = nascimentoPluralidadeDescricao;
	}

	public String getNascimentoOrdemDescricao() {
		return nascimentoOrdemDescricao;
	}

	public void setNascimentoOrdemDescricao(String nascimentoOrdemDescricao) {
		this.nascimentoOrdemDescricao = nascimentoOrdemDescricao;
	}

	public Date getDataObito() {
		return dataObito;
	}

	public void setDataObito(Date dataObito) {
		this.dataObito = dataObito;
	}

	public String getObitoAcuracia() {
		return obitoAcuracia;
	}

	public void setObitoAcuracia(String obitoAcuracia) {
		this.obitoAcuracia = obitoAcuracia;
	}

	public String getObritoFonteDescricao() {
		return obitoFonteDescricao;
	}

	public void setObritoFonteDescricao(String obritoFonteDescricao) {
		this.obitoFonteDescricao = obritoFonteDescricao;
	}

	public String getSexoDescricao() {
		return sexoDescricao;
	}

	public void setSexoDescricao(String sexoDescricao) {
		this.sexoDescricao = sexoDescricao;
	}

	public Boolean getIsSexoAlternativo() {
		return isSexoAlternativo;
	}

	public void setIsSexoAlternativo(Boolean isSexoAlternativo) {
		this.isSexoAlternativo = isSexoAlternativo;
	}

	public String getMaeNome() {
		return maeNome;
	}

	public void setMaeNome(String maeNome) {
		this.maeNome = maeNome;
	}

	public String getPaiNome() {
		return paiNome;
	}

	public void setPaiNome(String paiNome) {
		this.paiNome = paiNome;
	}

	public String getSituacaoFamiliarDescricao() {
		return situacaoFamiliarDescricao;
	}

	public void setSituacaoFamiliarDescricao(String situacaoFamiliarDescricao) {
		this.situacaoFamiliarDescricao = situacaoFamiliarDescricao;
	}

	public String getRacaDescricao() {
		return racaDescricao;
	}

	public void setRacaDescricao(String racaDescricao) {
		this.racaDescricao = racaDescricao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getNacionalidadeDescricao() {
		return nacionalidadeDescricao;
	}

	public void setNacionalidadeDescricao(String nacionalidadeDescricao) {
		this.nacionalidadeDescricao = nacionalidadeDescricao;
	}

	public String getMunicipioNome() {
		return municipioNome;
	}

	public void setMunicipioNome(String municipioNome) {
		this.municipioNome = municipioNome;
	}

	public String getMunicioEstadoSigla() {
		return municioEstadoSigla;
	}

	public void setMunicioEstadoSigla(String municioEstadoSigla) {
		this.municioEstadoSigla = municioEstadoSigla;
	}

	public String getEstadoNome() {
		return estadoNome;
	}

	public void setEstadoNome(String estadoNome) {
		this.estadoNome = estadoNome;
	}

	public String getPaisNome() {
		return paisNome;
	}

	public void setPaisNome(String paisNome) {
		this.paisNome = paisNome;
	}

	public Date getDataEntradaPais() {
		return dataEntradaPais;
	}

	public void setDataEntradaPais(Date dataEntradaPais) {
		this.dataEntradaPais = dataEntradaPais;
	}

}
