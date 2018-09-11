package Modelo;

public class Bird implements Flyer,Animal {

	
	private String aterrizar; 
	private String despegar;
	private String volar;
	private String nido;
	private String huevo;
	private String comer;
	
	
	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		
		aterrizar = "Puedo  aterrizar";
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




	public String getNido() {
		return nido;
	}




	public void setNido(String nido) {
		this.nido = nido;
	}




	public String getHuevo() {
		return huevo;
	}




	public void setHuevo(String huevo) {
		this.huevo = huevo;
	}




	public String getComer() {
		return comer;
	}




	public void setComer(String comer) {
		this.comer = comer;
	}




	@Override
	public String land() {
		// TODO Auto-generated method stub
		this.despegar = "ya despegue";
		
		return despegar;
		
	}




	@Override
	public String fly() {
		// TODO Auto-generated method stub
		
		this.volar ="Estoy volando";
		
		return this.volar= "Estoy Volando";
		
	 }
	
	
	public String buildNest() {
		
		
		
		nido = " tengo un nido";
		
		return nido;
		
	}
	
	
	public String layEggs() {
		
		huevo=" pongo huevos";
		
		return huevo;
		
	}




	@Override
	public String eat() {
		// TODO Auto-generated method stub
		
		this.comer =" como alpiste";
		return comer;
	}




	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		this.volar = "Estoy volando";
		
	}
	
	
	
	
}
