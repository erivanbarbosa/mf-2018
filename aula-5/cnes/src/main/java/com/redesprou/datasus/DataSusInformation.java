package com.redesprou.datasus;

public class DataSusInformation {
	private String codigo;
	private String razaoSocial;
	private String latitude;
	private String longitude;
	
	

	public DataSusInformation(String codigo, String razaoSocial, String latitude, String longitude) {
		super();
		this.codigo = codigo;
		this.razaoSocial = razaoSocial;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "DataSusInformation [codigo=" + codigo + ", razaoSocial=" + razaoSocial + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
	
	

}
