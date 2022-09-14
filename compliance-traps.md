# Compliance Traps of TDOSCA-TC10-SIMPLHW

The test case input (= open source software)

* constantly claims to be licensed under the MIT license, but the class file ``envService.java`` and ``envServiceTest.java`` are divergently licensed under the BSD-2-Clause
* is licensing the file envService.java under a 'wrong', but well known and often used SPDX identifier BSD-2CL
* integrates the BSD-2-Clause license text into the file header
* delivers its default license text in a file named COPYING although this is normally only be done by GNU software
* the file COPYING contains the text of the MIT license, but does not declare to be the MIT license
* uses the names "Karsten Reincke", "kreincke", "K.Reincke" but due to the fact, that only the MIT-Licence and the BSD-2CL-License may be integrated into the OSCF file, none of the respective copyright lines may appear.
