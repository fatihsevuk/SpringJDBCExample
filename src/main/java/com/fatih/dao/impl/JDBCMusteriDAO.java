package com.fatih.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.fatih.dao.MusteriDao;
import com.fatih.model.Musteri;
import com.mysql.jdbc.PreparedStatement;

public class JDBCMusteriDAO implements MusteriDao{

	private DataSource datasource;
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
	public void musteriEkle(Musteri musteri) {
		
		String sql="insert into musteri(musteriId,ad,yas) values(?,?,?)";
		Connection conn=null;
		try {
			
			conn=datasource.getConnection();
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setInt(1,musteri.getMusteriId());
			ps.setString(2,musteri.getAd());
			ps.setInt(3, musteri.getYas());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
		
	}
	
	
	@Autowired(required=false)
	public Musteri musteriBul(int musteriId) {

				
		String sql="select*from musteri where musteriId=?";
		
		Connection conn=null;
		Musteri musteri=null;
		
		try {
			
			
			conn=datasource.getConnection();
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setInt(1,musteriId);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				musteri=new Musteri(rs.getInt("musteriId"),rs.getString("ad"),rs.getInt("yas"));
			}
			rs.close();
			ps.close();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(conn!=null){
				try{
					conn.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		
		return musteri;
		
		
	}
	
	

}
