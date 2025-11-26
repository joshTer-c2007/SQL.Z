package LOGICA;

import java.util.ArrayList;

import ENTIDADES.Alarmas;

public class AdminAlarmas {
	private ArrayList<Alarmas>alarmas=new ArrayList<Alarmas>();
	
	
	public void agregarAlarma(Alarmas alarma) {
		this.alarmas.add(alarma);
	}
	
	public ArrayList<Alarmas> getAlarmas(){
		return alarmas;
	}

}
