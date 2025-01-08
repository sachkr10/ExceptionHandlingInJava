package CustomExceptionExample;

public class VoterAgeLimitCheck extends Exception {
    public VoterAgeLimitCheck(String message){
        super(message);
    }
}
 class CheckAge
{
    public static void main(String[] args) {
        validateAge(17);
    }
    public static void validateAge(int age)
    {
        try{
            if(age<18)
            {
                throw new VoterAgeLimitCheck("Not Eligible");
            }
            else{
                System.out.println("Congratulation! You can cast your vote:");
            }
        }catch(VoterAgeLimitCheck exception)
        {
            System.out.println(exception.getMessage());
        }
        
    }
}
