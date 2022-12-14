/*
 * EnvService.java of the project tdosca.tc10 is licensed under the terms of the BSD-2CL:
 *
 * Copyright (C) 2022 kreincke / Deutsche Telekom AG
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation and/
 * or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package de.tdosca.common;

import java.util.Map;


public class EnvService {
    Map<String, String> env = System.getenv();
    String pwd = null;
    String inc = "------";
    public String info() {
        System.out.println(inc+"tdosca.all.EnvService(): 'hello'.");
        System.out.println(inc+"license(EnvService,B.S.D-2CL)");
        if (env != null) {
            pwd=env.get("PWD");
        }
        if (pwd!=null) {
            System.out.println(inc+"Program is started from " + pwd);
        } else {
            System.out.println(inc+"PWD not specified in the environment");
        }
        System.out.println(inc+"tdosca.all.EnvService(...): 'bye bye'");
        return "back0";
    }
}
