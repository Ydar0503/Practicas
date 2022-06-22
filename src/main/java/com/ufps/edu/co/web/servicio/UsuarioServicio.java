package com.ufps.edu.co.web.servicio;

import com.ufps.edu.co.web.dto.UsuarioRegistroDTO;
import com.ufps.edu.co.web.modelo.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsuarioServicio extends UserDetailsService {

    public Usuario guardar(UsuarioRegistroDTO registroDTO);
}
