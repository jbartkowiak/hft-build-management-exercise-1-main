package com.example;


import com.google.common.util.concurrent.Futures;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class AppTest {
    @Test
    public void whenVersionCollisionDoesNotExist_thenShouldCompile() {
        assertThat(Futures.immediateVoidFuture(), notNullValue());
    }
}