package Entidades;

public class Cuota {
    private int numero;
    private double cuota;
    private double inicio;
    private double interes;
    private double abonoCapital;
    private double saldo;

    public Cuota(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getInicio() {
        return inicio;
    }

    public void setInicio(double inicio) {
        this.inicio = inicio;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getAbonoCapital() {
        return abonoCapital;
    }

    public void setAbonoCapital(double abonoCapital) {
        this.abonoCapital = abonoCapital;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String mostrarPrestamo() {
        String sCuota = Utilitario.redondearAString(this.cuota);
        String sInicio = Utilitario.redondearAString(this.inicio);
        String sInteres = Utilitario.redondearAString(this.interes);
        String sAbonoCapital = Utilitario.redondearAString(this.abonoCapital);
        String sSaldo = Utilitario.redondearAString(this.saldo);

        return this.numero 
                + " | " + sCuota
                + " | " + sInicio
                + " | " + sInteres
                + " | " + sAbonoCapital
                + " | " + sSaldo;
    }
}
