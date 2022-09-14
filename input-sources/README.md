# TDOSCA-TC10-SIMPLHW / release <#1.0.0#>

Copyright (C) 2022 Karsten Reincke / Deutsche Telekom AG

## Content
1. [Purpose](#pur)
2. [Prerequisites](#prq)
3. [Download](#dlo)
4. [Installation](#ins)
5. [Usage](#use)
6. [Licensing](#lic)

## 1. Purpose <a id="pur"></a>
One task of the project [Test-Driven Open Source Compliance Automation](https://github.com/Open-Source-Compliance/tdosca) is to define test cases consisting of program sources and reference compliance artifacts which - added to the program package - would ensure to distribute the open source program compliantly.

The project TDOSCA-TC10-SIMPLHW is the software input of the test case no. 12. It is part of the repository *tdosca-tc10-simplhw* and is a ***very simple hello world*** program.

## 2. Prerequisites <a id="prq"></a>
* operating system
* javare
* maven


## 3. Download <a id="dlo"></a>

You have tow options to get this test case:

* Clone the respective repository by using the command ``git clone https://github.com/Open-Source-Compliance/tdosca-tc10-simplhw``.
* Download the respective zip file by using the GitHub commands in the [tdosca-tc10-simplhw repository](https://github.com/Open-Source-Compliance/tdosca-tc10-simplhw).

## 4. Installation <a id="ins"></a>
To compile and install the program itself, do this:
* Download and unzip test case package or clone the test case repository
* Change into the directory *input-sources*
* Call
  - ``mvn clean compile test package``

## 5. Usage <a id="use"></a>
* Change into the directory *input-sources*
* Call ``mvn clean package`` and
  - ``java -jar target/tdosca-tc10-1.0.jar ``
  - or
    - ``unzip target/tdosca-tc10-1.0.zip`` and
    - ``bash tdosca-tc10-1.0/bin/tc10.sh``

## 6. Licensing <a id="lic"></a>

The *input* the project *tdosca-tc10-simplhw* is licensed under the terms of the MIT license. See the file COPYING in the top directory
