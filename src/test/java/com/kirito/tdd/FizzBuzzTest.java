package com.kirito.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_give_1() {
        assertEquals("1", new FizzBuzz().count(1));
    }
}
