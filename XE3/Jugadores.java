package XE3;

import java.util.ArrayList;
import java.util.List;

public class Jugadores {
	private List<String> listaIdsJugadores;

    public Jugadores() {
        this.listaIdsJugadores = new ArrayList<>();
    }

    public Jugadores(List<String> listaIdsJugadores) {
        this.listaIdsJugadores = listaIdsJugadores;
    }

    public List<String> getListaIdsJugadores() {
        return listaIdsJugadores;
    }

    public void setListaIdsJugadores(List<String> listaIdsJugadores) {
        this.listaIdsJugadores = listaIdsJugadores;
    }

}
