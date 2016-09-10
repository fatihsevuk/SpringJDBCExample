package com.fatih.dao;

import com.fatih.model.Musteri;

public interface MusteriDao {
	public void musteriEkle(Musteri musteri);
	public Musteri musteriBul(int musteriId);

}
