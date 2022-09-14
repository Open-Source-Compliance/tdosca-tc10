/*
 * Copyright (C) 2022 K.Reincke, Deutsche Telekom AG
 *
 * tdosca-tc03a.GreetingService is licensed under the terms of the MIT license.
 * For details see the file COPYING in the top directory.
 */

package de.tdosca.tc10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingServiceTest {

    GreetingService service;

    @Before
    public void setup() {
        service = new GreetingService();
    }

    @Test
    public void testGreet1() {
        assertEquals("back0", service.greet());
    }

    @Test
    public void testGreet2() {
        assertEquals("back1", service.greet("TEST2"));
    }
}
