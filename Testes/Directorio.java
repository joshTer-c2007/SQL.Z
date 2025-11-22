package Testes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto>contactos;
	private Date fechaUltimaMod;
	public Directorio(ArrayList<Contacto> contactos, Date fechaUltimaMod) {
		super();
		this.contactos = contactos;
		this.fechaUltimaMod = fechaUltimaMod;
	}
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	public Date getFechaUltimaMod() {
		return fechaUltimaMod;
	}
	public void setFechaUltimaMod(Date fechaUltimaMod) {
		this.fechaUltimaMod = fechaUltimaMod;
	}
	
	public Contacto buscarContacto(String cedula) {
		for(Contacto cont: contactos) {
			if(cont.getCedula().equals(cedula)) {
				return cont;
			}
		}
		return null;
	}
	
	public boolean agregarCon(Contacto contacto) {
		Contacto exist=buscarContacto(contacto.getCedula());
		if(exist==null) {
			contactos.add(contacto);
			this.fechaUltimaMod=new Date();
			return true;
		}else {
			return false;
		}
	}
	
	public ArrayList<Telefono> recuperarIncorr(){
		ArrayList<Telefono> telfIncorr=new ArrayList<Telefono>();
		for(Contacto cont: contactos) {
			for(Telefono telf: cont.getTelefonos()) {
				if(telf.getEstado().equals("E")) {
					telfIncorr.add(telf);
				}
			}
		}
		return telfIncorr;
	}
	
	public String consulta() {
		if(fechaUltimaMod==null) {
			return null;
		}
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(fechaUltimaMod);
	}
	
	public int contarPer() {
		int contadorPer=0;
		for(Contacto cont:contactos) {
			if(cont.getDireccion()==null) {
				contadorPer++;
			}
		}
		return contadorPer;
		
	}
	
	public int contar() {
		int contaFij=0;
		
		for(Contacto cont:contactos) {
			boolean tieneFijo=false;
			
			for(Telefono telf: cont.getTelefonos()) {
				if(telf.getTipo().equalsIgnoreCase("Convencional")&& telf.getEstado().equals("C")) {
					tieneFijo=true;
					break;
				}
			}
			if(tieneFijo) {
				contaFij++;
			}
		}
		return contaFij;
	}

}
