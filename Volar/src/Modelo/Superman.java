package Modelo;

public class Superman implements Flyer,Animal {

	private String aterrizar; 
	private String despegar;
	private String volar;
	private String comer;
	private String balas;
	private String saltar;
	
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		
		comer = "Como super comida";
		return comer;
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		
		aterrizar = "puedo aterrizar";
		return aterrizar;
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		
		despegar ="ya despege";
		return despegar;
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		volar = "estoy volando";
		
		
		return volar;
	}

	public String leapBuilding() {
		
		saltar = "salto edificios ";
		
		return saltar;
	}
	public String stopBullet() {
		
		balas ="puedo detener balas";
		
		return balas;
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

	public String getComer() {
		return comer;
	}

	public void setComer(String comer) {
		this.comer = comer;
	}

	public String getBalas() {
		return balas;
	}

	public void setBalas(String balas) {
		this.balas = balas;
	}

	public String getSaltar() {
		return saltar;
	}

	public void setSaltar(String saltar) {
		this.saltar = saltar;
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		this.volar ="Puedo volar";
	}
	
}
