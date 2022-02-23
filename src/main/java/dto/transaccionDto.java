package dto;

public class transaccionDto {

    public Integer identificadorSistema;
    public Integer numeroReferencia;
    public Integer totalCompra;
    public String direccionCompra;

    public Integer getIdentificadorSistema() {
        return identificadorSistema;
    }

    public void setIdentificadorSistema(Integer identificadorSistema) {
        this.identificadorSistema = identificadorSistema;
    }

    public Integer getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(Integer numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public Integer getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Integer totalCompra) {
        this.totalCompra = totalCompra;
    }

    public String getDireccionCompra() {
        return direccionCompra;
    }

    public void setDireccionCompra(String direccionCompra) {
        this.direccionCompra = direccionCompra;
    }
}
