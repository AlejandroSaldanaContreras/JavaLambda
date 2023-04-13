package dev;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dev.HelloLambda;

public class HelloLambdaTest {

    @Test
    public void shouldReturnHelloLambda() {
        var sut = new HelloLambda();
        Assertions.assertEquals("Hello, first AWS Lambda:)", sut.handleRequest());
    }
}
