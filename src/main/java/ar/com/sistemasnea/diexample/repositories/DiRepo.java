package ar.com.sistemasnea.diexample.repositories;

import ar.com.sistemasnea.diexample.database.DIDataStore;

public class DiRepo {

    private DIDataStore store;

    public DiRepo(DIDataStore store) {
        this.store = store;
    }

    public String queryDatabase() {
        return store.queryDatabase();
    }
}
