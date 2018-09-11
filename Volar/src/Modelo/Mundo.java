package Modelo;

public class Mundo {

	private Bird br;
	private Superman sup;
	private AirPlane air;
	
	
	public Mundo() {
		
		br = new Bird ();
		sup = new Superman();
		air = new AirPlane();
		
	}


	public Bird getBr() {
		return br;
	}


	public void setBr(Bird br) {
		this.br = br;
	}


	public Superman getSup() {
		return sup;
	}


	public void setSup(Superman sup) {
		this.sup = sup;
	}


	public AirPlane getAir() {
		return air;
	}


	public void setAir(AirPlane air) {
		this.air = air;
	}
}
