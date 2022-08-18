package myjak.jexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JexampleApplicationTest {

    @Test
    void adder() {
        JexampleApplication jexampleApplication = new JexampleApplication();
        assertEquals(10, jexampleApplication.adder(5,5));
    }
}