package ar.com.sistemasnea.diexample.service;

import ar.com.sistemasnea.diexample.repositories.Repo;

public class DiServiceImpl implements DiService {

    private Repo repo;

    public DiServiceImpl(Repo repo) {
        this.repo = repo;
    }

    public String getGreeting(){
        return repo.queryDatabase();
    }
}
