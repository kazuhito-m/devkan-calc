package services;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorIT extends JerseyTest {

    @Test
    public void testAdd001() {
        String actual = target("/calc/add")
                .queryParam("a", "1")
                .queryParam("b", "1")
                .request()
                .get(String.class);

        assertThat(actual, is("2"));
    }

    @Test
    public void testAdd002() {
        String actual = target("/calc/add")
                .queryParam("a", "12")
                .queryParam("b", "34")
                .request()
                .get(String.class);

        assertThat(actual, is("46"));
    }

    @Override
    protected Application configure() {
        return new ResourceConfig(Calculator.class);
    }
}
