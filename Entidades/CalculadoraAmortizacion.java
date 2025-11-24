package Entidades;

public class CalculadoraAmortizacion {
    
    public double calcularCuota(Prestamo prestamo) {
        double c0 = prestamo.getMonto();
        double i = prestamo.getInteres() / 12 / 100;
        int n = prestamo.getPlazo();
        
        double numerador = c0 * i;
        double denominador = 1 - Math.pow((1 + i), -n);
        
        return numerador / denominador;
    }
    
    public void generarTabla(Prestamo prestamo) {
        double cuotaConstante = calcularCuota(prestamo);
        double saldoInicial = prestamo.getMonto();
        double i = prestamo.getInteres() / 12 / 100;
        
        for (int k = 0; k < prestamo.getPlazo(); k++) {
            Cuota cuotaActual = new Cuota(k + 1);
            cuotaActual.setInicio(saldoInicial);
            cuotaActual.setCuota(cuotaConstante);
            
            Cuota cuotaSiguiente = (k < prestamo.getPlazo() - 1) ? null : cuotaActual;
            calcularValoresCuota(cuotaActual, i, cuotaSiguiente);
            
            saldoInicial = cuotaActual.getSaldo();
            prestamo.getCuotas()[k] = cuotaActual;
        }
        
        Cuota ultimaCuota = prestamo.getCuotas()[prestamo.getPlazo() - 1];
        double ajuste = ultimaCuota.getSaldo();
        
        ultimaCuota.setCuota(ultimaCuota.getCuota() + ajuste);
        ultimaCuota.setAbonoCapital(ultimaCuota.getAbonoCapital() + ajuste);
        ultimaCuota.setSaldo(0);
    }
    
    public void calcularValoresCuota(Cuota cuotaActual, double interesMensual, Cuota cuotaSiguiente) {
        double interes = cuotaActual.getInicio() * interesMensual;
        double abonoCapital = cuotaActual.getCuota() - interes;
        double saldo = cuotaActual.getInicio() - abonoCapital;

        cuotaActual.setInteres(interes);
        cuotaActual.setAbonoCapital(abonoCapital);
        cuotaActual.setSaldo(saldo);
    }
    
    public void mostrarTabla(Prestamo prestamo) {
        System.out.println("--- TABLA DE AMORTIZACIÓN (Cuotas: " + prestamo.getPlazo() + ") ---");
        System.out.println("No | Cuota | Inicio | Interés | Abono Capital | Saldo");
        System.out.println("----------------------------------------------------------------");
        for (Cuota cuota : prestamo.getCuotas()) {
            if (cuota != null) {
                System.out.println(cuota.mostrarPrestamo());
            }
        }
        System.out.println("----------------------------------------------------------------");
    }
}
