package com.example.superheropage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperHeroController {
    @RequestMapping("/superhero")
    public String greeting(Model model) {
        model.addAttribute("name", "Maniac Creator");
        model.addAttribute("power1", "Other wordly mathmatically solving brain");
        model.addAttribute("power2", "Scientifically ");
        model.addAttribute("power3", "A third power that is super");
        model.addAttribute("fact1", "This is fun fact is maybe not so fun");
        model.addAttribute("fact2", "This is another fun fact");
        model.addAttribute("fact3", "This is the third ");

        return "hero"; //Return "hero" to tell spring to use the hero.html template
    }
}
