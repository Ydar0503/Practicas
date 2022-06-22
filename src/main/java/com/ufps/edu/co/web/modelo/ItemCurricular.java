package com.ufps.edu.co.web.modelo;


import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "items_curricular")
public class ItemCurricular {

    @Id
    private int codigo;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "enlace", columnDefinition = "LONGBLOB")
    private byte[] enlace;
    private String tipo;
    private String estado;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "malla", columnDefinition = "LONGBLOB")
    private byte[] malla;

    public ItemCurricular(byte[] enlace, int codigo, String tipo, String estado, byte[] malla) {
        this.enlace = enlace;
        this.codigo = codigo;
        this.tipo = tipo;
        this.estado = estado;
        this.malla = malla;
    }

    public ItemCurricular() {
    }

    public byte[] getEnlace() {
        return enlace;
    }

    public void setEnlace(byte[] enlace) {
        this.enlace = enlace;
    }

    public byte[] getMalla() {
        return malla;
    }

    public void setMalla(byte[] malla) {
        this.malla = malla;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEnlace64() {
        String str = new String(this.enlace, java.nio.charset.StandardCharsets.UTF_8);
        return str;
    }
    public String getMalla64() {
        String str = new String(this.malla, java.nio.charset.StandardCharsets.UTF_8);
        return str;
    }

    @Override
    public String toString() {
        return "ItemCurricular{" +
                "codigo=" + codigo +
                ", enlace=" + Arrays.toString(enlace) +
                ", tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                ", malla=" + Arrays.toString(malla) +
                '}';
    }
}
