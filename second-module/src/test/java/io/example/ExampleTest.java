package io.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class ExampleTest {

    @Test
    void testExample() {
        assertEquals("value", getDatastore().get("value"));
    }

    private Datastore getDatastore() {
        return new TestDatastore();
    }


}
