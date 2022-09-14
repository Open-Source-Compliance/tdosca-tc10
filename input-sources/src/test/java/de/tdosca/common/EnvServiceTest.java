/*
 * EnvServiceTest.java of tdosca-tc03a is licensed under the terms of the BSD-2CL:
 *
 * Copyright (C) 2022 kreincke / Deutsche Telekom AG
 */

package de.tdosca.common;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnvServiceTest {

    EnvService service;

    @Before
    public void setup() {
        service = new EnvService();
    }

    @Test
    public void testGreet1() {
        assertEquals("back0", service.info());
    }

}
