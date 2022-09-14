/*
 * Copyright (C) 2022 Karsten Reincke, Deutsche Telekom AG
 *
 * tdosca-tc10.main is licensed under the terms of the MIT license.
 * For details see the file COPYING in the top directory.
 */

package de.tdosca.tc10;

public class Main {
    public static void main(String[] args) {
        GreetingService service = new GreetingService();
        System.out.println("tdosca.tc10.Main: 'hello'.");
        System.out.println("license(Main,M.I.T)");
        if ((args == null) || (args.length == 0)){
            service.greet();
        }
        else {
            service.greet(args[0]);
        }
        System.out.println("tdosca.tc10.Main: 'bye bye'");
    }
}
