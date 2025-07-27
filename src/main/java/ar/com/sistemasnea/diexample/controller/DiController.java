package ar.com.sistemasnea.diexample.controller;

import ar.com.sistemasnea.diexample.service.DiService;

public class DiController {
    private DiService service;

    public DiController(DiService service){
        this.service = service;
    }

    public String getGreeting(){
        return service.getGreeting();
    }
}
