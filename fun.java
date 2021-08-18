 
import java.util.Scanner;
public class fun
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int inp=0;
        while(1!=0)
        {
            inp=sc.nextInt();
            if(inp<0)
                break;
            if(inp%5==0)
                continue;
            System.out.println("@Shubham");
        }
    }
}
