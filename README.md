# Spring Boot GraphQL Hello World

This is a simple Spring Boot application that demonstrates GraphQL integration by HawnSolo using Windsurf Codeium 

## Prerequisites

- Java 17 or higher
- Maven 3.6+ (or use the included Maven wrapper)

## Building the Application

You can build the application using Maven:

```bash
mvn clean install
```

## Build the project

```bash
mvn package
```

## Running the Application

To start the application:

```bash
mvn spring-boot:run
```

The application will start on port 8080.

## Testing

Run the tests using:

```bash
mvn test
```

To run a specific test class:

```bash
mvn test -Dtest=HelloControllerTest
```

## Using GraphiQL Interface

Once the application is running, you can access the GraphiQL interface at:

```
http://localhost:8080/graphiql
```

### Sample Query

Try this query in the GraphiQL interface:

```graphql
query {
    hello
}
```

Expected response:
```json
{
  "data": {
    "hello": "Hello, GraphQL World!"
  }
}
```

## Development

The application uses:
- Spring Boot
- Spring GraphQL
- JUnit 5 for testing

Key files:
- `src/main/resources/graphql/schema.graphqls` - GraphQL schema definition
- `src/main/java/com/example/graphqlhello/controller/HelloController.java` - GraphQL resolver
- `src/test/java/com/example/graphqlhello/controller/HelloControllerTest.java` - Controller tests
