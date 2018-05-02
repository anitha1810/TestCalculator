package com.devskiller.calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicTest {

    @Test
    public void shouldAddTwoNumbers() {
        Calculator c= new Calculator();
        
        assertEquals(5,  c.add(2,3));
    }
}
