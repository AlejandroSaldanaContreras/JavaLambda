import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloLambdaTest {

    @Test
    public void shouldReturnHelloLambda() {
        var sut = new HelloLambda();
        Assertions.assertEquals("Hello, first AWS Lambda:)", sut.handleRequest());
    }
}
