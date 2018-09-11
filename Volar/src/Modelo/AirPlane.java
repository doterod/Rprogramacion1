package Modelo;

public class AirPlane implements Flyer {
	
	
	private String aterrizar; 
	private String despegar;
	private String volar;
	
	
	

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		
		aterrizar = "Puedo aterrizar";
		return aterrizar;
	}




	public String getAterrizar() {
		return aterrizar;
	}




	public void setAterrizar(String aterrizar) {
		this.aterrizar = aterrizar;
	}




	public String getDespegar() {
		return despegar;
	}




	public void setDespegar(String despegar) {
		this.despegar = despegar;
	}




	public String getVolar() {
		return volar;
	}




	public void setVolar(String volar) {
		this.volar = volar;
	}




	@Override
	public String land() {
		// TODO Auto-generated method stub
		
		despegar = "ya despegue";
		return despegar;
	}




	@Override
	public String fly() {
		// TODO Auto-generated method stub
		volar ="estoy volando";
		
		
		return volar;
	}




	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		this.volar = "Puedo volar";
	}
	
	
}
