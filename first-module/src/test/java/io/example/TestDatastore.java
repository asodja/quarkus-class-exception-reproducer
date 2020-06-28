package io.example;

public class TestDatastore implements Datastore {

    @Override
    public Object get(String id) {
        return id;
    }

}
