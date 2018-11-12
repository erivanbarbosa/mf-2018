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
public class IdentificadorDTO {
	private String individuoNome;
	private String designacao;
	private Boolean alternativoArea;
	private String descricaoArea;
	private String descricaoTipoCertidao;
	private String cartorio;
	private Long livroCertidao;
	private Long folhaCertidao;
	private Long termoCertidao;
	private Long zonaTitulo;
	private Long sessaoTitulo;
	private String tipoIdentificador;
	private Date data;
	private String emissor;
	private Long ctpsSerie;
	private String ctpsEstado;

	public void toXML(String filename) {
		try {
			JAXBContext context;
			context = JAXBContext.newInstance(IdentificadorDTO.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			File file = new File("src/main/resources/" + filename + ".xml");
			m.marshal(this, file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public IdentificadorDTO fromXML(String filename) {
		IdentificadorDTO identificador = null;
		try {
			File arquivo = new File("src/main/resources/" + filename + ".xml");
			arquivo.createNewFile();
			JAXBContext context = JAXBContext.newInstance(IdentificadorDTO.class);
			Unmarshaller un = context.createUnmarshaller();
			identificador = (IdentificadorDTO) un.unmarshal(new FileReader(arquivo));
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		}

		return identificador;
	}

	public String toJson() {
		Gson gson = new Gson();
		String json = gson.toJson(this);

		return json;
	}

	public IdentificadorDTO fromJson(String json) {
		Gson gson = new Gson();
		IdentificadorDTO identificador = gson.fromJson(json, IdentificadorDTO.class);

		return identificador;
	}

	public String getIndividuoNome() {
		return individuoNome;
	}

	public void setIndividuoNome(String individuoNome) {
		this.individuoNome = individuoNome;
	}

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public Boolean getAlternativoArea() {
		return alternativoArea;
	}

	public void setAlternativoArea(Boolean alternativoArea) {
		this.alternativoArea = alternativoArea;
	}

	public String getDescricaoArea() {
		return descricaoArea;
	}

	public void setDescricaoArea(String descricaoArea) {
		this.descricaoArea = descricaoArea;
	}

	public String getDescricaoTipoCertidao() {
		return descricaoTipoCertidao;
	}

	public void setDescricaoTipoCertidao(String descricaoTipoCertidao) {
		this.descricaoTipoCertidao = descricaoTipoCertidao;
	}

	public String getCartorio() {
		return cartorio;
	}

	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}

	public Long getLivroCertidao() {
		return livroCertidao;
	}

	public void setLivroCertidao(Long livroCertidao) {
		this.livroCertidao = livroCertidao;
	}

	public Long getFolhaCertidao() {
		return folhaCertidao;
	}

	public void setFolhaCertidao(Long folhaCertidao) {
		this.folhaCertidao = folhaCertidao;
	}

	public Long getTermoCertidao() {
		return termoCertidao;
	}

	public void setTermoCertidao(Long termoCertidao) {
		this.termoCertidao = termoCertidao;
	}

	public Long getZonaTitulo() {
		return zonaTitulo;
	}

	public void setZonaTitulo(Long zonaTitulo) {
		this.zonaTitulo = zonaTitulo;
	}

	public Long getSessaoTitulo() {
		return sessaoTitulo;
	}

	public void setSessaoTitulo(Long sessaoTitulo) {
		this.sessaoTitulo = sessaoTitulo;
	}

	public String getTipoIdentificador() {
		return tipoIdentificador;
	}

	public void setTipoIdentificador(String tipoIdentificador) {
		this.tipoIdentificador = tipoIdentificador;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public Long getCtpsSerie() {
		return ctpsSerie;
	}

	public void setCtpsSerie(Long ctpsSerie) {
		this.ctpsSerie = ctpsSerie;
	}

	public String getCtpsEstado() {
		return ctpsEstado;
	}

	public void setCtpsEstado(String ctpsEstado) {
		this.ctpsEstado = ctpsEstado;
	}

}
