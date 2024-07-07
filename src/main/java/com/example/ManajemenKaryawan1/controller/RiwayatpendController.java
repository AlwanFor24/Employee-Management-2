package com.example.ManajemenKaryawan1.controller;



import com.example.ManajemenKaryawan1.model.Riwayatpend;
import com.example.ManajemenKaryawan1.service.RiwayatpendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@Controller
public class RiwayatpendController {
    @Autowired
    private RiwayatpendService riwayatpendService;

    @GetMapping("/riwayatpend")
    public String viewHomePage(Model model) {
        model.addAttribute("listRiwayatpends", riwayatpendService.getAllRiwayatpends());
        return "index_riwayatpend";
    }

    @GetMapping("/showNewRiwayatpendForm")
    public String showNewRiwayatpendForm(Model model) {
        // Create model attribute to bind form data
        Riwayatpend riwayatpend = new Riwayatpend();
        model.addAttribute("riwayatpend", riwayatpend);
        return "new_riwayatpend";
    }

    @PostMapping("/saveRiwayatpend")
    public String saveRiwayatpend(@ModelAttribute("riwayatpend") Riwayatpend riwayatpend) {
        riwayatpendService.saveRiwayatpend(riwayatpend);
        return "redirect:/";
    }

    @GetMapping("/showFormRiwayatpendForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value="id") long id, Model model) {
        Riwayatpend riwayatpend = riwayatpendService.getRiwayatpendById(id);
        model.addAttribute("riwayatpend", riwayatpend);
        return "update_riwayatpend";
    }

    @GetMapping("/deleteRiwayatpend/{id}")
    public String deleteRiwayatpend(@PathVariable (value = "id") long id) {
        this.riwayatpendService.deleteRiwayatpendById(id);
        return "redirect:/";
    }
}
