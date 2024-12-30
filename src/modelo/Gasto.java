package modelo;

public class Gasto extends Transaccion {

    public Gasto() {
    }

    public String getCategoria() { return categoria; }
    
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    public String getDescripcion() { return descripcion; }
    
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    
    public String getFecha() { return fecha; }
    
    public void setFecha(String fecha) { this.fecha = fecha; }
    
    public double getMonto() { return monto; }
    
    public void setMonto(double monto) { this.monto = monto; }
    

    //Método para convertir en monto en double
    public void setMonto(String montoStr) {
        try {
            double montoDouble = Double.parseDouble(montoStr);
            this.monto = montoDouble;
        } catch (NumberFormatException e) {
            System.err.println("Error: El valor de monto no es válido");
            e.printStackTrace();
        }
    }
    
}
