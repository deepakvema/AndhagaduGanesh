package org.jsp.app.DTO;

public class Hotel {
	private String haddress;
	private String hname;
	private String havalibilty;
	
	
	public Hotel(String haddress, String hname) {
		super();
		this.haddress = haddress;
		this.hname = hname;
	}
	
	 public Hotel(String havalibilty){
		 
		 this.havalibilty=havalibilty;
	 }

	 

	@Override
	public String toString() {
		return "Hotel [haddress=" + haddress + ", hname=" + hname + ", havalibilty=" + havalibilty + "]";
	}
}
