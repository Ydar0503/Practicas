package com.ufps.edu.co.web.controlador;

import com.ufps.edu.co.web.repositorio.ItemCurricularRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroControlador {
    @Autowired
    private ItemCurricularRepositorio itemCurricularService;

    @GetMapping("/curriculo")
    private String verContenidoCurricular(Model model) {
        model.addAttribute("items", itemCurricularService.findAll());
        return "curriculo";
    }

    @GetMapping("/login")
    public String iniciarSesion() {
        return "login";
    }

    @GetMapping("/admin")
    public String dashBoard() {
        return "admin";
    }

    @GetMapping("/")
    public String verPaginaDeInicio() {
        return "index";
    }
}
