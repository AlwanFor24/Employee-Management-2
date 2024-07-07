package com.example.ManajemenKaryawan1.controller;
import com.example.ManajemenKaryawan1.model.Departement;
import com.example.ManajemenKaryawan1.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@Controller
public class DepartementController {
    @Autowired
    private DepartementService departementService;

    @GetMapping("/departement")
    public String viewHomePage(Model model) {
        model.addAttribute("listDepartements", departementService.getAllDepartements());
        return "index_departement";
    }

    @GetMapping("/showNewDepartementForm")
    public String showNewDepartementForm(Model model) {
        // Create model attribute to bind form data
        Departement departement = new Departement();
        model.addAttribute("departement", departement);
        return "new_departement";
    }

    @PostMapping("/saveDepartement")
    public String saveDepartement(@ModelAttribute("departement") Departement departement) {
        departementService.saveDepartement(departement);
        return "redirect:/departement";
    }

    @GetMapping("/showFormDepartementForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Departement departement = departementService.getDepartementById(id);
        model.addAttribute("departement", departement);
        return "update_departement";
    }

    @GetMapping("/deleteDepartement/{id}")
    public String deleteDepartement(@PathVariable(value = "id") long id) {
        this.departementService.deleteDepartementById(id);
        return "redirect:/departement";
    }

}
