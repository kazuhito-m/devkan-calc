package services;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator sut = new Calculator();
        String actual = sut.add(1, 1);
        System.out.println(actual);
        assertThat(actual, is("2"));
    }
}
