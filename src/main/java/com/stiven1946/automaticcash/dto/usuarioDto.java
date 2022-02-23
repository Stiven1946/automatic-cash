package com.stiven1946.automaticcash.dto;

public class usuarioDto {

    public String nombreTitular;
    public Integer documentoTitular;
    public Integer telefono;

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public Integer getDocumentoTitular() {
        return documentoTitular;
    }

    public void setDocumentoTitular(Integer documentoTitular) {
        this.documentoTitular = documentoTitular;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}
