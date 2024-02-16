package com.example.demoEsercizioQueryParameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("v1/ciao")
public class ControllerMeteo {
    @GetMapping("/saluta")
    public String saluta(@RequestParam("nome") String nome,@RequestParam("provincia") String provincia){
        return "Ciao " + nome + ", com'e il tempo in " +provincia + "?";
    }
}
