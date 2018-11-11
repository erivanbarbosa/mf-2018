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
	private Long id;
	private Long individuoId;
	private String designacao;
	private Long areaId;
	private String alternativo;
	private String descricao;
	private String emissor;
	private Date date;
	private String tipo;
	private Long certidaoId;
	private Long tipoCertidao;
	private String descricaoCertidao;
	private String cartorioCertidao;
	private Long livroCertidao;
	private Long folhaCertidao;
	private Long termoCertidao;
	private Long tituloEleitoralId;
	private Long zonaTitulo;
	private Long sessaoTitulo;
	private Long ctpsId;
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
	
	public IdentificadorDTO fromJson(String json ) {
		Gson gson = new Gson();
		IdentificadorDTO identificador = gson.fromJson(json, IdentificadorDTO.class);
		
	    return identificador;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIndividuoId() {
		return individuoId;
	}

	public void setIndividuoId(Long individuoId) {
		this.individuoId = individuoId;
	}

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public Long getArea() {
		return areaId;
	}

	public void setArea(Long area) {
		this.areaId = area;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getCertidaoId() {
		return certidaoId;
	}

	public void setCertidaoId(Long certidaoId) {
		this.certidaoId = certidaoId;
	}

	public Long getTipoCertidao() {
		return tipoCertidao;
	}

	public void setTipoCertidao(Long tipoCertidao) {
		this.tipoCertidao = tipoCertidao;
	}

	public String getDescricaoCertidao() {
		return descricaoCertidao;
	}

	public void setDescricaoCertidao(String descricaoCertidao) {
		this.descricaoCertidao = descricaoCertidao;
	}

	public String getCartorioCertidao() {
		return cartorioCertidao;
	}

	public void setCartorioCertidao(String cartorioCertidao) {
		this.cartorioCertidao = cartorioCertidao;
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

	public Long getTituloEleitoralId() {
		return tituloEleitoralId;
	}

	public void setTituloEleitoralId(Long tituloEleitoralId) {
		this.tituloEleitoralId = tituloEleitoralId;
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

	public Long getCtpsId() {
		return ctpsId;
	}

	public void setCtpsId(Long ctpsId) {
		this.ctpsId = ctpsId;
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

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAlternativo() {
		return alternativo;
	}

	public void setAlternativo(String alternativo) {
		this.alternativo = alternativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
