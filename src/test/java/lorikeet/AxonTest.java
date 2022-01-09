package lorikeet;

import org.junit.jupiter.api.Test;


public class AxonTest {
    @Test
    public void test() {
        final Axon<App> axon = new TestAxon<>(new App(21));
        System.out.println(axon.run(new MyAction()));
    }
}
