package modelo;

public class MetaAhorro {
    
    String meta;
    String descripcion;
    String fechaInicio;
    String fechaFin;
    Double monto;

    public MetaAhorro() {
    }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getMeta() { return meta; }

    public void setMeta(String meta) { this.meta = meta; }

    public String getFechaInicio() { return fechaInicio; }

    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }

    public String getFechaFin() { return fechaFin; }

    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }

    public Double getMonto() { return monto; }

    public void setMonto(Double monto) { this.monto = monto; }
    
}
