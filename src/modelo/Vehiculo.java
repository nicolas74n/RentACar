package modelo;


public class Vehiculo {
    
    private int idVehiculo;
    private int idMarca;
    private int tipoVehiculo;
    private int tipoCarroceria;
    private String modeloVehiculo;
    private int añoVehiculo;
    private int cilindradaVehiculo;
    private String patenteVehiculo;
    private String colorVehiculo;
    private int estadoVehiculo;
    private double valorArriendo;
    private int kilometrajeActual;
    private int fechaRegistro;
    private int usuarioRegistro;

    public Vehiculo(int idVehiculo, int idMarca, int tipoVehiculo, int tipoCarroceria, String modeloVehiculo, int añoVehiculo, int cilindradaVehiculo, String patenteVehiculo, String colorVehiculo, int estadoVehiculo, double valorArriendo, int kilometrajeActual, int fechaRegistro, int usuarioRegistro) {
        this.idVehiculo = idVehiculo;
        this.idMarca = idMarca;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoCarroceria = tipoCarroceria;
        this.modeloVehiculo = modeloVehiculo;
        this.añoVehiculo = añoVehiculo;
        this.cilindradaVehiculo = cilindradaVehiculo;
        this.patenteVehiculo = patenteVehiculo;
        this.colorVehiculo = colorVehiculo;
        this.estadoVehiculo = estadoVehiculo;
        this.valorArriendo = valorArriendo;
        this.kilometrajeActual = kilometrajeActual;
        this.fechaRegistro = fechaRegistro;
        this.usuarioRegistro = usuarioRegistro;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(int tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public int getAñoVehiculo() {
        return añoVehiculo;
    }

    public void setAñoVehiculo(int añoVehiculo) {
        this.añoVehiculo = añoVehiculo;
    }

    public int getCilindradaVehiculo() {
        return cilindradaVehiculo;
    }

    public void setCilindradaVehiculo(int cilindradaVehiculo) {
        this.cilindradaVehiculo = cilindradaVehiculo;
    }

    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }

    public void setPatenteVehiculo(String patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public int getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(int estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public double getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(double valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public int getKilometrajeActual() {
        return kilometrajeActual;
    }

    public void setKilometrajeActual(int kilometrajeActual) {
        this.kilometrajeActual = kilometrajeActual;
    }

    public int getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(int fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(int usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }
    
    
            
}
