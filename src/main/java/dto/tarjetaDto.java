package dto;

public class tarjetaDto {

    public Integer numeroTarjeta;
    public String tipoTarjeta; //Credito o Debito
    public Integer identificadorSistema;
    public Integer numeroValidacion;
    public Integer estado;

    public Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public Integer getIdentificadorSistema() {
        return identificadorSistema;
    }

    public void setIdentificadorSistema(Integer identificadorSistema) {
        this.identificadorSistema = identificadorSistema;
    }

    public Integer getNumeroValidacion() {
        return numeroValidacion;
    }

    public void setNumeroValidacion(Integer numeroValidacion) {
        this.numeroValidacion = numeroValidacion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
