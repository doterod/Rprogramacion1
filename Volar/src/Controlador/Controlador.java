package Controlador;
import Modelo.Bird;
import Modelo.Superman;
import Modelo.AirPlane;
import Modelo.Mundo;

import Vista.Vista;

public class Controlador {

	
	Mundo md = new Mundo();
	Bird br = new Bird();
	Superman sup = new Superman();
	AirPlane air = new AirPlane();
	Vista vis = new Vista();
	private String val;
	
	public  Controlador() {
		
		int valor = vis.pedirVolar();
		
		if(valor == 1) {
			
			br.fly();
			br.eat();
			br.buildNest();
			br.land();
			br.layEggs();
			br.takeOff();
			val = "Hola soy un pajaro"+", "+ br.getVolar()+", "+br.getComer()+", "+br.getNido()+", "+br.getDespegar()+", "+ br.getHuevo()+", "+br.getAterrizar();
			vis.mostrarHablidad(val);
		}else if (valor == 2) {
			
			air.fly();
			air.takeOff();
			air.land();
			val="Hola Soy Una Maquina"+", "+air.getAterrizar()+", "+ air.getDespegar()+"," + air.getVolar();
			vis.mostrarHablidad(val);
			
			
		}else if (valor == 3) {
		
			sup.eat();
			sup.fly();
			sup.land();
			sup.takeOff();
			sup.leapBuilding();
			sup.stopBullet();
			val ="Hola soy SuperMan"+", "+sup.getVolar()+","+ sup.getDespegar()+ ", "+ sup.getAterrizar()+", "+ sup.getSaltar()+", "+ sup.getBalas();
			vis.mostrarHablidad(val);
		}else {
			val ="Ingresaste una opcion incorrecta";
			vis.mostrarHablidad(val);
		}
	}
	
	
}
