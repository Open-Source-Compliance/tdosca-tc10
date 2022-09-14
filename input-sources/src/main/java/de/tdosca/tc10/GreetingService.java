/*
 * Copyright (C) 2022 Karsten Reincke, Deutsche Telekom AG
 *
 * tdosca-tc10.GreetingService is licensed under the terms of the MIT license.
 * For details see the file COPYING in the top directory.
 */
package de.tdosca.tc10;

import de.tdosca.common.EnvService;

public class GreetingService {
    EnvService envservice = new EnvService();
    String inc = "---";
    public String greet(String garg) {
        System.out.println(inc+"tdosca.tc10.GreetingService(" + garg + "): 'hello'.");
        System.out.println(inc+"license(GreetingService,M.I.T)");
        envservice.info();
        System.out.println(inc+"tdosca.tc10.GreetingService(...): 'bye bye'");
        return "back1";
    }
    public String greet() {
        System.out.println(inc+"tdosca.tc10.GreetingService(): 'hello'.");
        System.out.println(inc+": license(GreetingService,M.I.T)");
        envservice.info();
        System.out.println(inc+"tdosca.tc10.GreetingService(...): 'bye bye'");
        return "back0";
    }
}
