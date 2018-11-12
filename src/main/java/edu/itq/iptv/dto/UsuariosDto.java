package edu.itq.iptv.dto;

public class UsuariosDto {

    private String numero_tarjeta;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private double monto;
    private String cvv;
    private String fecha;
    
    /**
     * @return the numero_tarjeta
     */
    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }
    
    /**
     * @param numero_tarjeta the numero_tarjeta to set
     */
    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    
    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    /**
     * @return the apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    
    /**
     * @param apellidoMaterno the apellidoMaterno to set
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }
    
    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    /**
     * @return the cvv
     */
    public String getCvv() {
        return cvv;
    }
    
    /**
     * @param cvv the cvv to set
     */
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    
    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }
    
    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
