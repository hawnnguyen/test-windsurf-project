package com.example.graphqlhello.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@GraphQlTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void shouldReturnHelloMessage() {
        // language=GraphQL
        String document = """
            query {
                hello
            }
        """;

        graphQlTester
            .document(document)
            .execute()
            .path("hello")
            .entity(String.class)
            .isEqualTo("Hello, GraphQL World!");
    }
}
