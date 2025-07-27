package ar.com.sistemasnea.diexample.service;

import ar.com.sistemasnea.diexample.repositories.DiRepo;

public class DiService {

    private DiRepo repo;

    public DiService(DiRepo repo) {
        this.repo = repo;
    }

    public String getGreeting(){
        return repo.queryDatabase();
    }
}
