import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		a=sc.nextInt();
        b=sc.nextInt();
        
        if (a-b == 1 | a-b == -2){
        	System.out.print("A");
        }
        else{
            System.out.print("B");
        }
		
	}
}