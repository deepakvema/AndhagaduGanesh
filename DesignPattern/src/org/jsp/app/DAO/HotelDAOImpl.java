package org.jsp.app.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.jsp.app.DTO.Hotel;

public class HotelDAOImpl implements HotelDAO {

	String url="jdbc:mysql://localhost:3306";
	String user="root";
	String password="toor";
	String getAddress="select * from layerarchi.hotelinfo where hotelName='Rafi's hotel'";
	String avalibility="select * from layerarchi.hotelinfo where avalibiity=10";
	String roomAva,address;
	
	@Override
	public List<Hotel> getAddress() {
		try {
				Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement= connection.createStatement();
				ResultSet resultSet=statement.executeQuery(avalibility);
				List<Hotel> list=new ArrayList();
				while(resultSet.next()) {
					address=resultSet.getString("getAddress");
					Hotel hotel =new Hotel(address);
					list.add(hotel);
				}
		
				System.out.println(list);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		//return List<Hotel>;
		return null;
	}

	@Override
	public String avalibilty() {
		
		try {
			
				Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement= connection.createStatement();
				ResultSet resultSet=statement.executeQuery(avalibility);
				while(resultSet.next()) {
					roomAva=resultSet.getString("avalibiity");
				}
				Hotel hotel =new Hotel(roomAva);
				System.out.println(hotel);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		return avalibility;
		
		
	}

	@Override
	public Hotel hotelName() {

		return null;
	}
}
