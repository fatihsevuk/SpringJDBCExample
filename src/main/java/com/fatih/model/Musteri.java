package com.fatih.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("musteriId")
public class Musteri {
	
	
	private int musteriId;
	
	
	private String ad;
	
	
	private int yas;
	/**
	 * @return the musteriId
	 */
	
	public Musteri() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Musteri(int musteriId, String ad, int yas) {
		super();
		this.musteriId = musteriId;
		this.ad = ad;
		this.yas = yas;
	}

	public void musteriOlustur(int musteriId, String ad, int yas) {
		
		this.musteriId = musteriId;
		this.ad = ad;
		this.yas = yas;
		

	}



	public int getMusteriId() {
		return musteriId;
	}
	/**
	 * @param musteriId the musteriId to set
	 */
	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
	}
	/**
	 * @return the ad
	 */
	public String getAd() {
		return ad;
	}
	/**
	 * @param ad the ad to set
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}
	/**
	 * @return the yas
	 */
	public int getYas() {
		return yas;
	}
	/**
	 * @param yas the yas to set
	 */
	public void setYas(int yas) {
		this.yas = yas;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Musteri [musteriId=" + musteriId + ", ad=" + ad + ", yas=" + yas + "]";
	}
	
	
	
	

}
