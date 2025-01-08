# ExceptionHandlingInJava
Code Samples to cover all the topics in Java Exception Handling 
Hirarchy of Exception Handling 
Throwable
 - Errror (OutOfMemoryError)
 - Exception
    * IO Exception
    * SQL Exception
    * RunTimeException(class extending RTE can be also called as UnCheckedException and compiler 
                       does not force to handle this exception)
-------------------------------------------------------------------------------------------
UncheckedException Vs CheckedException
UCE are the one which are not checked at compile-time. This are all Exceptions which extends RunTimeException like NullPointerException, AE, AIOOBE. This occurs due to programming negligence and can be avoided by good coding practice
CE, on the other hand are the one checked at compile-time. These Exceptions must be handled with a try-catch or by declaring throws keyword in method signature, IOException, SQLException. 