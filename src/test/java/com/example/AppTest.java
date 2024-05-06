package com.example;


import org.junit.Test;
import com.google.common.util.concurrent.Futures;

import static org.hamcrest.MatcherAssert.assertThat;

public class AppTest {
    @Test
    public void whenVersionCollisionDoesNotExist_thenShouldCompile() {
        assertThat(Futures.immediateVoidFuture(), notNullValue());
    }
}