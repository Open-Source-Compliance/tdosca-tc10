# TDOSCA-TC10 

**Test-Driven Open Source Compliance Automation Test Case No. 10: a Simple Hello World with JAVA and maven**

## General Context
The "Test-Driven Open Source Compliance Automation" is an initiative initiated by Deutsche Telekom AG and hosted and driven by the [Open Chain Reference Tooling Work Group](http://oss-compliance-tooling.org/).

![openchain-reference-tooling-work-group-logo.png](img/logo.png)

The project scope statement and further information of ***TDOSCA*** can be found at [https://github.com/Open-Source-Compliance/tdosca](https://github.com/Open-Source-Compliance/tdosca).

## Test Case Definition

### Structure

This test case follows the general pattern of a TDOSCA test case:
* It has its own repository [https://github.com/Open-Source-Compliance/tdosca-tc10-simplhw](https://github.com/Open-Source-Compliance/tdosca-tc10-simplhw)
* and contains the following parts:
  - **compliance-traps.md**: *describes the traps / challenges implemented by and in the test case* [used to manually control whether a tested compliance tool really overcomes all difficulties]
  - **input-sources**: *contains all sources to create the distributable (binary package)* [used by the tested tool to create the compliance artifacts]
  - **README.md**: *this file*
  - **reference-compliance-artifacts**: *contains the compliance artifacts a sufficient tool (chain) is expected to generate*
    - **bom.csv**: *a list of all differently licensed open source components of a package* (will be added, if the format is approved)
    - **oscf.md**: *the open source compliance file* [fulfills the compliance requirements if combined with the distributed source- or binary package]
    - **prerequisites.csv**: *a list of preinstalled tools and libs, required by the software but not delivered as part of the software package*

### Intention

The test data of this test case (the program sources in ``input-sources``

* can be compiled, installed and used by the respective maven commands
* consist of three java files (*Main.java*, *GreetingService.java* and *EnvService.java*) and the respective maven artifacts to use them
* ``Main`` includes ``GreetingService`` includes ``EnvService``. Each part says *Hello*
* The default project license is the MIT license,
* But all files in de.tdosca.common (= *EnvService.java* ) are licensed under the BSD-2-Clause.
* The JUnit tests are licensed respectively.
* For specific challenges of this test case the [compliance-traps.md](compliance-traps.md)


## Licensing Statement

(c) 2022, Karsten Reincke, Deutsche Telekom AG

* The software delivered as content of the test case directory ``input-sources`` is licensed under the licenses the test case uses to challenge the compliance tools. Contributions take place under the same licenses.

* Unless otherwise specified, all other files are distributed under the terms of the [CC-BY-4.0 license](https://creativecommons.org/licenses/by/4.0/): If you share or adapt the test case or files of it, please add the attribution: "based on [https://github.com/Open-Source-Compliance/tdosca-tc10-simplhw](https://github.com/Open-Source-Compliance/tdosca-tc10-simplhw) initiated by Deutsche Telekom AG"
