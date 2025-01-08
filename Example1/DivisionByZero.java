public class DivisionByZero
{
    public static void main(String[] args) {
        try{
            int result = 10/0;
            System.out.println("Result is: "+result);
        }catch(ArithmeticException e)
        {
            System.out.println("Exception Occured: "+e);
        }
    }
}