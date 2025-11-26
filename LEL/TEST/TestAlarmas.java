package TEST;

import java.util.ArrayList;

import ENTIDADES.Alarmas;
import LOGICA.AdminAlarmas;
import UTILS.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminAlarmas adm=new AdminAlarmas();
		
		Alarmas alm1=new Alarmas(DiasSemana.LUNES, 5, 45);
		Alarmas alm2=new Alarmas(DiasSemana.MIERCOLES, 14, 5);
		Alarmas alm3=new Alarmas(DiasSemana.VIERNES, 9, 0);
		Alarmas alm4=new Alarmas(DiasSemana.SABADO, 8, 30);
		
		adm.agregarAlarma(alm1);
		adm.agregarAlarma(alm2);
		adm.agregarAlarma(alm3);
		adm.agregarAlarma(alm4);
		
		ArrayList<Alarmas> alarmasActuale=adm.getAlarmas();
		System.out.println(alarmasActuale);

	}

}
