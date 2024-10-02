package com.praksix.clairdelune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.praksix.clairdelune.service.EtablissementService;
import com.praksix.clairdelune.service.EtablissementService;


@Controller
public class HotelsController {

    @Autowired
    private EtablissementService etablissementService;

    @GetMapping("/hotels")
    public String hotels(Model model) {
    
    model.addAttribute("etablissements", etablissementService.getEtablissements());
    
    return "hotelslist";
}

    
}
