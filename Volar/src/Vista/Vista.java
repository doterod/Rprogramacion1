package Vista;

import javax.swing.JOptionPane;

public class Vista {
	
	public int pedirVolar() {
		
		
		String datos = JOptionPane.showInputDialog(null,"Ingrese el numero para un volador Entre Maquina(1),Pajaro(2) o Super Heroe(3)"); 
		int x = Integer.parseInt(datos);
		
		return x;
	}
	public void mostrarHablidad(String valor) {
		
		JOptionPane.showMessageDialog(null, valor);
	}

}
