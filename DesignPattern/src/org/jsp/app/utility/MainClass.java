package org.jsp.app.utility;

import org.jsp.app.DAO.HotelDAOImpl;

public class MainClass {

	public static void main(String[] args) {
			HotelDAOImpl hotelDAOImpl= new HotelDAOImpl();
			hotelDAOImpl.avalibilty();
			//hotelDAOImpl.getAddress();
	}

}
