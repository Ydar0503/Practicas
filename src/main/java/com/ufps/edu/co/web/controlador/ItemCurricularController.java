package com.ufps.edu.co.web.controlador;

import com.ufps.edu.co.web.modelo.ItemCurricular;
import com.ufps.edu.co.web.repositorio.ItemCurricularRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/itemcurricular")
public class ItemCurricularController {
    @Autowired
    private ItemCurricularRepositorio itemCurricularService;

    @GetMapping({ "/listar", "", "/" })
    private String listar(Model model) {
        model.addAttribute("items", itemCurricularService.findAll());
        return "itemcurricular/listado";
    }

    @GetMapping("/guardar")
    private String crear(Model model) {
        ItemCurricular itemCurricular = new ItemCurricular();
        model.addAttribute("itemCurricular", itemCurricular);
        model.addAttribute("guardar", true);
        return "itemcurricular/form";
    }

    @PostMapping("/guardar")
    private String guardar(ItemCurricular itemCurricular, RedirectAttributes flask, Model model) {
        flask.addFlashAttribute("success", "item curricular creado con exito");
        this.itemCurricularService.save(itemCurricular);
        return "redirect:/itemcurricular/listar";
    }

    @GetMapping("/editar/{codigo}")
    public String editar(@PathVariable Integer codigo, Model model, RedirectAttributes flask) {
        ItemCurricular itemCurricular = this.itemCurricularService.findById(codigo).orElse(null);
        if (itemCurricular == null) {
            flask.addFlashAttribute("error", "ha ocurrido un error inesperado el usuario no existe en la bd");
            return "redirect:/itemcurricular/listar";
        }
        model.addAttribute("itemCurricular", itemCurricular);
        model.addAttribute("guardar", false);
        return "itemcurricular/form";
    }

    @GetMapping("/eliminar/{codigo}")
    public String eliminar(@PathVariable Integer codigo, RedirectAttributes flask) {
        ItemCurricular itemCurricular = this.itemCurricularService.findById(codigo).orElse(null);
        if (itemCurricular != null) {
            this.itemCurricularService.deleteById(codigo);
            flask.addFlashAttribute("success", "item eliminado sastifactoriamente");
        }
        return "redirect:/itemcurricular/listar";
    }
}