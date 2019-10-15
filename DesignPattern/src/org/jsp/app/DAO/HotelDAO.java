package org.jsp.app.DAO;
import java.util.List;
import org.jsp.app.DTO.Hotel;

public interface HotelDAO {
	public List<Hotel> getAddress();
	public String avalibilty();
	public Hotel hotelName();
}
