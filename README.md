# tm1financelib

## Overview

This is a library of 'wrapper' functions to calculate the various financial functions in TM1 / Planning Analytics via Java extensions. These functions are calling Apache POI (https://en.wikipedia.org/wiki/Apache_POI) implementations for their Excel analogues.

See more details on:
https://ykud.com/blog/cognos/tm1-cognos/java-tm1-extensions-tm1financelib-for-calculating-irr-npv-and-more

## Installation instructions

* Download tm1financelib.jar and poi jar from jar folder in this project -- select the version for your TM1 / PA version
* Copy tm1financelib.jar to TM1 server\}javaextensions\ or TM1_installation\}javaextensions (to make it available from all TM1 servers), poi jar to a place you’d keep libraries (I just put it the same place as javaextensions, just create a libraries folder next to ibm). See more details in the [IBM instructions](http://www.ibm.com/support/knowledgecenter/?lang=en#!/SS9RXT_10.3.0/com.ibm.swg.ba.cognos.tm1_turb.10.3.0.doc/c_tm1_enabling_configuring_java_extensions.html)

* Configure java in your tm1s.cfg file:
```
    JavaHome — point to the JVM shipped with TM1
    JavaClassPath — add the folder you’ve copied poi jar
```
 For example, with default Windows installation:
```
    JavaJVMPath=C:\Program Files\ibm\cognos\tm1_64\bin64\jre\7.0\bin\j9vm\jvm.dll
    JavaClassPath=C:\Program Files\ibm\cognos\tm1_64\samples\tm1\SData\}javaextensions\libraries\poi-3.14-20160307.jar
```
* Restart server and you should be able to use the functions straight away as per examples above



## Included Functions

* IRR

Syntax: IRR (guess, values)

Example usage in TI:

`vIRR = ExecuteJavaN('tm1financelib.IRR', -0.01,'-70000.00','12000','15000','18000','21000','26000');`

* NPV

Syntax: NPV(rate, values)

Example usage in TI:

`vNPV = ExecuteJavaN('tm1financelib.NPV', 0.1, '-10000.00','3000','4200','6800');`

– NPER
Syntax: nper(rate, payment in period, present value, future value, boolean type)
Example usage in TI:
`vNPV =  ExecuteJavaN('tm1financelib.NPV', 0.1, '-10000.00','3000','4200','6800');`

– PPMT
Syntax: PPMT(rate, period, number of periods, present value, future value, boolean type)
Example usage in TI:
`vPPMT = ExecuteJavaN('tm1financelib.PPMT', 0.0083333333, 1,24, 2000, 0,0);`

– IPMT
Syntax: IPMT(rate, period, number of periods, present value, future value, boolean type)
Example usage in TI:
`vIPMT = ExecuteJavaN('tm1financelib.IPMT', 0.0083333333, 1,24, 2000, 0,0);`

– DEVSQ
Syntax: DEVSQ (values)
Example usage in TI:
`vDEVSQ = ExecuteJavaN('tm1financelib.DEVSQ','-70000.00','12000','15000','18000','21000','26000');`

– AVEDEV
Syntax: AVEDEV (values)
Example usage in TI:
`vAVEDEV = ExecuteJavaN('tm1financelib.AVEDEV','-70000.00','12000','15000','18000','21000','26000');`

– MEDIAN
Syntax: MEDIAN (values)
Example usage in TI:
`vMEDIAN = ExecuteJavaN('tm1financelib.MEDIAN','-70000.00','12000','15000','18000','21000','26000');`

– VAR
Syntax: VAR (values)
Example usage in TI:
`vVAR = ExecuteJavaN('tm1financelib.VAR', '-70000.00','12000','15000','18000','21000','26000');`

– VARP
Syntax: VARP (values)
Example usage in TI:
`vVARP = ExecuteJavaN('tm1financelib.VARP', '-70000.00','12000','15000','18000','21000','26000');`

– FV
Syntax: FV (rate, payment in period, present value, future value, boolean type)
Example usage in TI:
`vFV = ExecuteJavaN('tm1financelib.FV', 0.005, 10,-200,-500,1);`

– PV
Syntax: PV(rate, number of periods, payment, future value, boolean type)
Example usage in TI:
`vPV = ExecuteJavaN('tm1financelib.PV', 0.006666667, 240,500, 0,0);`

– PMT
Syntax: PMT(rate, number of periods, present value, future value, boolean type)
Example usage in TI:
`vPMT = ExecuteJavaN('tm1financelib.PMT', 0.006666667, 10,10000, 0,0);`