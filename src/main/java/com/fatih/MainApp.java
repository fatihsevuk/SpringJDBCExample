package com.fatih;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fatih.dao.impl.JDBCMusteriDAO;
import com.fatih.model.Musteri;

@ComponentScan
public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("app-config.xml");
		
		Musteri musteri=context.getBean("musteriId",Musteri.class);
		
		//musteri.musteriOlustur(2, "veli", 56);
		
		
		JDBCMusteriDAO musteriDAO =context.getBean("musteriDAO",JDBCMusteriDAO.class);
		
		musteriDAO.musteriEkle(musteri);
		
		System.out.println(musteriDAO.musteriBul(1));
		
		
	}

}
