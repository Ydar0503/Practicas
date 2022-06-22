package com.ufps.edu.co.web.dto;

public class UsuarioRegistroDTO {
    private long id;
    private String email;
    private String password;
    private int codigo;

    public UsuarioRegistroDTO(long id, String email, String password, int codigo) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.codigo = codigo;
    }

    public UsuarioRegistroDTO(String email, String password, int codigo) {
        this.email = email;
        this.password = password;
        this.codigo = codigo;
    }

    public UsuarioRegistroDTO() {
    }

    public UsuarioRegistroDTO(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
