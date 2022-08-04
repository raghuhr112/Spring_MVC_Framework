package com.xworkz.ott.dto;

import org.springframework.stereotype.Component;

@Component
public class OttDto {

	private String ott;
	private String region;
	private String lang;
	private String pack;
	private int subscribers;
	private String since;
	private boolean status;

	public String getOtt() {
		return ott;
	}

	public void setOtt(String ott) {
		this.ott = ott;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	public int getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(int subscribers) {
		this.subscribers = subscribers;
	}

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OttDto [ott=" + ott + ", region=" + region + ", lang=" + lang + ", pack=" + pack + ", subscribers="
				+ subscribers + ", since=" + since + ", status=" + status + "]";
	}

}
