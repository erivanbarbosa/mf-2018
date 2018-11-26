package com.github.redesprou.loinc;

public class LoincInformation {
	private String num;
	private String component;
	private String property;
	private String timeAspect;
	private String systemInformation;
	private String scaleType;
	private String methodType;
	private String classInformation;
	private Integer classType;
	private String longName;
	private String shortName;
	private String externalCopyrightNotice;
	private String status;
	private String versionFirstReleased;
	private String versionLastChanged;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getTimeAspect() {
		return timeAspect;
	}

	public void setTimeAspect(String timeAspect) {
		this.timeAspect = timeAspect;
	}

	public String getSystemInformation() {
		return systemInformation;
	}

	public void setSystemInformation(String systemInformation) {
		this.systemInformation = systemInformation;
	}

	public String getScaleType() {
		return scaleType;
	}

	public void setScaleType(String scaleType) {
		this.scaleType = scaleType;
	}

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public String getClassInformation() {
		return classInformation;
	}

	public void setClassInformation(String classInformation) {
		this.classInformation = classInformation;
	}

	public Integer getClassType() {
		return classType;
	}

	public void setClassType(Integer classType) {
		this.classType = classType;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getExternalCopyrightNotice() {
		return externalCopyrightNotice;
	}

	public void setExternalCopyrightNotice(String externalCopyrightNotice) {
		this.externalCopyrightNotice = externalCopyrightNotice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVersionFirstReleased() {
		return versionFirstReleased;
	}

	public void setVersionFirstReleased(String versionFirstReleased) {
		this.versionFirstReleased = versionFirstReleased;
	}

	public String getVersionLastChanged() {
		return versionLastChanged;
	}

	public void setVersionLastChanged(String versionLastChanged) {
		this.versionLastChanged = versionLastChanged;
	}

	@Override
	public String toString() {
		return "LoincInformation [num=" + num + ", component=" + component + ", property=" + property + ", timeAspect="
				+ timeAspect + ", systemInformation=" + systemInformation + ", scaleType=" + scaleType + ", methodType="
				+ methodType + ", classInformation=" + classInformation + ", classType=" + classType + ", longName="
				+ longName + ", shortName=" + shortName + ", externalCopyrightNotice=" + externalCopyrightNotice
				+ ", status=" + status + ", versionFirstReleased=" + versionFirstReleased + ", versionLastChanged="
				+ versionLastChanged + "]";
	}
	
	

}
