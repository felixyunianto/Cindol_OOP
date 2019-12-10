package OOP2.B.dikipriyanto.PertandinganGameOnline.controller;

import OOP2.B.dikipriyanto.PertandinganGameOnline.repo.PertandinganRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class AppController {
    @Autowired
    private PertandinganRepo pertandinganRepo;

    @RequestMapping("/home")
    public void index(){}

    @RequestMapping("/pertandingan")
    public void getPertandingan(Model model){
        model.addAttribute("daftarPertandingan",pertandinganRepo.findAll());
    }
}
