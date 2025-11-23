package XE3;

import java.util.ArrayList;

public class Naipe {
    private ArrayList<Numero> numerosPosibles = new ArrayList<>();
    private ArrayList<Carta> cartas = new ArrayList<>();

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    
    public Naipe() {
        inicializarNumerosPosibles();
        crearMazoCompleto();
    }

    private void inicializarNumerosPosibles() {
        for (int i = 2; i <= 9; i++) {
            numerosPosibles.add(new Numero(String.valueOf(i), i));
        }
        
        numerosPosibles.add(new Numero("A", 11)); 
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));
    }

    private void crearMazoCompleto() {
        Palos palos = new Palos();
        String[] codigosPalos = {
            palos.getCorazonRojo(), 
            palos.getCorazonNegro(), 
            palos.getDiamante(), 
            palos.getTrebol()
        };

        for (String palo : codigosPalos) {
            for (Numero num : numerosPosibles) {
                cartas.add(new Carta(num, palo));
            }
        }
    }
    
    public ArrayList<Carta> barajar() {
        ArrayList<Carta> auxiliar = new ArrayList<>();
        int iteraciones = 100;
        
        for (int i = 0; i < iteraciones; i++) {
            int posicion = RandomUtil.obtenerPosicion();
            
            try {
                Carta cartaSeleccionada = cartas.get(posicion);

                if (cartaSeleccionada.getEstado().equals("N")) { 
                    auxiliar.add(cartaSeleccionada);
                    cartaSeleccionada.setEstado("C"); 
                }
            } catch (IndexOutOfBoundsException e) {
            }
        }
        
        for (Carta carta : cartas) {
            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
            }
        }

        return auxiliar;
    }
}
