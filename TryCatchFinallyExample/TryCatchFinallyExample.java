package TryCatchFinallyExample;

public class TryCatchFinallyExample {
public static void main(String[] args) {
    try{
        int a = 8/0;
        System.out.println("The value of a is: "+a);
    }catch(ArithmeticException e)
    {
        System.out.println("Exception due to: "+e);
    }
    finally{
        System.out.println("Next line of code are getting executed");
    }
}
}
/**In java try block is used to handle the line of codes which might throw exception, If exception occured
 * it is handled by the corresponding catch block , so catch block handle the exception without stopping the 
 * the flow of a code there itself
 * And Finally block will get executed irrespective of whether or not exception occured or not 
 * Finally block can be used for cleanup process, like closisng file or relasing database connection
 * Finally block is executed also when there is any return statement in try OR catch block
 * Only condition where finally is executed 
 * a) calling System.exit() before reaching the finally
 * b) Or Crash of JVM due to external factors like  running out of memory
 *  */ 
